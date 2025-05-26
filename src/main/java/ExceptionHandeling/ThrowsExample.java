package ExceptionHandeling;

public class ThrowsExample {

	public static void main(String[] args) throws InterruptedException {
		ThrowsExample.dostuff();
	}
	
	public static void dostuff()throws InterruptedException {
		ThrowsExample.domorestuff();
	}
	
	public static void domorestuff()throws InterruptedException {
		System.out.println("Thread sleeppingggg......");
		Thread.sleep(10000);
		System.out.println("Thread sleep completed");
	}
}
