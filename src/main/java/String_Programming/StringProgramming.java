package String_Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class StringProgramming {
	
	public void reverseString(String s) {
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse = reverse+ s.charAt(i);
		}
		System.out.println(reverse);
	}
	
	public void stringPallindrome(String s) {
		String s1= "";
		for(int i= s.length()-1;i>=0;i--) {
			s1+=s.charAt(i);
		}
		if(s.equals(s1)) System.out.println("String is pallindrome");
		else System.out.println("String is not pallindrome");
		
	}
	
	public void vowelConsonentCount(String s) {
		char [] c= s.toCharArray();
		Map<Character,Integer> map = new HashMap<>();
		for(char c1 : c) {
			int count=0;
			map.put(c1, count);
		}
		System.out.println(map);
	}
	
	
	public void characterOccurance(String s) {
		//STEp-1 -- convert the given string to char array
		char[] ch = s.toCharArray(); 
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		//STEP 2-   iterate throup map and check if current key is present in map of not
		//if not present then add that key by value 1
		
		for(char c:ch) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}
			/*
			 * if not present then set a count variable to store the current count
			 * and then again put the current key with count increment to +1
			 */			
			else {
				int count=map.get(c);				
				map.put(c, count+1);
			}
		}
		System.out.println(map);
		/*
		 * create string buffer object
		 * now for Entry of map i.e Map.Entry<?> iterate through using map.entrySet() method
		 * 
		 */
		StringBuffer sb = new StringBuffer();
		for(Map.Entry<Character,Integer> entry: map.entrySet()) {
			/*
			 * now append the key and the value to string buffer object 
			 */
			sb.append(entry.getKey()).append(entry.getValue());			
		}
		//print final o/p using to string method
		System.out.println(sb.toString());
	}
	
	public void firstNonRepeatedCharacter(String s) {
		char[] ch= s.toCharArray();
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(char c:ch) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}
			else {
				int count= map.get(c);
				map.put(c, count+1);
				
			}
		}
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry);
			}
		}
		System.out.println(map);
	}
	
	public static void main(String[] args) {
		StringProgramming p = new StringProgramming();

//		p.reverseString("Suyog");
//		p.stringPallindrome("pop");
//		p.stringPallindrome("popop");
//		p.vowelConsonentCount("Strings");
//		p.characterOccurance("aaabbbbcccdddd");
		p.firstNonRepeatedCharacter("aaaabccckcsssddd");
	}
}
