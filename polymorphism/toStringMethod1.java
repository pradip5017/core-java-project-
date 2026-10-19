package polymorphism;
 class Student
 {
	 	int id ;
		String name;
		String address;
		
		Student(int id, String name, String address)
		{
			this.id=id;
			this.name=name;
			this.address=address;
		}
		
		public String toString()
		{
			return "Student Id :"+id+"\nStudent Name :"+name+"\nStudent Address :"+address;
		}
 }
public class toStringMethod1 {
	public static void main(String args[])
	{
		Student s1 = new Student(1,"Pradip","pune");
		
		System.out.println(s1);
		
	}

}
