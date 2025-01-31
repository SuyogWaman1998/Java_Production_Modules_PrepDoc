package MultiThreadingSnippets;

class ThreadJoinA extends Thread {
	 ThreadJoinB tb = new ThreadJoinB();
	

	@Override
	public void run() {
		try {
			tb.start();
			tb.join();

			for (int i = 0; i < 10; i++) {
				System.out.println(" Thread - A --> "+ i);
				Thread.sleep(1000);
			}
		}
		catch (Exception e) {}
	}
}

class ThreadJoinB extends Thread {
	
	static Thread mt;
	@Override
	public void run() {
		
	
		try {
			mt.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(" Thread - B --> "+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

		}
	}
}

public class ThreadJoinDemo {

	public static void main(String[] args) {
		
		Thread mt= Thread.currentThread();
		
		ThreadJoinA ta = new ThreadJoinA();
		ta.start();
		for (int i = 0; i < 10; i++) {
			System.out.println(" Thread - Main --> "+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

		}
		
	}
}
