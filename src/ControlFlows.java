import java.util.Scanner;

public class ControlFlows {
	// abc (2);
	public int abc(int input) {
		
		if(input==1) {
			System.out.println("in input 1");
			return 100;
		}
		else {
			System.out.println("in input not equal to 1");
			return -1;
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your pin");
		int pinEntered= sc.nextInt();
		int pinRegistered=30;
		boolean a=false;
		int balance=100;
		if( pinEntered == pinRegistered)
		{
			System.out.println(" welcome to java bank");
			System.out.println(" press 1 for withdraw");
			System.out.println(" press 2 for deposit");
			System.out.println(" press 3 for balance");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("enter amount to withdraw");
				int amountWithdraw=sc.nextInt() ;
				if( balance >= amountWithdraw   )
				{
					System.out.println("please collecct your cash");
					balance=balance-amountWithdraw;
					System.out.println("available balance is :"+balance);
				}
				else {
					System.out.println("insufficient fund");
				}	
			}
			else if(choice == 2)
			{
				System.out.println("deposit");
			}
			else if(choice == 3) {
				System.out.println("check balance");
			}
			else { // default block
				System.out.println("invalid input");
			}
		}
		else{
			System.out.println("invalid pin");
		}
		
		System.out.println("bye bye");
		
		
		
		
		
		
	}

}
