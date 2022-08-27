package Mock_prac;

public class ABc {
	public static void main(String[] args) {
		
		try {
			System.out.println(20/0);
		}
		catch(ArithmeticException ref){
			
			System.out.println("print");
			
		}
		finally {
			System.out.println("abdjsgdfis");
		}
		
	}

}
