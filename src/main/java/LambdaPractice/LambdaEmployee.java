package LambdaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	int empNo;
	String empName;
	
    public Employee( int empNo, String empName) {
    	this.empName=empName;
    	this.empNo= empNo;
		
	}
    public String toString(){
    	return empName+" : "+empNo;
    }
}

public class LambdaEmployee {

	public static void main(String[] args) {
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(1, "devan"));
		emp.add(new Employee(2,"life"));
		emp.add(new Employee(6, "kevin"));
		emp.add(new Employee(4,"more"));
		emp.add(new Employee(9, "kill"));
		emp.add(new Employee(22,"false"));
		emp.add(new Employee(60, "chai"));
		emp.add(new Employee(59,"hope"));
		System.out.println(emp);
		/* we will use to sort the emp list based on names of emp
		 * (e1,e2)-> e1.empName.compareTo(e2.empName)
		 * 
		 * and we will use to sort the emp list based on employee no of emp
		 * 		(e1,e2)->(e1.empNo<e2.empNo)?-1:(e1.empNo>e2.empNo)?1:0);
		 * 
		 * sort mthod will take 2 agrumnts the emp list object and the comparision reference we want
		 * so here we will pass the lambda exxpression as angument to compare the objects
		 */
		Collections.sort(emp,(e1,e2)-> e1.empName.compareTo(e2.empName));
		Collections.sort(emp,(e1,e2)->(e1.empNo<e2.empNo)?-1:(e1.empNo>e2.empNo)?1:0);
		
		emp.forEach(System.out::println);
		
		
	}
}
