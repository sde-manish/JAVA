import java.util.Scanner;

public class CheckArmstrong {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rem = 0, count = 0;
        int temp = n;
        while (temp > 0) {
            rem = temp % 10;
            temp /= 10;
            count++;
        }
        rem = 0; temp = n;
        int result = 0;
        while (temp > 0) {
            rem = temp % 10;
            result += Math.pow(rem, count);
            temp /= 10;
        }
      
     System.out.println(n==result);

	}

}
