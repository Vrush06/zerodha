package Mock_prac;

import java.util.Arrays;

public class Min_Arraynumber {
	
	public static int minimun(int []a,int total) {
		Arrays.sort(a);
		return(a[0]);
	}

	public static void main(String[] args) {
		int a[]= {53,5,55,23,2,85,3};
		System.out.println(a.length);
		System.out.println("min: "+minimun(a,7));
	}
}
