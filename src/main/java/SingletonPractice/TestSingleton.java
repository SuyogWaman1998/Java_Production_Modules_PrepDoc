package SingletonPractice;

public class TestSingleton {

	public static void main(String[] args) {
		SingletonDemo s= SingletonDemo.getSingletonDemo();
		System.out.println(s);
		
		SingletonDemo s1= SingletonDemo.getSingletonDemo();
		System.out.println(s1);
		
		SingletonConditionalInstanceDemo s2= SingletonConditionalInstanceDemo.getConditionalInstanceDemo();
		System.out.println(s2);
		
		SingletonConditionalInstanceDemo s3= SingletonConditionalInstanceDemo.getConditionalInstanceDemo();
		System.out.println(s3);
		
		s3=null;
		
	    Runtime r= Runtime.getRuntime();
	    
	    r.gc();
		
	}
}
