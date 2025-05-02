package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapNotSynch {
	
	private static Map<Integer,String> map = new HashMap<>();
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(()->{
			for(int i = 0;i<100;i++) {
		    	map.put(i, "value"+i);
		    }
		});
		Thread t2 = new Thread(()->{
			System.out.println(map);
		});
		t1.start();
		t2.start();
		try {
			t2.sleep(2000);
		}
		catch(Exception e) {
			throw new  InterruptedException("Thread paused");
		}
		
		System.out.println(Thread.currentThread().getName());
		
		
		
//		System.out.println(map);
		
		
	}
}
