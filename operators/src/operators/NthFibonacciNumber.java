package operators;

import java.util.Scanner;

public class NthFibonacciNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int i=1;
		int a=1;
		int b=1;
		int c=0;
		if(n==1) {
			System.out.println(a);
			return;
		}
		if(n==2) {
			System.out.println(b);
			return;
		}
		while(i<=n-2) {
			 c=a+b;
			 System.out.println(c);
			 a=b;
			b=c;
			i=i+1;
			
		}
		System.out.println(c);
	}

}
