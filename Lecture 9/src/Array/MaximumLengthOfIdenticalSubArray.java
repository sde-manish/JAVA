package Array;
import java.util.Scanner;

public class MaximumLengthOfIdenticalSubArray {
	
		public static int MaximumLength(int arr[],int n) {
		
			int ML=0;			/* ML-Maximum length */
			int CL=1;  		/* CL-Current length */
		 
		 for(int i=0;i<arr.length-1;i++) {
			 
			 if(arr[i]==arr[i+1]) {
				 CL=CL+1;
				 
			 	}
			 else {
				 CL=1;
			 	}
			 if(ML<CL){
				 ML=CL;	 
			 }
		 }
		 return ML;
		}
		public static void main(String [] args) {
			Scanner s=new Scanner(System.in);
			System.out.print("Enter the size of the array: ");
			int len=s.nextInt();
			int array[]=new int[len];
			System.out.print("Enter the Elements of the array: ");
			for(int i=0;i<len;i++) {
				array[i]=s.nextInt();			
			}
			System.out.print(MaximumLength(array,len));
	
  		}
	}


