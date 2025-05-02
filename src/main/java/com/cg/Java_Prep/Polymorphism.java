package com.cg.Java_Prep;

class A{
	public void test() {
		System.out.println("Class A Test method");
	}
}
public class Polymorphism extends A {
	
	public void test() {
		System.out.println("Class Poly Test method");
	}
    public static void main(String[] args) {
	Polymorphism t = (Polymorphism) new A();
	t.test();
    }
}
