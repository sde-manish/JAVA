package For_loop;
import java.util.Scanner;
public class TermsofAP {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		
		for(int i=1;i<=x;i++) {
			int term=3*i+2;
			if(term%4==0) {
				x=x+1;
				continue;
			}
			else {
				System.out.print(term+" ");
			}
			
		}
		
	}

}
