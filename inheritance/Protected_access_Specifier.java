package inheritance;

class Person3
{

	protected int age;
	protected String name;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
	
	class Student4 extends Person3
	{
		private Double marks;

		public Double getMarks() {
			return marks;
		}

		public void setMarks(Double marks) {
			this.marks = marks;
			
		}

				
			
	}
public class Protected_access_Specifier {
	public static void main(String args[])
	{
		Student4 d1 = new Student4();
		d1.setAge(04);
		d1.setName("jkhsdfjkhd");
		d1.setMarks(67.5);
		
		System.out.println("Student age is="+d1.getAge());
		System.out.println("Student age is="+d1.getName());
		System.out.println("Student age is="+d1.getMarks());
		
		
	}

}
