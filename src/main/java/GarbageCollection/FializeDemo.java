package GarbageCollection;

public class FializeDemo {

	static FializeDemo s;
	public static void main(String[] args) {
		FializeDemo f= new FializeDemo();
		System.out.println(f.hashCode());
		
	}
}
