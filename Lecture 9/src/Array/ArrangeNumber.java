package Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrangeNumber {
	 public static void main(String args[]) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter the array size: ");
		 int n=s.nextInt();
		 int arr[] =new int[n];
		 System.out.println("Enter the array element: ");
		 for(int i=0;i<n;i++) {
			 arr[i]=s.nextInt();
			
		 }
		 System.out.println("You entered the array:"+Arrays.toString(arr));  // converting array to string to print
		 
		 for(int i=0;i<n;i++) {		 
			 int small=arr[i];
			 int pv=i;
			 for(int j=i;j<n;j++) {
				
				 if(arr[j]<small) {
				 small=arr[j];
				 pv=j;     //place value or index value
				 }
			 
			 	}
		   
		   arr[pv]=arr[i];
		   arr[i]=small;
		   System.out.print(arr[i]+" ");
		 }
		 

	 }

}
