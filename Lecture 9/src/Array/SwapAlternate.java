package Array;
import java.util.Scanner;
public class SwapAlternate {

	 public static int[] swapAlternate(int[] input) {

			for(int i=0;i<input.length;i+=2) {
				
	            if(i==input.length-1 && i%2==0){
	                break;
	            }   
				int temp=input[i];
				input[i]=input[i+1];
	            input[i+1]=temp;
				
				
				
			}
			return input; 
			
	    }
	public static int[] arr() {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
public static void main(String args[]) {
	
	int Arr[]=arr();
	int newArr[]=swapAlternate(Arr);
	 
//	System.out.println(newArr);  /* to print an array in java, you always need to print one by one element. */
	for(int i=0;i<newArr.length;i++) {
		System.out.print(newArr[i]+" ");
	}
	
	}

}


