package Array;

import java.util.Scanner;

public class PrintingInput {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size=s.nextInt();
		// creating an array of size given by the user
		int arr[]=new int[size];
		// taking the elements of array from user 
		for(int i=0;i<size;i++) {
		System.out.println("Enter the "+i+"th element:");
			arr[i]=s.nextInt();
		}
	
		for(int i=0;i<size;i++) {
			
			System.out.print(arr[i]+"\t");
		}
	}

}
