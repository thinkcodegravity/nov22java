
public class ChaseBankAccount   {
	public static final String bankName="Chase";
	String name;
	int accountNumber;
	public ChaseBankAccount(String n,int a) {
		name=n;
		accountNumber=a;
	}
	// Utility method
	public static void test1() {
		//a=20;
		System.out.println("testing");
	}
	public static void test2() {
		System.out.println( bankName); // static variable
		test1(); // static method
		//test3();
		//System.out.println(name);
	}
	public void test3() {
		System.out.println(name); // non-static instance variable
		System.out.println(bankName); // static variable
		test4(); // non-static methods
		test1();// static methods
	}
	public void test4() {
		accountNumber=1111;
	}
	public static void test5(int dynamicValue) {
		final int x=dynamicValue;
		System.out.println(x);
	}
	// members = global variable and methods
	// non static members can call EVERYEONE
	// static member can ONLY call static member
}
