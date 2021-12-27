
public interface IAreaCalculator {
	public int add(int a,int b);
	public int calculateCircle(int radius);
	public int calculateSquare(int side);
	default int test() {
		return 30;
	}
}
