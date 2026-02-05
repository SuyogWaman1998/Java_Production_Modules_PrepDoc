
 package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Employee{
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		this.id= id;
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return id +" : "+ name;
	}
}

public class EmployeeStreams {
	
	public static void main(String[] args) {
		ArrayList<Employee> e = new ArrayList<>();
		
		e.add(new Employee(1, "Raj"));
		e.add(new Employee(2, "Suyog"));
		e.add(new Employee(3, "Payal"));
		e.add(new Employee(4, "Komal"));
		e.add(new Employee(4, "Avinash"));
		e.add(new Employee(5, "Lokesh"));
		e.add(new Employee(6, "Aditya"));
		e.add(new Employee(7, "Sarvesh"));
		e.add(new Employee(8, "Adhiraj"));
		
		System.out.println(e);
		
		
		List<Employee> e1 = e.stream()
				.filter( i -> i.getId()%2==0)
				.map(i-> new Employee(i.getId()*2, i.getName()))
				.collect(Collectors.toList());
		
		System.out.println(e1);
		
		List<Employee> e2 = e.stream()
				.filter(i -> i.getName().charAt(0)=='A')
				.map(i -> new Employee(i.getId(),i.getName()))
				.collect(Collectors.toList());
		System.out.println(e2);
		
		Set<Employee> e3 = e.stream()
				.filter(i -> i.getName().charAt(0)=='A')
				.map(i -> new Employee(i.getId(),i.getName()))
				.sorted(Comparator.comparing(s->s.getId()))
				.collect(Collectors.toCollection(LinkedHashSet::new));
		System.out.println("Set sorted by id"+e3);
		
		
		Set<Employee> e4 = e.stream()
				.filter(i -> i.getName().charAt(0)=='A')
				.map(i -> new Employee(i.getId(),i.getName().toUpperCase()))
				.collect(Collectors.toSet());
		System.out.println("Set"+e4);
		
		System.out.println();
		List<Employee> e5= e.stream()
//				.filter(i -> i.getName().charAt(0)=='A')
//				.map(i -> new Employee(i.getId(),i.getName().toUpperCase()))
				.sorted((i1,i2)-> i2.getName().compareTo(i1.getName()))
				.collect(Collectors.toList());
		System.out.println("Set"+e5);
		
		
		Employee e6 = e.stream()
				.map(i -> new Employee(i.getId(),i.getName().toUpperCase()))
				.min((i1,i2)->i1.getName().compareTo(i2.getName()))
						.get();
		
		System.out.println(e6);
				
	}
	
	

}
