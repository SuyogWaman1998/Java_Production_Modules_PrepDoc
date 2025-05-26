package ExceptionHandeling;

public class ExceptionInfo {
	
	public static void main(String[] args) {
		System.out.println("Exception handeling begaion");
		
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println();
			System.out.println(e.toString());
			System.out.println();
			System.out.println(e.getMessage());;
		}
	}

}
