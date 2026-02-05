package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ComputeMethodPractice {

	public static void main(String[] args) {
		
		List<String> ls = Arrays.asList("apple","banana","apple","orange","banana","apple");
		
		Map<String,Integer> map = new HashMap<>();
		

//		occurance of word using getOrDefault in hashmap
//	  for(String s : ls) {
//		map.put(s, map.getOrDefault(s,0)+1);
//	  }
		//========================================================
		
		
//		occurance of word using compute in hashmap
//	  for(String s : ls) {
//		map.compute(s, (k,v)->(v==null)?1:v+1);
//	  }
		//========================================================		
		

//		occurance of word using merge in hashmap
	  for(String s : ls) {
		map.merge(s, 1, Integer::sum);
	  }
	  
//	  removing banana using compute in hashmap
	  map.compute("banana", (k,v)-> (k == "banana"? null:null));
	  
	  
//	  removing banana using merge in hashmap
	  map.merge("orange", 0, (k,v)-> null);
	  
////	  updating keys of banana and apple using compute in hashmap
//	  map.compute("apple",(k,v)->(k=="apple")?v+5:v);
//	  
////	  updating keys of banana and apple using merge in hashmap
//	  map.merge("banana", 2, (k,v)->k+v);
	  
//	  adding banana using computeIfAbsent in hashmap
	  map.computeIfAbsent("banana", v->1);
	  
	  
		
		
	  
	  System.out.println(map);
		
	}
	
}
