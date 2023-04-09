package Break_Continue;

public class ContinueDemo {

	public static void main(String[] args) {
		int n=10;
		int i=1;
		while(i<=n) {
			if(i==5) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}	
	
	
	}

}
