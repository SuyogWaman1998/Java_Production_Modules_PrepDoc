package SingletonPractice;

public class SingletonDemo {
	
	private static SingletonDemo s= new SingletonDemo();
	
	private SingletonDemo() {
	}
	public static SingletonDemo getSingletonDemo() {
		return s;
	}
}
