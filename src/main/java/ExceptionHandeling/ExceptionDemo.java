package ExceptionHandeling;

/*
 * in this code we have the stack trace of exceptions
 * 
 * when any exceptions occurs the method is terminated where the exception is occured 
 * ALSO those methods are also terminated from which the current method is called 
 * 
 * in this example main -->  doStuff --> domorestuff when the exceptrion occured in demorestuff
 * all the corrosponding methods are terminated 
 * 
 * 
 */
public class ExceptionDemo {
	
	public static void doStuff() {
		doMoreStuff();
	}
	public static void doMoreStuff() {
		System.out.println(10/0);
	
	}
	public static void main(String[] args) {
		doStuff();
	}
}
