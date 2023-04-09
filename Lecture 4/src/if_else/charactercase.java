//Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
//1, if the character is an uppercase alphabet (A - Z)
//0, if the character is a lowercase alphabet (a - z)
//-1, if the character is not an alphabet
package if_else;
import java.util.Scanner;
public class charactercase {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
        
//        if(c>='A' && c<='Z'){
//            System.out.println("1");
//        }else if(c>='a'&& c<='z'){
//            System.out.println("0");
//        }else{
// 			System.out.println("-1");           
//        }
        // OR
        int a=c;
        if(c>=97 && c<=122) {
        	System.out.println("1");
        }
        else if(c>=65 && c<=90) {
        	System.out.println("0");
        }
        else {
        	System.out.println("-1");
        }
    }
}