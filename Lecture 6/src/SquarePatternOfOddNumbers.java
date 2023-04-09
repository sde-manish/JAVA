import java.util.Scanner;

public class SquarePatternOfOddNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int i=1;
		while(i<=n) {
			int odd=2*i-1;
			int j=1;
			while(j<=n-i+1) {
				System.out.print(odd);
				odd=odd+2;
				j++;
			}
			j=1;
			int p=1;
			while(j<=i-1) {
				System.out.print(p);
				p=p+2;
				j++;
			}
			System.out.println();
			i++;
		}
	
	
	
	 
	}

}
