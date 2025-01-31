package MultiThreadingSnippets;


class ThreadA extends Thread{
	@Override
	public void run() {
		for (int i = 0; i <10; i++) {
			System.out.println("Thread A is running ....");
		}
	}
}

public class ThreadRunDemo {

	public static void main(String[] args) {
		
		ThreadA t1= new ThreadA();
		
		t1.start();
		
		for (int i = 0; i <10; i++) {
			System.out.println(" Main Thread Running.....");
		}
			
	}
}
