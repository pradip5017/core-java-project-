package Interface_Programs;
	
	interface Payment
	{
		void pay();
	}
	class UpiPayment implements Payment
	{
		public void pay()
		{
			System.out.println(" UPI Pay Payment..!! ");
		}
	}
	
	class NetBankingPayment implements Payment
	{
		public void pay()
		{
			System.out.println(" net Banking pay Payment..!!");
		}
		
		
	}
	
	class Bank
	{
		void proccesPay( Payment payment)
		
		{
			payment.pay();
		}
	}
public class LooseCuplingProgram {
	public static void main(String[] args) {
		
		Payment p = new UpiPayment();
		p.pay();
		
		
		Payment p1 = new NetBankingPayment();
		p1.pay();
		
		Bank b1 = new Bank();
		b1.proccesPay(p);
		
				
	}

}
