package CollectionsSnippets;

import java.util.ArrayList;
import java.util.Iterator;



public class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		for(int i=0;i<=20;i++) {
			l.add(i);
		}
	
		l.add(3,34);
		System.out.println(l);
		
		
		ArrayList<String> ls = new ArrayList<>();
		
		ls.add("Cofee");
		ls.add("Tab;e");
		ls.add("Pen");
		ls.add("Mug");
		ls.add("Life");
		ls.add("Tree");
		ls.add("Set");
		ls.add("Coal");
		ls.add("Sae");
		
		System.out.println(ls);
		
		Iterator<String> itr = ls.iterator();
		
		while(itr.hasNext()) {
			String I= itr.next();
			if(I=="Cofee" || I=="Mug") {
				itr.remove();
			}
		}
		System.out.println(ls);
		
		
		
		
	}
}
