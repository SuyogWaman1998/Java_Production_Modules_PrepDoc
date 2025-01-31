package CollectionsSnippets;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedListDemo {

	public void iteratorDemo() {
		
		
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("Desk");
		ls.add("chair");
		ls.add("pc");
		ls.add("pen");
		ls.add("paper");
		ls.add("list");
		ls.add("cell");
		ls.add("kalf");
		ls.add("bag");
		ls.add("charger");
		ls.add("cup");
		ls.add("book");

	
		
		Iterator itr =   (Iterator) ls.iterator();
		
		
	}

	public static void main(String[] args) {

		LinkedListDemo lld = new LinkedListDemo();

		lld.iteratorDemo();

		LinkedList<Object> l = new LinkedList<>();

//		l.add("sarah");
//		l.add("aditya");
//		l.add("gallilio");
//		l.add("madam");
//		l.add("sarah");
//		l.addLast(1.5);
//		System.out.println(l);
//		System.out.println();
//		l.set(2, "sarah");
//		System.out.println(l);
//		System.out.println();
//		l.remove();
//		System.out.println(l);
//		System.out.println();
//		l.removeLast();
//		System.out.println(l);
//		System.out.println();
//		System.out.println(l.indexOf("sarah"));

	}
}
