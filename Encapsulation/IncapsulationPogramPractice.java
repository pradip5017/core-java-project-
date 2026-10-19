package Encapsulation;

import java.util.Scanner;

class Bank
	 {
		
		 private String accountHolder;
		 private double balance;
		 
		 public String getAccountHolder()
		 {
			 return accountHolder;
		 }
		 
		 public void setAccountHolder(String accountHolder)
		 {
			 this.accountHolder=accountHolder;
		 }
		 
		 public double getBalance()
		 {
			 return balance;
		 }
		 
		public void deposite(double amount)
		 {
			 balance =balance + amount;
			 System.out.println("Deposite balance +"+amount+" your balance is :"+balance); 
		 }
		
		 void withdrow(double amount)
		 {
			 balance = balance - amount;
			 System.out.println("withdrow amount :"+amount+" Current balance is :"+balance);
		 }
	 }

public class IncapsulationPogramPractice {
	public static void main(String[] args) {
 
		
		Bank b = new Bank();
		
		b.getBalance();
		b.deposite(20000);
		b.withdrow(10000);
		
	}

}
