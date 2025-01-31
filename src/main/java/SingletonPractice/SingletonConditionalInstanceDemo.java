package SingletonPractice;

public class SingletonConditionalInstanceDemo {

	private static SingletonConditionalInstanceDemo s = null ;
	
	private SingletonConditionalInstanceDemo() {
		
	}
	
	public static SingletonConditionalInstanceDemo getConditionalInstanceDemo() {
		if(s == null) {
			s= new SingletonConditionalInstanceDemo();
		}
		return s;
	}
}
