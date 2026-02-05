package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

public class StreamPracticeInterview {
	
	public void largesLengthWord() {
		String s = "I am java developer";
		
		String ans = Arrays.stream(s.split(" "))
		.max(Comparator.comparing(String::length))
		.get();
		
		System.out.println(ans);
		System.out.println(ans.getClass());
	}
	
	public void removeDuplicateFromString() {
		String s = "aaabbbccc";
		
		   Arrays.stream(s.split(""))
				.distinct()
				.forEach(System.out::print);
		
	}
	
	public void secondHighestWord(){
		String s="I am java developer";
		String ans= Arrays.stream(s.split(" "))
				.sorted(Comparator.comparing(String::length)
						.reversed())
				.skip(1)
				.findFirst()
				.get();
	    System.out.println(ans);			
	}
	
	
	public void secondHighestWordLength(){
		String s="I am java developer";
		 int i= Arrays.stream(s.split(" "))
				.sorted(Comparator.comparing(String::length)
						.reversed())
				.skip(1)
				.findFirst()
				.get()
				.length();
	    System.out.println(i);			
	}
	
	public void occuranceOfWord() {
		String s="I am java developer java streams java"; 
		
		Map<String, Long> m = Arrays.stream(s.split(" "))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(m);
	}
	 

	public static void main(String[] args) {
		StreamPracticeInterview s = new StreamPracticeInterview();
		
//		s.largesLengthWord();
//		s.removeDuplicateFromString();
//		s.secondHighestWord();
//		s.secondHighestWordLength();
		s.occuranceOfWord();
		
	}
}
