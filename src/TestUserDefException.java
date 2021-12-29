
public class TestUserDefException {

	public static void main(String[] args) {
		Banking b=new Banking();
		try {
			b.withdraw(150);
		} catch (InsufficientFundException e) {
			e.printStackTrace();
		}
	}

}
