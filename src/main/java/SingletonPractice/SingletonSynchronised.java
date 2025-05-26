package SingletonPractice;


class Test{
	static Test test;
	
	private Test() {	
	}
	
	public static Test getTest() {
		if(test==null) {
			synchronized (Test.class) {
				if(test==null) {
					test= new Test();
				}
			}
		}
		return test;		
	}
}
class Thread1 implements Runnable{
	public void run() {
		Test t = Test.getTest();
		System.out.println("Thread 1 hashcode instance "+t.hashCode()); 
	}
}
public class SingletonSynchronised {

	public static void main(String[] args) throws InterruptedException {
		Thread1 thread= new Thread1();
		
		Thread thread1= new Thread(thread);
		thread1.start();
		Test t = Test.getTest();
		Test t1 = Test.getTest();
		Test t2 = Test.getTest();
		System.out.println("main thread hashcod einstance "+t.hashCode()); 
		System.out.println("main thread hashcod einstance "+t1.hashCode());
		System.out.println("main thread hashcod einstance "+t2.hashCode());
	}
	
}
