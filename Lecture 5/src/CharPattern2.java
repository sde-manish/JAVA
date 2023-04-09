import java.util.Scanner;

public class CharPattern2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			char startingChar=(char)('A'+i-1);
			while(j<=n) {
				System.out.print((startingChar));
				startingChar=(char)(startingChar+1); //we can write "startingChar++" also and it does not require typecasting
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
