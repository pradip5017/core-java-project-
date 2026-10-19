package Interview_Question_practice;
	abstract class A{
	public void put() {
		System.out.println("Putting Data..!!");
	}
	abstract void get();
	
}
	abstract class B extends A{
		abstract void m1();
		public void get()
		{
			System.out.println("Getting Data..!!");
		}
		void put1()
		{
			System.out.println("poiwjfd");
		}
	}
	
		 class C extends B {
			public void put()
			{
				System.out.println("puting..C");
			}
			public void m1()
			{
				System.out.println("M1");
			}
		 }
	
public class AbstractClass {
	public static void main(String[] args) {
	
		C b1 = new C ();
		b1.put();
		b1.get();
		b1.m1();
		b1.put1();
				
	}
}
