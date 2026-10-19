	package Interface_Programs;
	//In Multiple inheritance ,we have multiple parent classes having single child class
	//we cannot achieve multiple inheritance directly in java, hence we need to implement the concept of interface
	
	interface Design
	
	{
		public abstract void UiDesing();
			
	}
	interface Developer
	{
		int buildingLogic(int a, int b);
		
			
	}
	
	interface Testing 
	{
		void findBugs();
		void submitreport();
	}
	
	
	class Emp implements  Design, Developer, Testing
	{
	
		@Override
		public void findBugs() {
			// TODO Auto-generated method stub
			System.out.println("Testing =>  findingBugs() ");
		}
	
		@Override
		public void submitreport() {
			// TODO Auto-generated method stub
			System.out.println("Testing =>  submitReport()");
			
		}
	
		@Override
		public int buildingLogic(int a, int b) {
			// TODO Auto-generated method stub
			return a+b;
		}
	
		@Override
		public void UiDesing() {
			// TODO Auto-generated method stub
			System.out.println("Design => creating UI of an application...");
		}
		
		
	}
	
	
	public class Multiple_Inheriatance_Abc {
		public static void main(String args[])
		{
			Emp e1 = new Emp();
			System.out.println("here is a logic of application"+e1.buildingLogic(5, 6));
			e1.UiDesing();
			
			e1.findBugs();
			e1.submitreport();
			
		}
	
	}
