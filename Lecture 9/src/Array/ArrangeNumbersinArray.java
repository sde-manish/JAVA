/*You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.
Sample Input 1 :
1
6
Sample Output 1 :
1 3 5 6 4 2*/

package Array;
import java.util.Scanner;

public class ArrangeNumbersinArray {

	 public static int[] arrange(int[] arr, int n) {
	        //Your code goes here
	        int idx=0;
//	        System.out.print(arr.length + " ");
	        for (int i=1;i<=n;i=i+2)
	        {
	            arr[idx]=i;
	            System.out.print(arr[idx]+ " ");
	            idx=idx+1;
	        }
	        int i=0;

	        if (n%2==0){
	            // i=n;
	            for (i=n;i>=2;i=i-2){
	            arr[idx]=i;
	            System.out.print(arr[idx]+ " ");
	            idx=idx+1;
	            }
	        }
	        else{
	            // i=n-1;
	             for (i=n-1;i>=2;i=i-2){
	            arr[idx]=i;
	            System.out.print(arr[idx]+ " ");
	            idx=idx+1;
	             }    
	        }

//	         for (;i>=2;i=i-2)
//	         {
//	             arr[idx]=i;
//	             //System.out.print(arr[idx]+ " ");
//	             idx=idx+1;

//	         }
	        //System.out.println("");
	        
	        return arr;

	    }
	 public static void main(String args[]) {
		 
		 Scanner s=new Scanner(System.in);
		 int size=s.nextInt();
		 int Array[]=new int[size];
		 System.out.println(arrange(Array,size));
	 }
}
