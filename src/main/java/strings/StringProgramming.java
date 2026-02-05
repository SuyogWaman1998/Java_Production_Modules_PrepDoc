package strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StringProgramming {
	
	
	/*
	 * here we are traversing through the string from last index and string it into reversed 
	 */
	public void reverseString(String s) {
		String reversed ="";
		for(int i=s.length()-1; i>=0;i--) {
			reversed += s.charAt(i);
		}
		System.out.println(reversed);
	}
	
	public void findDuplicateChar(String s) {
		
		Map<Character,Integer> p = new HashMap<>();
		int count=0;
		for(char c : s.toCharArray())
		{
			
			p.put(c,count +1 );
			count++;
		}
		System.out.println(p);
		
		
	}
	
	public void reverseOnlyWordInString() {
		String str = "Hello World";
		
		String str1[] = str.split(" ");
		StringBuilder reversed = new StringBuilder();
		for(int i =0; i<str1.length;i++) {
			StringBuilder s = new StringBuilder(str1[i]);
			reversed.append(" " + s.reverse());
		}

		System.out.println(reversed);
		
	}

	public static void main(String[] args) {
		
		StringProgramming s = new StringProgramming();
//		s.reverseString("suyog");
//		s.findDuplicateChar("Cartoon");
		s.reverseOnlyWordInString();
		
	}
}
