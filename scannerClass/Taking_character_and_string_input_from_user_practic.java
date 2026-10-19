package scannerClass;

import java.util.Scanner;

class Emp
{
	int id;
	String name;
	int age;
	String add;
	
	//next() => method takes an input till next word occurres in an input(means it doens not take an input after the space)
		 //next() => method takes an input till next line occurres in an input(means it take an input after the space till next line)

	void accept()
	{
		System.out.println("Enter the value of student id, name, age, address=");
		Scanner sc = new Scanner(System.in);
		
		//String to int conversion(casting)
		
		id =Integer.parseInt(sc.nextLine());  //"56enter" taking int input in string format

		name = sc.nextLine();   //jdjsdenter enter //next(), nextLine()
		age = sc.nextInt();
		add = sc.next();
	}
	
	void display()
	{
		System.out.println("The student is="+id);
		System.out.println("The student name is="+name);
		System.out.println("The student age is="+age);
		System.out.println("The student address is="+add);
		
	}
}

public class Taking_character_and_string_input_from_user_practic {
	public static void main(String args[])
	{
		Emp e1 = new Emp();
		e1.accept();
		e1.display();
		
		
		Emp e2 = new Emp();
		e2.accept();
		e2.display();
	}

}
