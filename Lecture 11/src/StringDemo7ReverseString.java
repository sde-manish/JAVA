
public class StringDemo7ReverseString {

	public static String reverseString(String str) {
		
		String reversedString="";
		
		/* reversing string by traveling from last char to begining char */
		
//		for(int i=str.length()-1;i>=0;i--) {
//			reversedString+=str.charAt(i);
//		}
		
		
		/* reversing string by traveling from last char to begining char */
		
		for(int i=0;i<str.length();i++) {
			reversedString=str.charAt(i)+reversedString;
		}
		return reversedString;
		
	}
	
	public static void main(String[] args) {
		String str="abcde";
		String reversedString=reverseString(str);
		System.out.println(reversedString);
		
		
	}

}
