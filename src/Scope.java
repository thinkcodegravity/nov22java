
public class Scope {
	 String abcd="mike"; // Global variable = static, instance 
	
	//global and paramteric/local CAN have same name
	// perfernce goes to local
	// explicitly need global say... this.

	public void test3() {
		
		String abcd="jane";
		System.out.println( this.abcd);
	}
	
	public static void main (String[] args) {
		Scope s=new Scope();
		s.test3();
	}
	
	public int add(int a, int b) { // parametric variable
		int c=30; // local variable
		//int a=50;
		System.out.println( abcd );
		System.out.println(  a );
		{
			{ // opening bracket
				int x=20; // range/scope/visibility = FROM declared line TO end of block 
				{
					// nested block
					System.out.println(x);
				}
				System.out.println(x);
			}// closing bracket
		//	System.out.println(x);
		}
		return c;
	}
	
	public void hello() {
		System.out.println( abcd );
		//System.out.println( a  );
		
	}
	
	public void test() {
		{
			{
				int x=30; // FROM line declared TO end of its block
				{
					int y=20;
					{
						
					}
					
				}// y variable from line #36.. will be deleted from memory		
				
			}
			int y=30;
		}
		
		
	}
	
	// conflicts
	// parametric and local variable in a method should NOT have same name
	// global and paramteric/local CAN have same name
		// perfernce goes to local
		// explicitly need global say... this.
	// local variable CAN have duplicate name if outside block range
	
	// visibility
	// global variable are visible throughout the program
	// parametric variable are visible throughout its OWN method
	// local variable are visible in a certain block
}
