package CollectionsSnippets;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("Knife");
		arr.add("Bank");
		arr.add("User");
		arr.add("Password");
		arr.add("Role");
		arr.add("Account");
		arr.add("Manager");
		arr.add("Admin");
		arr.add("Employee");
		arr.add("Customer");
		arr.add("Life");
		
		
//		System.out.println(arr);
		
		ListIterator<String> li= arr.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("-------------------------------------");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		System.out.println("-------------------------------------");
		while(li.hasPrevious()) {
			if(li.previous()=="Life") {
				li.remove();
			}
		}
		
		
		
		System.out.println(arr);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
