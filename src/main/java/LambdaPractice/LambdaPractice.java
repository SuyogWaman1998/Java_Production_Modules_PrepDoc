package LambdaPractice;

import java.util.function.Function;

public class LambdaPractice {
	public static void main(String[] args) {
		Function<Integer,Integer> i = f -> f*f;
		
		System.out.println(i.apply(5));
		System.out.println(i.apply(10));

		
		
	}

}
