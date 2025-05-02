package com.cg.Java_Prep;

public class EqualsMethod {

	private Integer a;

	public EqualsMethod(int a) {
		this.a = a;
//		System.out.println(a);
	}

	public static void main(String[] args) {
//		EqualsMethod e = new EqualsMethod(10);
//		EqualsMethod e1 = new EqualsMethod(20);
//		EqualsMethod e2= new EqualsMethod(10);
		
//		System.out.println(e);
//		System.out.println(e1);
//		System.out.println(e2);
//		System.out.println();
//		
//		System.out.println(e==e1);
//		System.out.println(e1==e2);
//		System.out.println(e2==e);
//		System.out.println();
//		
//		System.out.println(e.equals(e1));	
//		System.out.println(e1.equals(e2));
//		System.out.println(e.equals(e2));
//		
		String s1= new String("suyog");
		String s2= new String("suyog");
		String s5 ="suyog";
		String s6 = "suyog";
		StringBuffer s3= new StringBuffer("suyog");
		StringBuffer s4= new StringBuffer("suyog");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println("S! and S2 " + s1.equals(s2));
		System.out.println("S! and S2 " + (s1==s2));
		System.out.println();

		System.out.println("S5 and S6 " + s5.equals(s6));
		System.out.println("S5 and S6 " + (s5==s6));
		
		System.out.println();
		
		System.out.println("S2and S3 " +s2.equals(s3));
//		System.out.println("S2 and S3" + s2==s3);
		System.out.println();

		System.out.println("S3 and S4 " +s3.equals(s4));
		System.out.println("S4 and S4 "+ (s3==s4));
		System.out.println();

		System.out.println("S! and S4 " +s1.equals(s4));
//		System.out.println("S! and S4"+ (s1==s4));
		
		Integer a = 10;
		Integer b= 10;
		
		System.out.println("A n B "+ a.equals(b));
		System.out.println("A n B "+ (a==b));
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		
		
		

		
	}

}
