	package Interface_Programs;
	
	
	interface Student{
		
		public abstract void sid();
		public abstract void Sname();
	
	}
	
	interface Emp2111 {
		
		public abstract void EmpName();
		
	}
	
	interface Company{
		
		void companyname();
	
	
		String job();
	}
	
	
	class Person121 implements Student, Emp2111, Company {
		
		public void sid()
		{
			System.out.println("the Student id is");
		}
		
		public void Sname()
		{
			System.out.println("the student name is pradip");
		}
		
		public void EmpName()
		{
			System.out.println("Emo name is xyz");
		}
		
		public String job()
		{
			return "pradip";
		}
	
		@Override
		public void companyname() {
			System.out.println("tcs");
			
		}
	
		
	
		
		
	}
	
	public class Multiple_Inheriatance_Abc_practice {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			Person121  s1 = new Person121();
			s1.sid();
			s1.Sname();
			s1.EmpName();
			System.out.println("The emp job is" +s1.job());
			
		}
	
	}
