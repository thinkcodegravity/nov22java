
public class Banking {
	int balance=100;
	public void withdraw(int amount) throws InsufficientFundException {
		if(balance < amount)
			throw new InsufficientFundException(" your balance is:"+balance+" , please withdraw within your limit");
		else
			balance=balance-amount;
	}
}
