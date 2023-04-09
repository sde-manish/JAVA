/*You have been given an integer array/list(ARR) of size N which contains numbers from 
0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list
constitutes values ranging from 0 to 3 and among these, there is a single integer value
that is present twice. You need to find and return that duplicate number present in the
array.*/

package Array;
import java.util.Scanner;
public class FindDuplicate {

	 public static int duplicateNumber(int arr[]) {
	    	int CE=0;
	        for(int i=0;i<=arr.length-2;i++){
	           CE=arr[i];
	            int j;
	            for( j=0;j<=arr.length-2;j++){
	                if(j==i){
	                    continue;
	                	}
	                if(arr[j]==CE){
	                    break;
	                	}
	                      
	            }
	              if(CE==arr[j]){
	              return CE;
	            	}
	            
	        }
	        return -1;
	        
	    }

	 public static void main(String [] args) {
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 int Arr[]=new int[n];
		 for(int i=0;i<n;i++) {
			 Arr[i]=s.nextInt();
		 }
		 System.out.println(duplicateNumber(Arr));
	 
	 }

}



