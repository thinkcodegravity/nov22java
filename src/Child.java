
public class Child extends Parent {
	int b=30;
	int p= 10;
	public void test(String s) {
		System.out.println("poly child method test");
	}
	public void test(boolean b) {
		System.out.println("poly other child method test");
	}
	public Nissan test(String s1,String s2) {
		System.out.println("poly parent method test");
		return new Nissan();
	} 
	
	
	
	
	
	public void test2() {
		int p=5;
		System.out.println( super.p );
		System.out.println("in child method test2");
	}

	public Child(){
		super();
		System.out.println("constructing child");
	}
}
