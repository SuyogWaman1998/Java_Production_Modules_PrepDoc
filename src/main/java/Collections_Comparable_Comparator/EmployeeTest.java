package Collections_Comparable_Comparator;

import java.util.TreeSet;

class Employee implements Comparable<Object> {
	int empId;
	String empName;

	Employee( String empName,int empId) {
		this.empId = empId;
		this.empName = empName;
	}
	public String toString(){
		return empId + "--"+ empName;
	}
	public int compareTo(Object o) {
		int empid1 = this.empId;
		Employee e = (Employee) o;
		int empid2 = e.empId;

		if (empid1 < empid2) {
			return -1;
		} else if (empid1 > empid2) {
			return 1;
		}
		else
		return 0;
	}
	
}

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee( "Suresh",100);
		Employee e2 = new Employee( "naresh",7);
		Employee e3 = new Employee( "saurabh",23);
		Employee e4 = new Employee("nagesh",36);
		Employee e5 = new Employee("ashok",39);
		Employee e6 = new Employee( "Suresh",376327);
//		TreeSet<Employee> t = new TreeSet<Employee>();
		TreeSet<Employee> t = new TreeSet<Employee>(new MyComparator());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		System.out.println(t);
	}

}
