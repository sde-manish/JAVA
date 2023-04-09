package Break_Continue;
import java.util.Scanner;
public class SquareRoot_integer_only {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=0;
		int sr=0;
		while(sr<=n) {
			
			sr=i*i;
			if(sr>n) { 
				i--;
				break;
			}
			i++;
		
			
		}
		System.out.println(i);
	}
 
}
