import java.util.Scanner;
public class SIcalculatorwithuserinput {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int p=s.nextInt();
		int r=s.nextInt();
		int t=s.nextInt();
		String str = s.next();
		int SI=(p*r*t)/100;
		System.out.println(SI);
	}

}
