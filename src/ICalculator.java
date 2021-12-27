// abstract = incomplete class
// concrete = complete class
public interface ICalculator {
	int interfaceVar=10;// constant/final variable
	// abstract method
	public int add(int a,int b);
	public int sub(int a,int b);
	public int mul(int a,int b);
	public int div(int a,int b);
	default int test() {
		return 20;
	}
}
