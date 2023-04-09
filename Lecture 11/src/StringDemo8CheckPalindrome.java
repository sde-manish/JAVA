import java.util.Scanner;

public class StringDemo8CheckPalindrome {
	
	
	 public static boolean ispalindrome(String str) {
		 System.out.println("Second method output: ");
		   
		 int i=0,j=str.length()-1;
		 while(i<=j) {
			 if(str.charAt(i)!=str.charAt(j)) {
				 return false;
			 }
			 else {
				 i++;j--;
			 }
		 }
		 
		 return true;
	}

	public static String reverseString(String str) {
		
		String reversedString="";
		for(int i=str.length()-1;i>=0;i--) {
			reversedString+=str.charAt(i);
		}
		return reversedString;
		
	}
	
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		 String str=s.nextLine();
		 
		 String reversedString=reverseString(str);
		 
		 boolean equal=str.equals(reversedString);
		 if(equal) {
			 System.out.println("palindrome");
		 }
		 else {
			 System.out.println("Not palindrome");
			
		 }
		 
		  /* or by traveling from begining to last and last to begining character and matching them, 
		   * if they match the string is palindrome otherwise not*/
		
		 boolean ispalindrome=ispalindrome(str);
		 System.out.println(ispalindrome);

	}
}
