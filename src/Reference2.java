
public class Reference2 {

	public static void main(String[] args) {
		Amazon amazon=new Amazon();
		Amazon wholefood=new Amazon();
		
		//#abc 
		// shared bank locker = partners duplicate key
		Address a=amazon.customer.shippingAddress;
		System.out.println(a.city);
		System.out.println(a.streetNumber);
		System.out.println(a.state);
		System.out.println(a.zip);
		
		/*
		Buyer buyer=new Buyer();
		System.out.println(buyer.price);
		System.out.println(  );
		buyer.shippingAddress.changeZip(  );
		*/
	}

}
