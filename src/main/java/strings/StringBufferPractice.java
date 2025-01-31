package strings;

public class StringBufferPractice {

	public static void main(String[] args) {
		String s = new String("Suyog");
		s.concat("waman");
		System.out.println(s);
		
		String s1= "Suyog";

		StringBuffer sb = new StringBuffer("Suyog");
		sb.append("wmana");
		System.out.println(sb);

		System.out.println(s==s1);
		System.out.println(s.equals(s1));
	}
}
