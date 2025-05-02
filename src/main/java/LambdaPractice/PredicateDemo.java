package LambdaPractice;

import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[] args) {
		Predicate<Integer> i = a-> (a<30 && a%2==0) ;
		System.out.println(i.test(30));
		System.out.println(i.test(0));
		System.out.println(i.test(10));
		System.out.println(i.test(11));
		System.out.println(i.test(90));
	}
}
