package Abstraction;


	abstract class CompanyInfo{
		int cid=11;
		String cname="pradip";
		String caddress="pune";
		String c_sector="IT Sector";
		
		abstract void companyDetails();
		
		void companyIntro()
		{
			System.out.println("Company Id="+cid);
			System.out.println("Company Name="+cname);
			System.out.println("Company Address="+caddress);
			System.out.println("Company sector="+c_sector);
		}
		
		abstract void companyIOS();
		
	}
	
	class NewCompany extends CompanyInfo
	{
			void companyDetails()
			{
				System.out.println("This company are Software Company..!!");
			}
			
			void companyIOS()
			{
				System.out.println("IOS register company..!!!");
			}
	}

public class Abstract_Class_Practice1 {
	public static void main(String args[]) {
		
		NewCompany n1 = new NewCompany();
		n1.companyIntro();
		n1.companyDetails();
		n1.companyIOS();
	}

}
