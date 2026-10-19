	package Class_and_object;
	
	
	class Student1{
		
		int rollno;
		String name;
		long phone;
		boolean isPresent;





		Student1(int a, String b, long c, boolean d)
	{ //paramitric constructor assign
		rollno = a;
		name = b;
		phone = c;
		isPresent = d;
		
	}
	
		Student1()
	{ //non paramitric constructor assign
		rollno = 45;
		name = "java";
		phone = 6786238;
		isPresent = true;
	}

		void putData()
		{
			System.out.println("Stude roll=" +rollno);
			System.out.println("Student Name = " +name);
			System.out.println("phone number="+phone);
			System.out.println("Is student present is session "+isPresent);
			
		}
		
		
		}
		
		public class Constructor1 {
			
			public static void main(String args[])
			{
				Student1 u1= new Student1(33, "javcv" , 23784234l, true);
				u1.putData();
				
				Student1 u = new Student1();
				u.putData();
				
				
			}
		
		}
