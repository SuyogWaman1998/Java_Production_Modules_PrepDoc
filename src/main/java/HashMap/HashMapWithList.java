package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapWithList {
	
	
	public static void countAmmoutSumPerdate() {
		List<Transactions> t = Arrays.asList(
				new Transactions("2022-01-01",100),
				new Transactions("2022-01-01",100),
				new Transactions("2022-01-02",100),
				new Transactions("2022-01-02",100),
				new Transactions("2022-01-02",100),
				new Transactions("2022-01-01",100),
				new Transactions("2022-01-02",100)
				);
		
		Map<String,Integer> map = new LinkedHashMap<>();
		for(Transactions t1:t) {
			map.merge(t1.getDate(),t1.getAmmount(),(k,v)->k+v);
		}
		
		///get max transaction date
		
		
		System.out.println(map);
	}
	
	public static void main(String[] args) {
		
		/// try to store the values in list which have similar key 
		// ex "A" -> apple,avacado
		List<Map.Entry<String,String>> list= List.of(
				Map.entry("A","apple"),
				Map.entry("B","banana"),
				Map.entry("A","avacado"),
				Map.entry("C","cidar"),
				Map.entry("B","berry"),
				Map.entry("D","dryfruit")
				);
		
		
		Map<String,List<String>> map = new HashMap<>();
		/* 
		 * in this for each entry will use computeifabsent from map,
		 * it will take 2 arguments 1st is the key(will get it by entry,getKey()
		 * 2nd argument is the value we need to put for that key 
		 * so we will create new arraylist for each key 
		 * once the arraylist is created will use add method to store the value for that key 
		 * so that if key -> A have values like apple and avacado 
		 * first apple will be saved in list and then avacado is added
		 * and same will happen for other keys
		 * and the o/p map will be like this 
		 * {A=[apple, avacado], B=[banana, berry], C=[cidar], D=[dryfruit]}
		 */
		
		for(Map.Entry<String, String> entry: list) {
			map.computeIfAbsent(entry.getKey(), k-> new ArrayList<>())
			.add(entry.getValue());
		}
//		System.out.println(map);
		
		Map<String,Integer> countries = new HashMap<>();
		countries.put("America", 1000);

		countries.computeIfAbsent("Egypt", k-> 10000);
//		System.out.println(countries);
		
		Map<String,Integer> stock = new HashMap<>();
		stock.put("Oil", 10);
		stock.put("Disel", 10);
		stock.put("Petrol", 10);
		stock.put("Kerosene", 10);
		
		stock.computeIfPresent("Oil", (t, u) -> u+2 );
//		System.out.println(stock);
		countAmmoutSumPerdate();
		
	}

}
