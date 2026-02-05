package generalPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
	
	public static String vovelReverse(){
		
		String s = "advantage";
		char str[]=s.toCharArray();
		
		Set<Character> vovels = Set.of('a','e','i','o','u');
		int left =0;
		int right = str.length-1;
		
		while(left< right ) {
			while(left<right && !vovels.contains(str[left])) {
				left++;
			}
			while(left<right && !vovels.contains(str[right])) {
				right--;
			}
			if(left<right) {
				char temp = str[left];
				str[left] = str[right];
				str[right]= temp;
				
				left++;
				right--;
				System.out.println(str[left] + "  " + str[right]);
			}	
			
		}
		
		System.out.println(str);
		
		return new String(str);
	}
	
	public static void duplicateCount(){

		int arr[] = { 1,2,3,4,4,4,4, 5, 1,1,1};
		int maxCount=0;

		Map<Integer, Integer> map = new HashMap<>();

		for(int i : arr){
		 int count = map.getOrDefault(i,0) +1;
		map.put(i, count);
		maxCount= Math.max(maxCount,count);

		}
		for(Map.Entry<Integer,Integer> m : map.entrySet()){
		if(m.getValue()== maxCount) {
		 System.out.println( m.getValue() +" times  "+ m.getKey() );
		}
		}
		}

	public static void main(String[] args) {
		
		
		
//		String a = "abc";
//		String b = "ABC";
//		a=b;
////		System.out.println(a==b);
//		vovelReverse();
//		Practice p = new ChildOfAbstract();
////		p.finalMethod();
	duplicateCount();
		
		
	}

}
;