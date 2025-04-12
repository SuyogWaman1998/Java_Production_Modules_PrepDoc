package strings;

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
	
	

	public static void main(String[] args) {
		
		StringProgramming s = new StringProgramming();
		s.reverseString("suyog");
		
	}
}
