package Break_Continue;
import java.util.Scanner;
public class CheckNumberSequence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int prev = s.nextInt();
        boolean isDec = true;
        for(int i=1;i<n;i++){
            int curr = s.nextInt();
            if(prev == curr){
                System.out.println(false);
                return;
            }else if(prev < curr){
                if(isDec){
                    isDec = false;
                }
            }else{
                    if(!isDec){
                        System.out.println(false);
                        return;
                    }
            }
            prev = curr;
        }
        System.out.println(true);

	}

}
