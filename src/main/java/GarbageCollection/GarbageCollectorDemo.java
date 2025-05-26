package GarbageCollection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Student{
	String name;
	String pass;
	String id;
	public Student(
			String name,
			String pass,
			String id) {
		this.id=id;
		this.name=name;
		this.pass=pass;
	}
}

public class GarbageCollectorDemo {
	
	public static void main(String[] args) {
		Runtime r =Runtime.getRuntime();
		System.out.println("Total memory---"+r.totalMemory());
		System.out.println();
		System.out.println("Free memory---"+r.freeMemory());
		List<Student> s = new ArrayList<>();
		for(int i=0;i<=10000;i++) {
			s.add(new Student("Suyog","Suyog","Suyog")) ;
			
		}
		
		System.out.println();
		System.out.println("after object creation free momry---"+r.freeMemory());
		s=null;
		r.gc();
		System.out.println();
		System.out.println("after gc free momry---"+r.freeMemory());
		System.out.println();
		System.out.println("used momry---"+(r.totalMemory()- r.freeMemory()));
		
	}

}
