import java.util.Scanner;

public class HalfDiamondPattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n+1) {
			System.out.print("*");
			int j=1;
			while(j<i) {
				System.out.print(j);
				j++;
			}
			j=1;
			int st=i-2;
			while(j<=i-2) {
				System.out.print(st);
				j++;
				st--;
				
			}
			if(i>1) {
				System.out.print("*");
			}
			System.out.println();
			i++;
		}
		i=1;
		while(i<=n) {
			System.out.print("*");
			int j=1;
			int st1=n-i-1;
			while(j<=n-i) {
				System.out.print(j);
				j++;
			}
			j=1;
			while(j<=n-i-1) {
				System.out.print(st1);
				j++;
				st1--;
			}
			if(i<=n-1) {
				System.out.print("*");
			}
			System.out.println();
			i++;
		}
		
	}

}
