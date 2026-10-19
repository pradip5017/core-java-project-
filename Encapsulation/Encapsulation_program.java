	package Encapsulation;
	
	
	//Encapsulation=> setter,getter(with return statement),abstraction,inheritance,polymorphism
	
	//1.purpose  => to provide security to the data
	//2.definition  => Encapsulation is the [process of binding/wrapping data members(instance variable) or
	//member function(instance method) together inside one single unit/class
	
	//3.e.g capsule, CD, 
	//4.how to implement?  =>
	   //1.to declare all the instance variable of a class as a private
	  // 2.needs to create setter and getters(methods) for each and every instance variable of a class
	
	
	
	
	/*Setters and getters are the conventional/traditional methods of a java in           
	 * which setters are used to set/initialize/change
	 * 
	the value of instance variable where as getters are used to get the value of 
	instance variable
	 
	 and through setters and getters we can set or get the values separately rather 
	 than setting and getting it by using one single method(like accept)
	*/
	/*why we need to create setter and getters?
	=> through the setter and getters we can initialize single property of an
	object at a time so that the property will be more secure*/
	
	
	
	class Login
	{
		private int uid;
		private String uname;  // private is a secure of all data (secure)
		private String password;
		
		void setUid(int uid)
		{
			this.uid=uid;
			
		}
		
		void setUname(String uname)
		{
			this.uname=uname;
		}
		
		void setPassword(String password)
		{
			this.password=password;
		}
		
		int getUid()
		{
			return uid;
		}
		
		String getUname()
		{
			return uname;
		}
		
		String  getPassword()
		{
			return password;
		}
		
	}
			
	
	public class Encapsulation_program {
		public static void main(String args[])
		{
			Login l1 = new Login();
			l1.setUid(11);
			l1.setUname("ram");
			l1.setPassword("euiry66");
			
			System.out.println("Id is="+l1.getUid());
			System.out.println("name is="+l1.getUname());
			System.out.println("password is="+l1.getPassword());
			
			
			
	//		.args..args..args..args..args.clone().
			
			Login l2 = new Login ();
			System.out.println("The name is ="+l2.getUname());
			
		}
	}
