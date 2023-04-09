package functions;

import java.util.Scanner;

public class PrintTillN {
	public static void printtilln(int n) {
		if(n<=0) {
			return;
		}
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
//		int ans=printtilln(n);
//		System.out.println(ans)
		printtilln(n);
	}

}
