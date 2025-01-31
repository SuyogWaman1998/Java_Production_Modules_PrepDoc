package CollectionsSnippets;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorStringDemo {

	public static void main(String[] args) {
		TreeSet t= new TreeSet();
//		t.add("Suyog");
//		t.add("Pratik");
//		t.add("Sneha");
//		t.add("Arka");
//		t.add("Gaurav");
		
		t.add(new StringBuffer("Suyog"));
		t.add(new StringBuffer("Pratik"));
		t.add(new StringBuffer("Sneha"));
		t.add(new StringBuffer("Arka"));
		t.add(new StringBuffer("Gaurav"));
		t.add(new StringBuffer("Srasthi"));

		System.out.println(t);
	}
}

//class MyComparatorString implements Comparator{
//	
//	public int compare(Object obj1, Object obj2) {
//		String s1= obj1.toString();
//		String s2= obj2.toString();
//		
//		return s2.compareTo(s1);
//	}
//}
