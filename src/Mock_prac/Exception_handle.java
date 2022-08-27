package Mock_prac;

public class Exception_handle {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(20/0);
		}
//		catch(NullPointerException n){
//			System.out.println("vjdh");
//		}
		catch(ArithmeticException a) {
			System.out.println("hkg");
		}
		finally {
			System.out.println("ths");
		}
	}

}
