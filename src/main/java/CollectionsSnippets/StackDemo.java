package CollectionsSnippets;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Object> sc = new Stack<Object>();
		
		sc.push(30);
		sc.push(20);
		sc.push(40);
		sc.push(40);
		sc.push(19);
		sc.push(19);
		sc.push(20);
		System.out.println(sc);
		System.out.println(sc.peek());
		System.out.println("After one pop");
		System.out.println(sc.pop());
		
		System.out.println("After one pop");
		System.out.println(sc.pop());
		
		System.out.println("After one pop");
		System.out.println(sc.pop());
		
		System.out.println(sc.search(30));
		
		System.out.println("After one pop");
		System.out.println(sc.pop());
		
		System.out.println("After one pop");
		System.out.println(sc.pop());
		
		System.out.println("After one pop");
		System.out.println(sc.pop());
		
		System.out.println("After one pop");
		System.out.println(sc.pop());
		
		System.out.println(sc.empty());
		System.out.println(sc);
		
	
		
	}
}
