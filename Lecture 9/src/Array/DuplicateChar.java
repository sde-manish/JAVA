package Array;



public class DuplicateChar {
	
	public static void main(String[] args) {
		
		char Arr1[]= { 'A','B','C','D'};
		char Arr2[]= { 'P','Q','A','D'};
		
		for(int i=0;i<Arr1.length;i++) {
			char CE=Arr1[i];
			for(int j=0;j<Arr2.length;j++) {
				if(CE==Arr2[j]) {
					
					System.out.println(CE+"-"+j);
					break;
					
				}
				else if(j==Arr2.length-1) {
					System.out.println(CE+"-NA");
					
				}
			}
		}
	}

}
