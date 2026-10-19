package scannerClass;

import java.util.Scanner; 

import javax.net.ssl.SSLContext;

class Person {
		int id;
		String name;
		String address;
		double marks;
		
		void put()
		{
			System.out.println("Enter Person Details..!!");
			
			Scanner sc = new Scanner(System.in);
			
			
			id = Integer.parseInt(sc.nextLine());
			name= sc.nextLine();
			address= sc.nextLine();
			marks = sc.nextDouble();
			
			
			
			
			
		}
		void show()
		{
			System.out.println("Person id = "+id);
			System.out.println("Person name is ="+name);
			System.out.println("Person address is ="+address);
			System.out.println("Person marks is ="+marks);
		}
		
	}
public class Taking_character_and_string_input_from_user_practice {
	public static void main(String args[])
	{
		
		Person p1 = new Person();
		p1.put();
		p1.show();
	}

}
