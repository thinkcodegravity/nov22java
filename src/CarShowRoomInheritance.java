import java.util.Scanner;

// Runtime Polymorphsim
public class CarShowRoomInheritance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("press 1 for basic, 2 for econmoy, 3 luxury, 4 super car , 5 flying car test drive");
		int choice = sc.nextInt();
		Car ca=null;
		if (choice==2) 
			ca=new Toyota();
		else if (choice==3) 
			ca=new Nissan();
		else if(choice==4) 
			ca=new Ferari();
		else if(choice==5) 
			ca=new FlyingCar();
		else
			ca=new Car();
		
		testDrive(ca);
	}
	
	public static void testDrive(Car c) {
		c.drive(); // RUN TIME polymorphism
		// the TRUE object in c variable
		// method gets called
	}

}
