package functions;

import java.util.Scanner;

public class FahrenheittoCelsiusTable {
	public static void FCTable(int S,int E,int W) {
		while(S<=E) {
			int c=((5*(S-32))/9);
			System.out.println(S+" "+c);
			S=S+W;
		}
		return ;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int S=s.nextInt();
		int E=s.nextInt();
		int W=s.nextInt();
		FCTable(S,E,W);
		
	}

}
