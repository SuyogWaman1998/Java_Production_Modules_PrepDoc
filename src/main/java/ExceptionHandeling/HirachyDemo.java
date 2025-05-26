package ExceptionHandeling;

public class HirachyDemo {

	public static void main(String[] args) {
		try {
			int c = 10/0;
		}
		catch(ArithmeticException e){
			System.out.println("Exception Handled 2");
			}
		catch(Exception e) {
			System.out.println("Exception handled-1");
		}
		
		
	}
}
