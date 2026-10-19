package inheritance;
// society  wing flat 
//In Multilevel_inheritance, the child most class is derived from another child class
//and that child class is derived from parent class

//In Multilevel_inheritance, the child most class is derived from another child class
//and that child class is derived from parent class

//In Multilevel_inheritance, we have equal no of parent and child class
//parent class=> Society,Wing
//child class => Wing,Flat
class Society
{
	String name;
	String address;
}

class Wing extends Society
{
	char wingname;
	
	void buyingflate()
	{
		System.out.println("the flate is buying ");
	}
}

 class Flat extends Wing
 {
	 String flatno;
	 String flattype;
	 
	 void getdata(String name, String address, char wingname, String flatno, String flattype )
	 {
		 this.name=name;
		 this.address=address;
		 this.wingname=wingname;
		 this.flatno=flatno;
		 this.flattype=flattype;
		 
	 }
		 void putData()
		 
	     {
	    	 super.buyingflate();   //calling super class method
	        System.out.println("hi my name is pradip, My address is given below :\n"+flatno+","+flattype+","+wingname+"\nFlat type is "+address+"\nname is "+address );
		
	     }
	 
 }

public class Multilevel_inheritance {
	
	public static void main(String args[])
	{
		
		Flat f1 = new Flat();
		f1.getdata("gokuldham", "pune", '4', "house number", "2bhk");
		f1.buyingflate();
		f1.putData();
	}
}
