import java.util.Scanner;

public class ControlFlowLoop {

	public static void main(String[] args) {
		for (int i = Integer.MAX_VALUE; i > -1; i++) {
			System.out.println(i);
		}

		for (int i = 0; i <= 5; i++) {
			System.out.println("hi");
		}

		System.out.println("**************");

		for (int i = 0; i < 3; i++) {
			System.out.println("hi");
			if (i == 1)
				break;
			System.out.println("hello");
		}

		for (int i = 1; i < 10; i = i + 2) {
			System.out.println(i);
		}

		System.out.println("******** while ******");

		Scanner sc = new Scanner(System.in);
		System.out.println("do u wish to shop");
		boolean status = sc.nextBoolean();
		while (status) {
			System.out.println("browsing browsing....");
			System.out.println("type 1 for add cart and 2 for checkout");
			int option = sc.nextInt();
			if (option == 2)
				break;
		}

		System.out.println("thank you for shopping");

		do {
			System.out.println("type 1 for deposit and 2 for withdraw and 3 for exit");
			int option = sc.nextInt();
			if (option == 3)
				break;
		} while (true);
		System.out.println(" thank you for using java bank");

		System.out.println("******** switch case *******");

		int option = 5;
		switch (option) {
			case 1:
				System.out.println("deposit");
				break;
			case 2:
				System.out.println("withdraw");
				break;
			case 3:
				System.out.println("check balance");
				break;
			default:
				System.out.println("exit");
				break;
		}
		

	}

}
