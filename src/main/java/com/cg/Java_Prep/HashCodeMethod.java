package com.cg.Java_Prep;

class Employee{
	private String name;
	
	public Employee(String name) {
		this.name=name;
	}
	public int hashCode() {
		return 10;
	}
	public boolean equals(Employee e) {
		return true;
	}
}

public class HashCodeMethod {
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Suyog");
		Employee e2 = new Employee("Adirya");
		
		System.out.println(e1.hashCode()==e2.hashCode());
		System.out.println(e1.equals(e2));
	}

}
