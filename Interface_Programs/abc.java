	package Interface_Programs;
	
	
	// what is difference between abstract class and method
	// abstract class can not create object because 
	// abstrac class can access modifier  public, private , protected, and default
	// abstract class can declare instance variable in abstract class
	// abstract class can access abstrac method and concreate method
	
	//interface is nothing but a abstract class
	// we can not create interface object can create object to implement another class and crate object 
	// interface class we can not allow instance method
	// interface is allow after java 8 feature , method private and default and static 
	//interface is allow multiple inheritance 
	//  we can desclar instance variable in interface  bydefault  consist public static final 
	
	
	abstract  class Employee98	{
//		
//		int id = 12;
//		String name ="Karna";							
//			
//		static String College = "modern";
//		
//		 Employee98(int id, String name)
//		 {
//			  this.id =id ;
//			 this.name=name;
// 
//		 }
//		 
//		 Employee98 ()
//		 {
//			 this.id=23;
//			 this.name="laikhab";
//		 }
//		public void put()
//		{
//				 System.out.println("Employee id  ="+id);
//				 System.out.println("Employee name ="+name);
//				 System.out.println("Employee College ="+College);
//		}
//		public static void m12()
//		{
//			Employee98.m13(1,"pradip");
//			Employee98.f1();
//			System.out.println("m12 method called");
//		}
//		public static void m13(int eid,String name)
//		{
//			System.out.println(eid);
//			System.out.println("m13 called()");
//		}
//		public void f1()
//		{
//			
//			System.out.println("Employee() method called");	
//		}
//		public abstract void m1();
//		
//			}
//	
	}
	class Manager11 extends Employee98
	{
//		
//		Manager11(int id, String name)
//		{
//			this.id=id;
//			this.name=name;
//		}
//		
//		
//		void get()
//		{
//			 System.out.println("Employee id  ="+id);
//			 System.out.println("Employee name ="+name);
//			 System.out.println("Employee College ="+College);
//		}
//	
//		public void m1()
//		{
//			System.out.println("m1 method called");
//		}
//		public void f1()
//		{
//			m1();
//			System.out.println("f1 methof called");
//		}
	

	
	public void m1(int id, String name)
	{
		System.out.println(id);
		System.out.println(name);
	}
	}
	
	
	public class abc {
		public static void main(String args[])
		{
			
			Manager11 emp1 = new Manager11();
//			emp1.m1(1,"hsw");
			emp1.m1(2,"jdhfd");
			
			
			
			
			
			
//			emp1.f1();
//			Manager11 M = new Manager11(1 , "pradip");
//			M.m12();
////			Employee98::f1(&emp1);
//			emp1.put();
//			
//			Employee98.m12();
			
			
			
		}
	
	}
	
