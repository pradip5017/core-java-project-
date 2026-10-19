package Abstraction;
	
		abstract class Company1{
			 void Department()
			 {
				 System.out.println("Develop A Company : Pradip Tech Soft");
			 }
			 
			 abstract void Acount();
			 abstract void Developer();
			 abstract void designer();
			 abstract void sales();
			 abstract void purchase();
			 
		}
		
			class CompanyNew extends Company1{
				
				void Acount()
				{
					System.out.println("Acountant Department Employee ");
				}
				
				void Developer()
				{
					System.out.println("Developer Department..!!");	
				}
				void designer()
				{
					System.out.println("Designer Departnment..!!");
				}
				void sales()
				{
					System.out.println("Sales Departnment..!!");
				}
				void purchase()
				{
					System.out.println("purchase departmetnt");
				}
			}
		public class Abstract_program50 {
			public static void main(String args[])
			{
				
				CompanyNew c1 = new CompanyNew();
				c1.Department();
				c1.Acount();
				c1.Developer();
				c1.designer();
				c1.sales();
				c1.purchase();
						
			}
			
			}
