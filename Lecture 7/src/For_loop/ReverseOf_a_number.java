package For_loop;
import java.util.Scanner;
public class ReverseOf_a_number {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int rev=0;
//		while(n>0) {
//			
//			rev=rev*10+(n%10);
//			n=n/10;
//					
//		}
//		System.out.println(rev);
//		
		
		for(int i=1;i<=n+1;i++) {
			
			rev=rev*10+(n%10);
			n=n/10;
			
		}
		System.out.println(rev);
		

	}

}
