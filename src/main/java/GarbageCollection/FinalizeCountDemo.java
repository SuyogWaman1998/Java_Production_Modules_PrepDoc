package GarbageCollection;

public class FinalizeCountDemo {

	static int count;
	public static void main(String[] args) {
		for (int i = 0; i < 100000000; i++) {
			FinalizeCountDemo d = new FinalizeCountDemo();
		}
	}
	public void finalize() {
		count++;
		System.out.println("finalize method called "+count+" times");
	}
}
