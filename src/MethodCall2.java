
public class MethodCall2 {

	
	public static void main(String args[]) {
		MethodCall1 m1=new MethodCall1();
		int p=20;
		String q="john";
		int result=m1.test1( p  );
		System.out.println( result);
	}
/*
1) Pass input that match data type				x , y, p are int, int ,String as needed by callee program
	If callee need primitive input - you can pass variable of same type or literal value			
	If callee need complex/Object input - you can pass variable of same type			
2) Pass input in the same order				pass same order int,int,String as needed by calling program
3) pass equal amount of input				3 inputs are needed by add, caller program passes 3
4) handle return type/output from caller program in same type				
	add method returns "int"… Callee program stores output in "int" variable result			
 
 
 */
	
}
