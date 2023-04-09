package Array;

public class LinearSearch {
	
	 public static int linearSearch(int arr[], int x) {
			//Your code goes here
	        
	        for(int i=0;i<=arr.length-1;i++){
	            if(arr[i]==x){  
	                return i;
	            }
	        }    
	        return -1;
	    }

	public static void main(String[] args) {
	
	  int arr[]= {1,4,5,6,8};
	  int x=4;
	  
	  int linearsearch=linearSearch(arr,x);
	  System.out.println(linearsearch);
	  
	  
		
	}

}
