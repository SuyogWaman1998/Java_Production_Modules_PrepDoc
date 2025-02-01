package Collections_Comparable_Comparator;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * WAP to insert String and String buffer object in Treeset 
 * where the sorting order is increasing in length 
 * N if two object having same length then consider the alphabetical order
 */


public class Comparator_String_Stringbuffer {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		t.add("X");
		
		System.out.println(t);
		
	}
}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1= o1.toString();
		String s2 = o2.toString();
		int l1= s1.length();
		int l2 = s2.length();
		
		if(l1<l2) return -1;
		else if(l1>l2) return +1;
		else return s1.compareTo(s2);
	}
	
}
