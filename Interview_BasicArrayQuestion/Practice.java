package Interview_BasicArrayQuestion;
 class Student0
 {
	 int id;
	 String name;
	 String address;
	 Student0(int id, String name, String address)
	 {
		 this.id=id;
		 this.name=name;
		 this.address=address;
		 
		 System.out.println("ID :"+id);
		 System.out.println("Name :"+name);
		 System.out.println("Address:"+address);
	 }
	 void put()
	 {
		 System.out.println(" Use Id :"+id);
		 System.out.println("User Name :"+name);
		 System.out.println("User Addresss :"+address);
	 }
	 
	 public String toString()
	 {
		 return  "Id :"+id+"\nName : "+name+"\nAddress :"+address;
	 }
	 
 }
public class Practice {
	public static void main (String[] args) 
	{
		Student0 s1 = new Student0(1,"pradip","pune");
		s1.put();
		System.out.println(s1);
		
		System.out.println("This is a main Class in String arg");
	}
	public static void main(int args[])
	{
		Student0 s2 = new Student0(2,"lakhan","pune");
		s2.put();
		System.out.println(s2);
		System.out.println("this is a int argument");
	}
	public static void main(double s[])
	{
		System.out.println("this is a double arg");
	}

//	public static void main(String as[])// compile time error 
//	{
//		System.out.println("This is a main and string argument");
//	}

	
	
	
}
// the only access on jvm to run only main(String args[]) function call 
// we can not call another fuction in java , jvm not run another main function like  main(int args[]), another

