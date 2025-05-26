package strings;

import java.util.HashMap;
import java.util.Map;

public class StringProgramWithMap {
	
	public static void main(String[] args) {
		String s = "aaabbbccc";
		
		Map<Character,Integer> m = new HashMap<>();
		
		for(char c : s.toCharArray() ) {
			m.put(c, m.getOrDefault(c, 0)+1);
			
		}
		
		StringBuffer result = new StringBuffer();
		for(Map.Entry<Character, Integer> entry : m.entrySet()) {
			result.append(entry.getKey()).append(entry.getValue());
			
		}
		
		System.out.println(result.toString());
	}

}
