package Interface_Programs;


 interface Bank00{
	 public static final int accountno=12145363;
	 public static final double balance = 20000;
	 default void bankName()
	 {
		 System.out.println("Indian State Bank..!!");
	 }
	 
	 void UserName();
	 
	
	 
	 private void userAccount()
	 {	 
		 System.out.println("Account number :"+accountno);
	 }
	 
	 default void show()
	 {
		 this.userAccount();
	 }
	 
 }
 
 	interface Balance extends Bank00
 	{
 		void Checkbalance();
 		
 		void WithdrowAmount();
 		
 		static void BankBranch()
 		{
 			System.out.println("Pune Branch..!!");
 		}
 		
 	}
 	
 	class User00 implements Balance
 	{
 		public void UserName()
 		{
 			System.out.println("Pradip Rathod :");
 		}
 		public void  Checkbalance()
 		{
 			System.out.println("User balance : "+balance);
 		}
 		public void WithdrowAmount()
 		{
 			System.out.println(" WithDrom Amount 10000 rs :");
 			
 			System.out.println(" Current Balance : "+(balance - 10000));
 		}
		
 	}
public class Java8FeatureAddInInterface1 {

	public static void main(String args[])
	{
		User00 u1 = new User00();
		
		u1.bankName();
		u1.UserName();
		u1.show();
		u1.Checkbalance();
		u1.WithdrowAmount();
		Balance.BankBranch();
	}
}
