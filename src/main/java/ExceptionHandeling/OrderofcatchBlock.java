package ExceptionHandeling;

/*
 * alway need to remember that 
 * whenever we are trying to handle exceptions 
 * its necessary to catch it perticulery with respective exception
 * 
 * if we handlle it by only Exception class then its not a good practice
 * 
 * always child exception will needed to be catched first
 * then parent
 * 
 * following commented code is wrong way to handle exception and will result in
 * error -->
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Unreachable catch block for ArithmeticException. 
	It is already handled by the catch block for Exception
 */

public class OrderofcatchBlock {
	
	public static void main(String[] args) {
		System.out.println("Method begain");
		
//		try {
//			System.out.println(10/0);
//		} catch (Exception e) {
//			System.out.println("Exception handled by exception ");
//		}
//		catch (ArithmeticException e) {
//			System.out.println("Exception handled by arthmetic exception ");
//		}
		
		try {
			System.out.println(10/0);
		} 
		catch (ArithmeticException e) {
			System.out.println("Exception handled by arthmetic exception ");
		}
		catch (Exception e) {
			System.out.println("Exception handled by exception ");
		}
	}
}
