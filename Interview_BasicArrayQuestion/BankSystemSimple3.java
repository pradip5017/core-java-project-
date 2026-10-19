package Interview_BasicArrayQuestion;

	class Bank2
	{
		double balance;
		
		void deposite(double amount)
		{
			balance= balance +amount;
			System.out.println(amount+" Deposite Balance:");
		}
		void withDrow(double amount)
		{
			if(amount <= balance)
			{
				balance = balance - amount;
				System.out.println(amount+" WithDrow:");
			}else
			{
				System.out.println(" Invalid Account..!!"+amount);
			}
		}
		
		void checkBalance()
		{
			System.out.println(balance+" Balance :");
		}
	}
public class BankSystemSimple3 {
	public static void main(String[] args) {
		
		Bank2 b1 = new Bank2();
		b1.deposite(5000);
		b1.checkBalance();
		
		b1.withDrow(10000);
		b1.checkBalance();
	}

}
