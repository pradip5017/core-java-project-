	package scannerClass;
	
	import java.util.Scanner;
	
	class Stud
	{
		int rno;
		String name;
		char  div;
		double  marks;
	
	
	void accept()
	{
		System.out.println("Enter the value of  rno, name, div, and marks=");
		Scanner sc= new Scanner(System.in);
		
	//	String integer convert to => rollno=(Integer.ParseInt(sc.nextLine())
		rno= Integer.parseInt(sc.nextLine()); //
		name = sc.nextLine();
		div= sc.next().charAt(0);
		marks = sc.nextDouble();
	}
	
	void display()
	{
		System.out.println("the student roll no is= "+rno);
		System.out.println("the student name  is= "+name);
		System.out.println("the student div  is= "+div);
		System.out.println("the student marks  is= "+marks);
		
	}
	}
	
	public class Taking_character_and_string_input_from_user {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Stud s1 = new Stud();
			s1.accept();
			
			s1.display();
			
			Stud s2 = new Stud();
			s2.accept();
			
			s2.display();
	
			
		}
	
	}
