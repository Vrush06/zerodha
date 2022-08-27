package Mock_prac;

public class NoPallindrome {
	public static void main(String[] args) {
		
		int number=4004;
		int rev=0;
		
		for(int i=number;i>0;i=i/10) {
			
			int rem=i%10;
			rev=rev*10+rem;
			
			
		}
		System.out.println(rev);
		if(number==rev) {
			System.out.println("number is pallendrome");
		}
		else {
			System.out.println("number is not pallendrome");
		}
		
	}

}
