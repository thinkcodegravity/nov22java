
public class ConstructorTest {

	public static void main(String[] args) {
		
		Student s1=new Student();
		
		
		
		// new = Object creation in memory
		Person p1=new Person("jane");
		Person p2=new Person("mike",10);
		Person p3=new Person("andy",20,"newyork");
		
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
	}

}
