package Static_keyword;

//3. instance initializer block  called after static blocks
//3. static -block called very first as compare to instance initializer block ,constrcutor,method


//if we have instance initializer block ,static block,,constructor,method in one class then the execution sequence be like: 1.static block,  2.instance initializer block, 3.constructor 4.method


//1.static keyword is used to DECLARE variable,method,block,class as a static 
//non-static method called by=> object name
//static method called by => class name

//2.advantage=> if we declare data(variable,method) as a static then to call that static data,we dont't need to create an object of a class
//bcz,we can call that data using class name

//static variable(common) => static variable refers to common property of an object
//means we don't have to initialized static variable with each object...we can initialized it only once and that one value is shared by all the objects of a class 
//and hence static variable is used to save memory space
		
		class Emp13
		{
			
		int id;
		String name;
		static String company;
	
		
			Emp13(int id, String name)
		{
			this.id=id;
			this.name=name;
			
		
		}
		
	
			void show()
		{
			System.out.println("Employee id is ="+id);
			System.out.println("Employee name is ="+name);
			System.out.println("Employee company name is ="+company);
			
		}
			
		
			//2.static -block  is a CLASS level block and hence it calls only once at that of very first time in a program
		
			
			{ 
				//1.instance initializer block => is used to initialized non-static means instance variables members
				System.out.println("\n instance variable and instance block\n");
				id=55;
				name="Jivan";
				
				 //instance initializer block => is used to initialized non-static means instance variables members
			}
			
			
			 static   //3. static -block called very first as compare to instance initializer block ,constrcutor,method
			 				//******difference between instance initializer and static block
			  {
				  System.out.println("\nin static block");
				  company="tcs";
				//1.static -block => is used to initialized static members/variables
		}
		}
		//2.instance initializer block  is a OBJECT level block hence it calls multiple times depends upon number of objects that we have created for that clas
		
		public class Static_block {
			
			
			public static void main(String args[]) 
			{
				
		//	Emp13.chenge();  //static method called by class name
				
			System.out.println("Emoloyee names");
			Emp13 e = new Emp13(11, "ram");
			e.show();
			
			
			Emp13 e1 = new Emp13(12, "sham");
			e1.show();
			
			
			Emp13 e2 = new Emp13(13, "Jiva");
			e2.show();
			
			
		}
		}

//2.instance initializer block  is a OBJECT level block hence it calls multiple times depends upon number of objects that we have created for that clas
//2.static -block  is a CLASS level block and hence it calls only once at that of very first time in a program
	


//******difference between instance initializer and static block
//1.instance initializer block => is used to initialized non-static means instance variables members
//1.static -block => is used to initialized static members/variables


//2.instance initializer block  is a OBJECT level block hence it calls multiple times depends upon number of objects that we have created for that clas
//2.static -block  is a CLASS level block and hence it calls only once at that of very first time in a program

//3. instance initializer block  called after static blocks
//3. static -block called very first as compare to instance initializer block ,constrcutor,method


//if we have instance initializer block ,static block,,constructor,method in one class then the execution sequence be like: 1.static block,  2.instance initializer block, 3.constructor 4.method


