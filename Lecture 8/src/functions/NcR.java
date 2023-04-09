package functions;

import java.util.Scanner;

		//**********//
 /* this is a function to calculate factorial of a number*/
public class NcR {
	public static int factorial(int n) {
		int ans=1;
		for(int i=1;i<=n;i++) {
			ans=ans*i;
		}
		return ans;
	}
		//***********//
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 int r=s.nextInt();
		 
//		 int num=1;		//numerator=1
//		 for(int i=1;i<=n;i++) {
//			 num=num*i;
//		 }
//		 
//		 int den1=1;		//denominator1=1
//		 for(int i=1;i<=r;i++) {
//			 den1=den1*i;
//		 }
//		 
//		 int den2=1;		//denominator2=1
//		 for(int i=1;i<=n-r;i++) {
//			 den2=den2*i;
//		 }
		 
		 int num=factorial(n);
		 
		 int den1=factorial(r);
		 
		 int den2=factorial(n-r);
		 
		 	
		 int ans=num/(den1*den2);
		 System.out.println(ans);
	}

}
