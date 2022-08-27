package Mock_prac;

public class Min {
	
	public static int Min(int [] a,int total) {
		int temp;
		for(int i=0;i<=total;i++) {
			for(int j=i+1;j<total;j++) {
				
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		return a[0];
		
	}
	public static void main(String[] args) {
		int a[]= {22,55,45,664,313,23,14,35};
		System.out.println("min: "+Min(a,7));
		
		
		
	}

}
