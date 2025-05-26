package ExceptionHandeling;

public class EceptionHandeling {
	
	public static void main(String[] args) {
		
		System.out.println("Exceptiong handeling begain");
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			System.out.println("Exception handled");
		}
		
		System.out.println("Code continues");
		
	}

}
