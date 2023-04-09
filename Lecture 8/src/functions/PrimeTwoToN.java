package functions;

import java.util.Scanner;

public class PrimeTwoToN {
	
	public static boolean isprime(int n) {
		
		for(int d=2;d<n;d++) {
			if(n%d==0) {
				return false;
			}
			
		}
		return true;
	}
	
	public static void printprimes(int n) {
		for(int i=2;i<=n;i++) {
			boolean isIprime=isprime(i);
			if(isIprime) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		printprimes(n);
	}

}
