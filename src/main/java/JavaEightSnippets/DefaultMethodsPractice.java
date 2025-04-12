package JavaEightSnippets;

 interface I{
	public void m1();
	public void m2();
	default public void m3() {
	}
}

public class DefaultMethodsPractice implements I {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
public static void main(String[] args) {
	System.out.println("Code compiled");
}

}

class Demo implements I{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}
