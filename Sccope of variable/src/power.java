import java.util.Scanner;
public class power {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        
        int x=s.nextInt();
        int n=s.nextInt();
        int p=1;
        int i=1;
        if(x==0 && n==0){
            System.out.println(" 1");
        }else{{
        	while( i<=n) 

        	{
            p=p*x; i=i+1;
            }
       
        }
        System.out.println(p);}
	}

}
