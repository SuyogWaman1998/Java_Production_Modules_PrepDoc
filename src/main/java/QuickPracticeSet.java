import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class QuickPracticeSet {
	
	public void reverseString(String str) {
		
		String reverse="";
		char arr []=  str.toCharArray();
		for(int i=arr.length-1; i>=0;i--) {
			
			reverse = reverse + arr[i];
			
		}
		System.out.println(reverse);
		
	}
	
	public void countOccuranceOfChar(String str){
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(char c : str.toCharArray()) {
			map.merge(c,1, (k,v)-> k+v );
		}

		System.out.println(map);
	}
	
    public void anagramCheck() {
    	String s1 = "ramananamar";
    	String s2 = "ramananamar";
    	
    	
    }
	
	
	
	public static void main(String[] args) {
		QuickPracticeSet p = new QuickPracticeSet();
		
		p.reverseString("suyog");
		p.countOccuranceOfChar("aaabbbcccdddddd");	}

}
