package strings;

public class ImmmutableClass {
	
	public static void main(String[] args) {
		final StringBuffer sb = new StringBuffer("Software");
//		System.out.println(sb);
		StringBuffer s = sb;
//		System.out.println(s);
		
		String s1 = "suyog";
		String s2= s1.toLowerCase();
		String s3 ="suyog";
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
//		System.out.println(s3==s2);
//		System.out.println(s3.equals(s2));
		
		
		String a = new String("you cannot change me");
		String a1 = new String("you cannot change me");
		
		System.out.println(a==a1);
		System.out.println(a.equals(a1));

		String a2= "you cannot"+ " change me";
		System.out.println(a1==a2);

		
		
		
	}

}
