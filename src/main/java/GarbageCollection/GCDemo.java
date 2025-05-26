package GarbageCollection;

public class GCDemo {
	static GCDemo s;
	public static void main(String[] args) throws InterruptedException {
		GCDemo g = new GCDemo();
		System.out.println("g hashcode "+g.hashCode());
		g=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println("s hashcode "+s.hashCode());
		s=null;
		System.gc();
		Thread.sleep(10000);
		System.out.println("End of main method");
//		System.out.println(s.hashCode());
		System.out.println(s);
		
	}
	public void finalize() {
		System.out.println("Finalize called");
		s=this;
	}

}
