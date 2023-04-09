import java.util.Scanner;

public class ZerosStars {

	public static void main(String[] args) {
		
			Scanner s = new Scanner(System.in);
			        int n = s.nextInt();
			        int m = (2 * n) + 1;
			        
			        for (int i = 1; i <= n; i++) {
			            for (int j = 1; j <= m; j++) {
			                if (j == i || j == m - i + 1 || j == (m / 2) + 1) {
			                    System.out.print("*");
			                }
			                else {
			                    System.out.print(0);
			                }
			            }
			            System.out.println();
			        }
			    
	}

}
