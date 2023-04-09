import java.util.Scanner;
import java.lang.Math;
public class TotalSalary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	       int basic=s.nextInt();
		        String grade=s.next();
		        char grd=grade.charAt(0);
				int allow=0;
				
		          if(grd=='A'){
		            allow=1700;
		        }else if(grd=='B'){
		            allow=1500;
		        }else {
		            allow=1300;
		        }
	        double hra = 0.2*basic;
	        double da = 0.5*basic;
	        double pf= 0.11*basic;
		        double total=basic+ hra+da+allow-pf;
		        int p=(int)(Math.round(total));
		     //  int h=(int)(p);
		        System.out.println(p);


        
	}

}
