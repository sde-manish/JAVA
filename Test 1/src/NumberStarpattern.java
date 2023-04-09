import java.util.Scanner;

public class NumberStarpattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
 
        while(i<=n){
            int j=1;
            int c=n-i;
            while(j<=c){
                System.out.print(n);
                j++;
                n--;
            }
            System.out.print("*");
            j=1;
            int t=i-1;
            while(j<=t){
                System.out.print(t);
                j++;
                t--;
            }
            System.out.println();
    		i++;  
        } 
	}

}
