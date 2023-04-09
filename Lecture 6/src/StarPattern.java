import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int t=0;
        while(i<=n){
            int j=1;
           
            while(j<=n-i){
                System.out.print(" ");
				j++;
            }
            j=1;
            while(j<=i+t){
                System.out.print("*");
				j++;
            }
        System.out.println();
        i++;
        t++;
        }
	}

}
