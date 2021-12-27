public class InheritanceTest {
	public static void main(String[] args) {
		
		
		Child c=new Child();
		c.test(    );
		
		Iphone i=new Iphone6();
		i.text();
		i.call();
		i.browse();
		((Iphone6)i) .camera();
		
		
		GrandParent p3=new Child();
		if( p3 instanceof Child)
			System.out.println("Child object");		
		else if( p3 instanceof Parent)
			System.out.println("parent object");
		
		
		
		
		
		
	}
}