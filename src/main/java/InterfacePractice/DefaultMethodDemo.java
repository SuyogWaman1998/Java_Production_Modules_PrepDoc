package InterfacePractice;

 interface A{
	default void print() {
		System.out.println("A");
	}
}

 interface B{
	default void print() {
		System.out.println("B");
	}
}

 class Demo implements A,B{

	@Override
	public void print() {
		A.super.print();
	}
	 
 }

public class DefaultMethodDemo {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.print();
	}
}
