package while_loop;
import java.util.Scanner;
public class SumOfNNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		// we can use formula for this: (n(n+1))/2
		
		int sum=0;
		int i=1;
		while(i<=n) {
			sum=sum+i;
			i=i+1;
		}
		System.out.println(sum);

		
	}

}
