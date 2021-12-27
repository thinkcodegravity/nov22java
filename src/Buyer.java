
public class Buyer {
	// simple/ primitve data type
	long contact=1231231231; //declaration
	float price=0.0f;
	boolean activeStatus=true;
	Address shippingAddress=new Address();
	CC creditCard=new CC();
	
	public void shop() {
		System.out.println( contact );
		System.out.println("shopping");
	}
}
