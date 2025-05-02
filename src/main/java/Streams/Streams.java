package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,11,2,22,3,3,4,4,5,5,6,6,7,7,8,8,9,9);
		
		for(Integer i:l) {
			System.out.println(i);
		}
		
		List<Integer> l1= l.stream()
				.filter(i->i%2==0)
				.map(i->i*2)
				.collect(Collectors.toList());
		System.out.println(l1);
	}
	
	

}
