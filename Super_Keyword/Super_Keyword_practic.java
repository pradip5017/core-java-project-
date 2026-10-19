	package Super_Keyword;
	
	class Employee5
	{
		String job="java Developer";
		String name;
	
		void detail()
		
	{
		
			System.out.println("Employee Details..");
	//		System.out.println(job);
	}
		
		void add()
		{
			System.out.println("Employee Addresss....");
		}
	}
	
	 class Emp15 extends Employee5
	 
	 {
		 String job= "Software Developer";
		 
		 
		void get()
		 {
			
			super.detail();
			super.add();
			 System.out.println("Chenge the Employee job Description...= "+this.job);
			 System.out.println("Supper keyword userd for call to Employee15 class ="+super.job);
			 System.out.println(job);
		 }
	 }
	 
	 
	
	public class Super_Keyword_practic {
		
		public static void main(String args[])
		{
			Emp15 e1 = new Emp15();
	//		e1.detail();
			e1.add();
			e1.get();
			
	
		}
	
	}
