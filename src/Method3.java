
public class Method3 {
	public Person test(Person p, int x) {			
		p.name="jane";		
		test2(p);		
		p=new Person();		
		return p;		
	}			
	public void test2(Person p2) {			
		p2.name="mike";		
		test3(p2);		
	}			
	public void test3(Person p3) {			
		p3.name="andy";		
	}			

}
