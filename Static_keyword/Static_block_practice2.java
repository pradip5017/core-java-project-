package Static_keyword;

	class Company{
		
		int eid;
		String ename;
		static	String  cname;
		
		Company(int eid, String ename)
		{
			this.eid=eid;
			this.ename=ename;
//			this.cname=cname;
		}
		
		void putData()
		{
			System.out.println("Employee id ="+eid);
			System.out.println("Employee name ="+ename);
			System.out.println("Employee company name ="+cname);
		}
		
	static {
		cname="Tech mahindra";
	}
	}

public class Static_block_practice2 {
	public static void main(String args[])
	{
		Company c1 = new Company(11,"pradip");
		c1.putData();
	}

}
