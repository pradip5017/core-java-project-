package Interface_Programs;

	interface Payment1
	{
		public static final int balance = 200000;
		default void payment1()
		{
			System.out.println("Paid Payment..!!");
		}
		void pay();
		
		void Balance();
	}
	
	interface Bankk extends Payment1
	{
		void bankName();
		
		 private void BankAccount()
		{
			System.out.println("12353645");
		}
		 static void Address()
		 {
			 System.out.println("Pune Maharashtra..!!");
		 }
		
		 default void showAccount()
		 {
			 this.BankAccount();
			 
		 }
		 
	}
	
	
	class BankUser implements Bankk
	{
		
		public void bankName()
		{
			System.out.println("SBI bank in India..!!");
		}
		public void Balance()
		{
			System.out.println("Balance is :"+balance);
		}
		public void pay()
		{
			System.out.println("Pay Payment..!!");
		}
		
	}
public class Java8FeatureAddInInterface {
	public static void main(String[] args) {
		
		BankUser u1 = new BankUser();
		u1.bankName();
		u1.Balance();
		u1.pay();
		u1.payment1();
		u1.showAccount();
		
		Bankk.Address();
		
		
	
	}

}
