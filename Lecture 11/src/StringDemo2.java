
public class StringDemo2 {

	public static void main(String[] args) {
		
		//concatenation of Strings
		String str1="coding";
		String str2=" is fun";
		
//		 str1=str1+str2; (or) 
//		 str1+=str2; (or)
//		str1=str1.concat(str2);
		
		System.out.println(str1);
		
		String str3="coding";
		String str4="aoding";
		String str5="eoding";
		
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		
		// trying ".compareTo" function
		
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareTo(str4));
		System.out.println(str1.compareTo(str5));
		
		String str6="ing";
		
		System.out.println(str1.contains(str6));
		//or
		System.out.println(str1.contains("ing"));
	}

}
