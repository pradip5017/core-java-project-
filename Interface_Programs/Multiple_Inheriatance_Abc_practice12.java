package Interface_Programs;

	interface Companyy{
		
		void companyName();
		void  companyAddress();
	}
	
	interface Department{
		void Developers();
		void sales();
		void finance();
		void marketing();
		
	}
	
	interface Employees {
		public static final int eid=11;
		public static final String ename="pradip";
		public static final String eaddress ="pune";
		
	}
	
		class Emp10 implements Companyy, Department, Employees
		{
			public  void companyName()
			 {
				 System.out.println("Company name is  = Pradip Tech Soft pvt. ltd.");
			 }
			
			public void companyAddress()
			{
				System.out.println("Company Address is = Pune Maharashtra" );
			}
			
			public void Developers()
			{
				System.out.println("font- End Developer");
				System.out.println("Back - End Developer");
				System.out.println("Software Developer");
				System.out.println("Full Stack Java Developer");
				
			}
			
			 public void sales()
			 {
				 System.out.println("Sales Department ");
			 }
			 public void finance() {
				 System.out.println("Finance department");
			 }
			 public void marketing()
			 {
				 System.out.println("Marketing department..!!");
			 }
			 
			 void getData()
			 {
				System.out.println("Employee id ="+eid);
				System.out.println("Employee name = "+ename);
				System.out.println("Employee address ="+eaddress);
			 }
			 
		}
public class Multiple_Inheriatance_Abc_practice12 {
	public static void main(String args[])
	{
		
		Emp10 e1 = new Emp10();
		e1.companyName();
		e1.companyAddress();
		e1.Developers();
		e1.sales();
		e1.finance();
		e1.marketing();
		e1.getData();
				
	}

}
