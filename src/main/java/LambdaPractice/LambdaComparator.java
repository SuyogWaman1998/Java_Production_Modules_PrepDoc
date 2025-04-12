package LambdaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class LambdaComparator {

	public static void main(String[] args) {
		ArrayList<Integer> ac= new ArrayList<Integer>();
		ac.add(10);
		ac.add(56);
		ac.add(56);
		ac.add(98867);
		ac.add(324);
		ac.add(7564);
		ac.add(34);
		System.out.println(ac);
		
		
		Comparator<Integer> m = (a,b)->(a<b)?-1:(a>b)?1:0;
		
		Collections.sort(ac,m);
		
		System.out.println(ac);
		ac.stream().forEach(System.out::println);
	}
}
