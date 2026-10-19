package Interview_BasicArrayQuestion;
import java.util.*;
	class Bank1 
	{
		double balance;
		
		void deposit(double amount)
		{
			balance = balance +amount;
			System.out.println(amount+" Deposite Successfully..!!");
		}
		
		void withdrow(double amount)
		{
			if(amount <= balance)
			{
				balance = balance - amount;
				System.out.println(amount+" WithDrow Successfully..!!");
			}
		}
		void checkBalance()
		{
			System.out.println("Current Balance :"+balance);
		}
		
		
	}
public class BankSystemSimple2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Bank1 account = new Bank1();
		
		while(true)
		{
			System.out.println("1 Deposit :");
			System.out.println("2 WithDrow :");
			System.out.println("3 CheckBalance :");
			System.out.println("Exist Thank You..!!");
			System.out.println("Enter Choice..!!");
			
			int choice = sc.nextInt();
			if(choice ==1)
			{
				System.out.println("Enter Amount Deposit :");
				double amount = sc.nextDouble();
				account.deposit(amount);
			}
			else if(choice ==2)
			{
				System.out.println("Enter Amount WithDrow..!!");
				double amount = sc.nextDouble();
				account.withdrow(amount);
			}
			else if(choice ==3)
			{
				account.checkBalance();
			}
			else  if(choice == 4)
			{
				System.out.println("Thank You Visit Again..!!");
				break;
			}
			else {
				System.out.println("Invalide Choice ! Try Again..!!");
			}
			
		}
				
	}

}
