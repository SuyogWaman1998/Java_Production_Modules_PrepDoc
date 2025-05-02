package strings;

/*
 * String immutability concept is one of amongst core concept of java 
 * which holds power to preserve the original object 
 * If we want to make any class Immutable then following condistions should be matched 
 * 1 -> An object must have its original value as it is.
 * 2 -> If we try to perform any operration on that object then 
 *      i) if the value is changes we will have to create new object 
 *      ii) if the value is same as original object then the 2nd refecence will point to same object. 
 *      
 *      Below is the example of Immutable class 
 */

class Test {
	private int i;
	
	Test(int i){
		this.i=i;
	}
	public Test modify(int i) {
		if(this.i == i) {
			return this;
		}
		else {
			return new Test(i);
		}
	}
}

public class StringImmutability {
	
	public static void main(String[] args) {
		Test t = new Test(10);
		Test t1 = t.modify(100);
		Test t2 = t.modify(10);
		
		System.out.println(t);
		System.out.println(t1);
		System.out.println(t2);
		
		System.out.println(t==t1);
		System.out.println(t==t2);
		System.out.println(t1==t2);

	}

}
