package while_loop;
	import java.util.Scanner;
	public class FahrToCelTable {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
	        
	        int S=sc.nextInt();
	        int E=sc.nextInt();
	        int W=sc.nextInt();
	        int c;
	        while(S<=E){
	            c=(5*(S-32))/9;
	            System.out.println(S+" "+c);
	            S=S+W;
	        }
			
			
		}

	}
