package Mock_prac;

public class MaxArray {

	public static int Max(int [] a,int total) {
		int temp;
		
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-1];
	}
		public static void main(String[] args){
		
			 int a[]= {21,85,66,12,123,165,46};
			 System.out.println(a.length);
			System.out.println("Large=" +Max(a,7));
	}
		
}
