package Static_keyword;

class Company12{
	
	int eid=11;
	String ename="pradip";
	static String ecompany="TCS";
	
	Company12(int eid, String ename)
	{
		this.eid=eid;
		this.ename=ename;
	}
	
	Company12()
	{
		this.eid=eid;
		this.ename=ename;
	}
	
	void putData()
	{
		System.out.println("Employee id ="+eid);
		System.out.println("Employee name ="+ename);
		System.out.println("Employee company ="+ecompany);
	}
}
public class Static_block_practice12 {
	public static void main(String args[])
	{
		Company12 c1 = new Company12();
		c1.putData();
		
		Company12 c2 = new Company12(12,"Rahul");
		c2.putData();
	}

}
