package For_loop;
import java.util.Scanner;
public class SumOrProduct {
	public static void main(String [] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value of N :");
		int n=s.nextInt();
		System.out.println("Enter '1' for 'SUM' or Enter '2' for 'PRODUCT' :");
		int c=s.nextInt();
		
		int sum=0;
		int product=1;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
			product=product*i;
			
		}
		
		if(c==1) {System.out.println(sum);
		}
		else{	
			if(c==2) {
			System.out.println(product);
			}
			else {System.out.println("-1");
	
			}
		}
	
	}

}
