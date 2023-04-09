
public class StringDemo3 {

	public static void main(String[] args) {
	
		String str1="coding";
		System.out.println(str1.substring(4));
		System.out.println(str1.substring(2));
		System.out.println(str1.substring(6));
		
		// finding the length of the substring
//		String substr=str1.substring(5);
		
		String substr=str1.substring(1,5); // here 5 is exclusive,5th index character will not be 
										   //printed.if we want to print the 5th char we can give
										   //the index value like "str1.substring(1,6)"
		System.out.println(substr);
		System.out.println(substr.length());
		
		
	}

}
