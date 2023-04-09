
public class scope1 {

	public static void main(String[] args) {
		int i =10;
		System.out.println(i);

		//		int i=12;
	
		if(i==10) {
			int n=23;
			System.out.println(n);
		}
		int n=4;
		System.out.println(n);
		
		i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(j);
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
	}

}
