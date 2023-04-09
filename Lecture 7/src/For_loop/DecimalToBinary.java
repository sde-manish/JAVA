package For_loop;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		
		  Scanner s=new Scanner(System.in);
			
			int n=s.nextInt();
			
		long ans=0;		/*The "long" contains minimum value of -263 and a maximum value of 263-1. Its default
	        			value is 0L. Its default size is 8 byte. It is used when you need a "higher range 
	        			integer value".*/
			long pv=1;
			
			while(n>0) {
				int rem=n%2;
				ans=ans+rem*pv;
				pv=pv*10;
				n=n/2;
				
			}
			System.out.println(ans);

	}

}
