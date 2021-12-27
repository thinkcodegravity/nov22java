
public class Methods {

	String name="john"; // global , long term 
	
	// method declaration
	public  boolean login(String userid, String password)  {
		// method body.. algorithm, logic, instructions, steps
		// algorithm - Control flows, operators, 
		// Output - return statement
		// output is primitive = return literal value or variable of same output type
		int a=10;
		String b="john";
		boolean c=true;
		
		// return false;
		return c;
	}
	public int add(int a, int b) {
		int p=20;
		String q="john";
		boolean r=true;
		int s=50;
		// return 10;
		//return true;
		//return p;
		// return q;
		//return r;
		return s;
	}
	
	public  boolean changePassword(String newPassword)  {
		return true;
	}
	
	public  void register(String userid, String password,String name
			,String address)  {
		 
	}
	
	public Address getStoreAddress(String shopName) {
		int zip=12345;
		String city="new york";
		String state="NY";
		// return "street1, new york, NY,12345";
		// return zip;
		// return city;
		// return state;
		Address a1=new Address();
		return a1;
	}
	
	
}
