package Polymorphism;

class Parent {
	public Parent() {
		System.out.println("Parent Class Constructor");
	}
	public void property() {
		System.out.println("Parent property");
	}
}

class Child extends Parent {
	
	public Child() {
		System.out.println("Child Class Constructor");
	}
	
	public void property() {
		System.out.println("Child property");
	}
}

public class Test {

	public static void main(String[] args) {
		
		Parent p = new Child();
		p.property();
		System.out.println(p.getClass());
		System.out.println();
		
		

		
	}
}
