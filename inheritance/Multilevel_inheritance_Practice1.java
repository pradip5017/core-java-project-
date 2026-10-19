package inheritance;

	class Company{
		
		String companyName;
		String CompanyAddress;
	}
	
	class Department extends Company{
		
		void Developer()
		{
			System.out.println("Company Details..!!");
		}
		String developer1;
		String  developer2;
		
	}
	
		class Employees extends Department
		{
			
//			super.Developer();
			int eid;
			String ename;
			String eaddress;
			
		void getData(String companyName, String CompanyAddress, String developer1 , String developer2, int eid, String ename, String eaddress )
		{
			
			this.companyName=companyName;
			this.CompanyAddress=CompanyAddress;
			this.developer1=developer1;
			this.developer2=developer2;
			this.eid=eid;
			this.ename=ename;
			this.eaddress=eaddress;
			
		}
			void putData() {
					System.out.println("Company Name="+companyName);
					System.out.println("Company Address="+CompanyAddress);
					System.out.println("Company Developer1="+developer1);
					System.out.println("Company Developer2="+developer2);
					System.out.println("Employees Id="+eid);
					System.out.println("Employees Name="+ename);
					System.out.println("Employees Address ="+eaddress);
					
				}
		}
public class Multilevel_inheritance_Practice1 {
	public static void main(String args[])
	{
		Employees e1 = new Employees();
		e1.Developer();
		e1.getData("TCS", "Pune", "Software Developer", "Full Stack Java Developer ", 1, "Pradip", "Pune");
		e1.putData();
				
		
	}

}
