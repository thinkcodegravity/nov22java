
public class Address {
	short	streetNumber=123;
	String	city="new york";
	String	state="ny";
	// 4 bytes in memory
	int	zip=12345; // 2 billion 
	// zip = 5 digit ... 99999
	String	country="USA";

	public void changeZip() {
		System.out.println("changing zip");
	}
}
