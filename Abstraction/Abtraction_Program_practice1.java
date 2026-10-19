package Abstraction;

import javax.swing.plaf.synth.SynthOptionPaneUI;

// Abstract program for practice

		abstract class User {
		 
		 abstract void login();
		 
		 abstract void Logout();
		 
		 void users()
		 {
			 System.out.println("user...!!");
		 }
		 	
		}
		
		class Person extends User{
			void login()
			{
				System.out.println("User Loging");
			}
			
			void Logout()
			{
				System.out.println("User Logout..!!");
			}
		}
		
		



public class Abtraction_Program_practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		p1.users();
		p1.login();
		p1.Logout();
	}

}
