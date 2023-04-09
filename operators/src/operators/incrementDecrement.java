package operators;

public class incrementDecrement {

	public static void main(String[] args) {
		int a=10;
		System.out.println(++a);
		a++;
		++a;
		System.out.println(a++);
		int b=++a;
		int c=a++;
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
		a=4;
		a*=2;
		System.out.println(a);
		a^=2;
		System.out.println(a);
	}

}
