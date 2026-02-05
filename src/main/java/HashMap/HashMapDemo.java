package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		Set s = map.entrySet();
		
		map.put("Suyog", 10);
		map.put("Aditya", 20);
		map.put("Sarvesh", 30);
		map.put("Akash", 40);
		map.put("Aditya", 10);
		map.equals(s);
		
		
		
		System.out.println(map);
//		System.out.println(s);
		
		
		
	}

}
