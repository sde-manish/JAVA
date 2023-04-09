import java.util.Scanner;
public class averagemarks {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String n =s.next();
		int m1 = s.nextInt();
		int m2 = s.nextInt();
		int m3 = s.nextInt();
		int avr = (m1+m2+m3)/3;
		System.out.println(n);
		System.out.println(avr);
	}

}
