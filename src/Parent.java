
public class Parent extends GrandParent {
	int a=20;
	int p=20;
	public void test() {
		System.out.println("poly parent method test");
	}
	public Car test(String s1,String s2) {
		System.out.println("poly parent method test");
		return new Car();
	}
	public Parent(){
		System.out.println("constructing parent");
	}
	public Parent(String s){
		System.out.println("constructing parent");
	}
	public Parent(int x){
		System.out.println("constructing parent");
	}
}
