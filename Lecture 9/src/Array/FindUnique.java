/*in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.
*/
package Array;
import java.util.Scanner;
public class FindUnique {

	 public static int findUnique(int[] arr){
			int CE=0;        //  current element
	        int unique=0;
	        System.out.println(arr.length);
	        for(int i=0;i<arr.length;i++){
	            	CE=arr[i];//1
	            int j;
	            	for( j=0;j<arr.length;j++){
	                
	                		if(j==i){
	                    	continue;
	                				}
	                		else  { 
	                            	if(CE==arr[j]){
	                    			break;
	                					}
	                				
	            				}
	           
	        	}
	       if(j==arr.length){
	              return CE;
	            	}
	        
	    	}
	          return -1;
	        
	    }
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int Arr[]=new int[n];
		for(int i=0;i<n;i++) {
			Arr[i]=s.nextInt();
		}
		System.out.println(findUnique(Arr));

	}

}
