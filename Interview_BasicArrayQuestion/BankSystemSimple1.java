package Interview_BasicArrayQuestion;

	 class Bank 
	 {
		 double balance;
		 
		 void deposit(double amount)
		 {
			 balance= balance +amount;
			 System.out.println(amount +" Deposit Successfully..!!");
		 }
		 void dithdrow(double amount)
		 {
			 if(amount <= balance)
			 {
				 balance = balance  - amount;
				 System.out.println(amount+" Withdrow Successfully..!!");
			 }else
			 {
				 System.out.println("Insuffisiance Balance..!!");
			 }
		 }
		 
		 void checkBalance()
		 {
			 System.out.println("Current Balance:"+balance);
		 }
		 
		 
	 }
public class BankSystemSimple1 {
	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.deposit(5000);
		b.checkBalance();
		b.dithdrow(3000);
		b.checkBalance();
		b.deposit(8000);
		b.checkBalance();
	}

}
