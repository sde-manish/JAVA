package if_else;
import java.util.Scanner;
public class Largestofthree {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
//	if(a>=b && a>=c) {
//		System.out.println(a+" is largest");
//	}else {
//		if(b>=a && b>=c) {
//			System.out.println(b+ " is largest");
//		}else {System.out.println(c+" is largest");
//		
//		}
//	}
	if(a>=b && a>=c) {
		System.out.println(a);
	}else if(b>=a && b>=c) {
		System.out.println(b);
	}else {
		System.out.println(c);
	}
	}
}
