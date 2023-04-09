package For_loop;
import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
	        int binary=s.nextInt();
	        
	        int decimal=0;
	        int pv=1; /* pv=place value */
	        while(binary>0){
	            
	            decimal=decimal+(binary%10)*pv;  /* 1st step is to take out all the digit 
	            									seperately and then multiply each by their
	            									 place value,then add them all together. */
	            binary=binary/10;
	            pv=pv*2;
	        }
	        System.out.println(decimal);
	        
	}

}
