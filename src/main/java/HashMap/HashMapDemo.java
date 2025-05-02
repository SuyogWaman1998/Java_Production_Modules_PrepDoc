package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		
		map.put("Suyog", 10);
		map.put("Aditya", 20);
		map.put("Sarvesh", 30);
		map.put("Akash", 40);
		
		System.out.println(map);
		
		Set s = map.entrySet();
		System.out.println(s);
		
		
	}

}
