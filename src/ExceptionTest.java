
public class ExceptionTest {
	
	static Amazon amz=new Amazon();
	
	public static void main(String[] args) {
		int a=20;
		System.out.println("a");
		try {
			System.out.println(amz.customer);
			
			int i=10/2;
			Method3 m3=new Method3();
			m3.test();
			String[] arr=new String[3];
			System.out.println(arr[1]);
			
		}
		// throwable > Exception > RuntimeException > NullPointerexception
		// child exception first than parent exception
		catch(ArrayIndexOutOfBoundsException in) {
			System.out.println("array index SHOULD be less than total size");
		}
		catch(NullPointerException npe) {
			System.out.println("please initialize variable before applying dot operator");
		}
		catch(ArithmeticException ae) {
			System.out.println("dividing a number by 0 gives infinity.. infinity cannot be stored in int data type");
		}// not guaranteed
		catch(RuntimeException re) {
			
		}
		catch(Exception e) {
			
		}
		catch(Throwable e) {
		
		}
		// guaranteed block
		finally {
			System.out.println("Thank you for using java");
		}
		
	}

}
