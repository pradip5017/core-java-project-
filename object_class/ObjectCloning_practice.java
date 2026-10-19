package object_class;

class Student implements Cloneable {
	
	int id;
	String name;
	String add;
	
	double mark;
	
	Student(int id , String name, String add, double mark){
		this.id=id;
		this.name=name;
		this.add=add;
		
		this.mark=mark;
	}
	
	public String toString () {
		
		return "Student [ id  is= " + id  +"   name =   "  + name  + "   address is =" +add + "  marks = "  +mark  +"]";
		
		
		
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
	
}



public class ObjectCloning_practice {
	public static void main(String args[]) {
		
		Student s1 = new Student(11, "pradip " , "beed", 89.9);
		
		System.out.println(s1);
		
		
		
		
		
		Student s2 = new Student (22 , "rathod ", "pune" , 87.5);
		System.out.println(s2);
		
		
		

}
}
