package Interface_Programs;

	interface Company11 {
		
		void companyName(); //only declation not defination in the inteface method
		void companyAdd();
	}
	interface Employee extends Company11{
		void EmployeeName();
		void EmployeeAdd();
	}
	class Emp11 implements Employee{
		
		public void companyName()
		{
			System.out.println("The Company name is = TCS");
		}
		public void companyAdd()
		{
			System.out.println("Company Address is Pune");
		}
		
		public void EmployeeName()
		{
			System.out.println("Employee name is = Pradip Rathod");
		}
		
		public void EmployeeAdd() {
			System.out.println("Employee Address is = Beed Maharashtra");
		}
	}
public class Interface_extends_interface_practice {
	public static void main(String args[])
	{
		Emp11 e1 = new Emp11();
		e1.companyName();
		e1.companyAdd();
		e1.EmployeeName();
		e1.EmployeeAdd();
	}

}
