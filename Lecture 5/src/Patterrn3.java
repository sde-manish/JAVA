import java.util.Scanner;
public class Patterrn3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		
//		while(i<=n) {
//			int j=1;
//			while(j<=i) {
//			System.out.print(i+j-1);
//			j++;
//			}
//			System.out.println();
//			i++;
//		}
		
//				****OR****
		
		while(i<=n) {
			int j=1;
			int startnum=i;
			while(j<=i) {
				System.out.print(startnum);
				startnum++;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
