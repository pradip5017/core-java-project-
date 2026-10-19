package This_keyword;

class Emp
{
	int eid;
	String ename;
	double sal;
	
	Emp(int eid, String ename, double sal)
	{
		
		//Q. Can we overload constructor?
		//yes..we can overload PARAMETERIZED constructor but we can't overload default constructor

		//constructor chaining
		
		System.out.println("Paramiterize constructor..........");
		
		
		
		this.eid =eid;
		this.ename = ename;
		this.sal = sal;
	}
	
	void putDispplay()
	{
		System.out.println("Employee id is ="+eid);
		System.out.println("Employee name is ="+ename);
		System.out.println("Employee salary is ="+sal);
	}
}






public class This_keyword_for_Calling_Cosntructor {
	
	public static void main(String args[])
	{
		Emp e1 = new Emp(11, "Sham", 3000);
		e1.putDispplay();
		
		Emp e2 = new Emp(12, "jiva", 40000);
		e2.putDispplay();
	}

}
