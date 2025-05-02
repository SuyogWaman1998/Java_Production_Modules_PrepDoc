package com.cg.Java_Prep;

class Test{
	public static void test() {
		System.out.println("Static method of test class");
	}
}

public class ClassDemo extends Test {
	
	public static void test() {
		System.out.println("Static method of demo class");
	}
	public static void main(String[] args) {
		test();
	}
}
