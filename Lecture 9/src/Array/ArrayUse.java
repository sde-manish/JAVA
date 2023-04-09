package Array;

public class ArrayUse {

	public static void main(String[] args) {
		
		int n=10;
		int arr[]=new int[n];
//		arr[3]=15;
//		System.out.println(arr[3]);
		System.out.println(arr[0]);
		System.out.println(arr[5]);
		
	// creating other type of array
		char chArr[]=new char[11];
		double dArr[]=new double[12];
		chArr[0]='a';
		dArr[0]=1.2;
		System.out.println(chArr[0]);
		System.out.println(dArr[0]);
		
	//creaating boolean array 
		boolean bArr[]=new boolean[5];
		System.out.println(bArr[0]);
	}

}
