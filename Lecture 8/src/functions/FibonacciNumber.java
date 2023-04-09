package functions;

import java.util.Scanner;

public class FibonacciNumber {

		public static boolean checkMember(int n) {
			int a=0;
			int b=1;
			int f=1;
	        while(f<=n){
	            f=a+b;
	            if(f==n){
	                return true;
	            }
	            a=b;
	            b=f;
	        }
	        return false;
					
		
		}
	    public static void main(String[] args){
	        Scanner s=new Scanner(System.in);
	    	int n=s.nextInt();
	        
	    
		}
	}


