package Mock_prac;

import java.util.Arrays;

public class Maxeasy {
	
	public static int maxe(int [] a,int total) {
		Arrays.sort(a);
		return a[total-1];
	}
	public static void main(String[] args) {
		int a[]= {20,56,42,316,58,86,87};
		System.out.println(a.length);
		System.out.println("Max: "+maxe(a,7));
	}

}
