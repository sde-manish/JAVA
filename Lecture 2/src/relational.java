import java.util.Scanner;
public class relational {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i = s.nextInt();
		int j = s.nextInt();
		boolean iseq =(i==j);
		boolean neq =(i!=j);
		boolean isgr=(i>j);
		boolean isgreq=(i>=j);
		boolean isless=(i<j);
		boolean islesseq =(i<=j);
		
		System.out.println("is equal: "+iseq);
		System.out.println("is not equal :" +neq);
		System.out.println("is greater: "+isgr);
		System.out.println("is greater equal: "+isgreq);
		System.out.println("is lesser: "+isless);
		System.out.println("is lesser equal: "+islesseq);

	}

}
