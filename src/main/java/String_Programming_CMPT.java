import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class String_Programming_CMPT {
	
	
	//1.Reverse a given string without using built-in functions.
	public String reverseString(String str) {
		String reverse ="" ;
		
		//iterating trough string and adding one char from last char in reverse variable
		for(int i=str.length()-1;i>=0;i--) {
			reverse = reverse + str.charAt(i) ;
		}
		System.out.println(reverse);
		return reverse;

	}
	
	
	
	
	
	
	//2.	Check if a given string is a palindrome.
	public boolean findPallindrome(String str) {
		String reverse = "";
		
		for(int i = str.length()-1;i>=0;i--) {
			reverse = reverse + str.charAt(i);
		}
		if(str.equals(reverse)) return true;
		else return false;
	}
	
	
	
	
	
//	3.	Count the number of vowels and consonants in a string.
	public void countVovels(String str) {
		
		/*
		 * for this problem hashmap is the best choice as its count mechanism,
		 * and will connect one set of vovels by Set.of() method.
		 *
		 */
		Map<Character, Integer> mp= new HashMap<>();

		Set<Character> vovels = Set.of('a','e','i','o','u');
		
		/*
		 * after this will put for loop on strings each char,
		 * check if that char is present in the vovels set by contains() method.
		 * and then weill use one method from map interface called getOrDefault() 
		 * this method will return the value present for that key and will add the +1 in the existing value
		 * 
		 */

		for(Character c : str.toCharArray())
		{
			if(vovels.contains(c)) {
			mp.put(c, mp.getOrDefault(c, 0)+1);
			}
		}
		System.out.println(mp);
	}
	
	
	
	
//	4.	Remove all duplicate characters from a string.
	public void removeDuplicateChar(String str) {
		
		/*
		 * here I will use set to filter the unique values and LinkedHashSet for preserving insertion order
		 */
		Set<Character> s= new LinkedHashSet<>() ;
		
		for(int i= 0; i<str.length();i++) {
			s.add(str.charAt(i));
		}
		/*
		 * then create new string builder object and append each char of set to that object. 
		 */
		StringBuilder unique = new StringBuilder();
		for(Character ch :s) {
			unique.append(ch);
			
		}
		
		System.out.println(unique);
		System.out.println(s);
	}
	
	
	
//	5.	Check if two strings are anagrams of each other.
	public void anagramCheck(String s1, String s2) {
		
		/*
		 * In this the simple approach is used, 
		 * will use 2 hashmaps for storing character and its count 
		 * and compare both by equals method so in anagrams for both the string the character counts are same
		 * if the 2 hashmaps are equal then those string are anagram
		 * 
		 */
		
		Map<Character, Integer> m1= new HashMap<>();
		Map<Character, Integer> m2= new HashMap<>();
		
		for(char c : s1.toCharArray()) {
			m1.put(c, m1.getOrDefault(c, 0)+1);
		}
		for(char c : s2.toCharArray()) {
			m2.put(c, m2.getOrDefault(c, 0)+1);
		}
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m1.equals(m2));
	}
	
	
	
	
//	6.	Find the first non-repeating character in a string.
	public void findFirstNonRepeatingChar(String str) {
		
		/*
		 * in this problem we can use LinkedHashMap for storing the value as key value pair for count
		 * then will put the chars in the map by using grtOrDefault() method where key will be char and count as its value
		 
		 */
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for (Character c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		/*
		 *  then iterate that map using Map.Entry interface for each entry of map object,
		 *  by this we will compare the value with 1 as we want 1st non repeating char,
		 *  once we get it we will break the loop and print the key i.e char
		 */
		for(Map.Entry<Character, Integer> m : map.entrySet()) {
			if(m.getValue().equals(1)) {
				System.out.println(m.getKey());
				break;
			}
		}
		/*
		 * implementing same logic by stream
		 * create optional char object 
		 *   iterate that map using stream map.entrySet() for each entry of map object,
		 *  filter the value which equal to 1 as we want 1st non repeating char,
		 *  then map that entry and get the key from it using Map.Entry::getKey 
		 *  and the findFirst() 
		 */
		Optional<Character> c = map.entrySet().stream().filter(i -> i.getValue().equals(1)).map(Map.Entry::getKey).findFirst();
		System.out.println(c);
		System.out.println(map);
	}
	
	
	
//	7.	Check if one string is a rotation of another.
	public void checkRotation(String s1, String s2) {
		
		/*
		 * commom but criticqal logic 
		 * Rotational string means if we sfift chars in the string to another position then it will be a rotational string
		 * here is the catch
		 * if we add the 1st string to itself our rotational string will be part of it at some position
		 * then will use contains method of string class and compare 2nd string in it 
		 */
		if(s1== null|| s2==null) System.out.println("invalid input");
		if(s1.length()!= s2.length()) System.out.println("invalid input");
		String combined = s1+s1;
		if (combined.contains(s2)) {
			System.out.println("This are rotational strings");
		}
		else {
			System.out.println("Not roataional");
		}
		
		
	}
//	8.	Find the longest substring without repeating characters.
	public void findLongestSubstring(String sa) {
		String str ="abcadeefgha";

		int left=0;
		int maxLen = 0;
		Set<Character> s = new HashSet<>();
		List<String> l = new ArrayList<>();
		for(int right=0; right<str.length();right++) {
			char c = str.charAt(right);
			while(s.contains(c)) {
			System.out.println(c);		
			s.remove(str.charAt(left));
			left++;
			}
			s.add(c);
			int currentLen= right-left+1;
			if(currentLen> maxLen) {
				maxLen = currentLen;
				l.clear();
				l.add(str.substring(left, right+1));
				
				
			}
			else if (currentLen == maxLen) {
				l.add(str.substring(left, right+1));
			}				
		}
		System.out.println(maxLen);
		
		System.out.println(l);
		
				
		
		
	}
	
	public void arraySum() {
		int arr[]= {7,2,9,11,-2,15,0};
		Map<Integer,Integer> m = new HashMap<>();
		int result = 9;
		
		for(int s : arr) {
			int contains = result-s;
			if(m.containsKey(contains)) {
				System.out.println(s +","+ contains);
			}
			m.put(s, contains);	
		}	
	}
	
	public static void main(String[] args) {
		
		String_Programming_CMPT s = new String_Programming_CMPT();
//		s.reverseString("suyog");
//		
//		boolean b = s.findPallindrome("ababaa");
//		System.out.println(b);
//		
//		s.removeDuplicateChar("aaabbbbccccdddd");
//		s.countVovels("aaaabbbbbcccciiiooouuueee");
//		s.anagramCheck("listen", "silent");
//		s.anagramCheck("dustyoo", "studyoo");
//		s.findFirstNonRepeatingChar("sytingwjedhesssbkhbvkhgrvehvkhefv");
//		s.checkRotation("abcdee", "eeabcd");
		s.findLongestSubstring("abacadeefgh");
//		s.arraySum();
		
		
		
	}

}
