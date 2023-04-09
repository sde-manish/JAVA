import java.util.Scanner;
public class printcharacterfori {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String str1=s.nextLine();
		 for(int i=0;i<str1.length();i++) {
			 for(int j=0;j<=i;j++) {
				 System.out.print(str1.charAt(j));
			 }
			 System.out.println();
		 }

	}

}
