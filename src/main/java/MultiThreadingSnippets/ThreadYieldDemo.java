package MultiThreadingSnippets;

import java.util.Iterator;

class ThreadYieldA extends Thread{
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread - A");
			Thread.yield();
		}
		
		
	}
}

class ThreadYieldB extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread-B");
		}
	}
}



public class ThreadYieldDemo {

	public static void main(String[] args) {
		
		ThreadYieldA ta= new ThreadYieldA();
		ThreadYieldB tb= new ThreadYieldB();
		
		ta.start();
		tb.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread-Main");
		}
		
	}
}
