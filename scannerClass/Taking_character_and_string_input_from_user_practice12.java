package scannerClass;

import java.util.Scanner;

class User{
		
		int id;
		String name;
		double marks;
	
		
		
	
	void display()
	{
		System.out.println("User inpute values..!!");
		
		Scanner sc = new Scanner(System.in);
				
			id= Integer.parseInt(sc.nextLine());
			name= sc.nextLine();
			
			marks = sc.nextDouble();

	}
		void getdata()
		{
			System.out.println("User id is ="+id);
			System.out.println("User name is ="+name);
			System.out.println("User Marks is ="+marks);
			
		}
	}
	

public class Taking_character_and_string_input_from_user_practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User u1 = new User();
		u1.display();
		u1.getdata();
	}

}
