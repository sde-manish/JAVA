package functions;

public class Increment {
//	public static int square(int a){
//	    int ans = a * a;
//	    return ans;
//	}
//
	public static void main(String[] args) {
//	    int a = 4;
//	    a = square(a);
//	    System.out.println(a);
	
	
		int i = 1;
		while(i < 3) {
		    int j = 0;
		    while(j < 5) {
		        j++;
		        if(j == 3) {
		            continue;
		        }
		        System.out.print(j + " ");
		    }
		    i++;
		}
	
	}

}
