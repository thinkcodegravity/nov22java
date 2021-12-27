public class Method4 {
	public static void main(String[] args) {
		Method3 m3=new Method3();
		Person per=new Person();
		int a=10;
		int b = a;
		per=m3.test(per,a);
		System.out.println(per.name);
		System.out.println(a);
		
		
		
		
	}
}