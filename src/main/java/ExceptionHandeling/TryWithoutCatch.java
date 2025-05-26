package ExceptionHandeling;

public class TryWithoutCatch {
	public static void main(String[] args) {
		System.out.println("Program started...");
		
		try {
			System.out.println(10/0);
		}
//		catch(ArithmeticException e) {
//			System.out.println("Exception cought");
//		}
		finally {
			System.out.println("Finally Block ");
		}
	}

}
