import java.util.Scanner;

public class TriangleofNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            j=1;
            int st=i;
            while(j<=i){
                System.out.print(st);
                j++;
                st++;
            }
            j=1;
            int st2=2*i-2;
            while(j<=i-1){
                System.out.print(st2);
                j++;
                st2--;
            }
            System.out.println();
            i++;
        }

	}

}
