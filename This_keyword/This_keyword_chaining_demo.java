package This_keyword;



class Demo11{
	
	int id;
	String name;
	String college;
	
	Demo11()
	{
		this(33, "Pradip", "Sb college");
		
		System.out.println("\nthe constructor........\n");
		
		id=11;
		name="jay";
		college="Sb college";
		
		
		System.out.println("This is a id="+id);
		System.out.println("This is a name ="+name);
		System.out.println("This is college="+college);
		
	}
	
	Demo11(int id, String name, String college)
	{
		
		this(11, "Sham");
		
		System.out.println("\nThis is a paramitric constructor \n");
		this.id=id;
		this.name=name;
		this.college=college;
		
		
		System.out.println("This is a id="+id);
		System.out.println("This is a name ="+name);
		System.out.println("This is college="+college);
		
	}
	
	Demo11(int id, String name)
	{
		this("ram", "sb College");
		
		System.out.println("Paramitric constructor.....................\n");
		this.id=id;
		this.name=name;
		
		System.out.println("This is a id="+id);
		System.out.println("This is a name ="+name);
	}
	
	
	Demo11(String name, String college)
	{
		
		
		System.out.println("\nhello.......................\n");
		
		this.name=name;
		this.college=college;
		
		System.out.println("This is a id="+name);
		System.out.println("This is a name ="+college);
	}
	
	
	
	
}
public class This_keyword_chaining_demo {
	public static void main(String args[])
	{
		Demo11 d = new Demo11();
	
	}
	
}
