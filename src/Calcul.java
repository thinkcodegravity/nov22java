
public abstract class Calcul 
implements ICalculator,IAreaCalculator{

	public int test() {
		return 40;
	}
	
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
// 	div, cirlce, square	
}
