import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int i=1;
			int t=0;
			int n1=n/2+1;
			int n2=n-n1;
			while(i<=n1) {
				int j=1;
				while(j<=n1-i) {
					System.out.print(" ");
					j++;
				}
				j=1;
				
				while(j<=i+t) {
					System.out.print("*");
					j++;
				}
			System.out.println();
			i++;
			t++;
			
			}
			
		int i1=1;
		int newN=n2+1;
		while(i1<=n2) {
			int j=1;
			while(j<=i1) {
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=n2-i1+1) {
				System.out.print("*");
				j++;
			}
			j=1;
			while(j<=n2-i1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i1++;
		}
	}

}
