
public class Person {
	String name="john";// instance variable
	int age=0;
	String city="";
	
	public Person(String s) {
		name=s;
	}
	public Person(String s,int a) {
		name=s;
		age=a;
	}
	public Person(String s,int a,String c) {
		name=s;
		age=a;
		city=c;
	}
	
	public int add(int a, int b) {
		return 1;
	}
}
//	Peron p=new person();
// 	p.add( ); method call