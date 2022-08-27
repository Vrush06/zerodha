package Mock_prac;

public class Array {
	
	public static void main(String[] args) {
		
		int ar[]= {10,60,30,40,50};
		
		for(int i=0;i<=ar.length-1;i++) {
			//System.out.print (ar[i]);
			System.out.println(ar[0]);
			
			if(ar[i+1]>ar[i]) {
			System.out.println(ar[i]);
			}
		}
		
		
	}

}
