package CollectionsSnippets;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


public class EnumerationDemo {

	
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		
		v.addElement(10);
		v.addElement(20);
		v.addElement(3);
		v.addElement(40);
		v.addElement(40);
		v.addElement(50);
		v.addElement(60);
		v.addElement(7);
		v.addElement(90);
		 
//		System.out.println(v);
//		
//		Enumeration<Integer> e= v.elements();
//		
//		while(e.hasMoreElements()) {
//			Integer i= e.nextElement();
//			
//			if(i%2==0) System.out.println(i);
//		}
//		System.out.println();
		System.out.println(v);
		
		
		Iterator<Integer> i= v.iterator();
		
		
		while(i.hasNext()) {
			Integer a= i.next();
			
			if(a%2==0) {System.out.println(a);
			i.remove();
			}
		}
		
		System.out.println(v);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
