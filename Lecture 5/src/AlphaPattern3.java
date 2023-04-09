import java.util.Scanner;

public class AlphaPattern3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            char stchar=(char)('A'+n-i);
            while(j<=i){
                System.out.print(stchar);
                stchar++;
                j++;

            }
            System.out.println();
            i++;
        }

	}

}
