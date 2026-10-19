package Static_keyword;

class Nested1
{
	String name = "Pradip:";
	String college = "Sb college Chh Sambhaji nagar";
	static String brance = "Computer science";
	
	
	
	static class Nested
	{
		
		
			void getDetail()
		{
			System.out.println("This is a Studetn informaion =");
			
			System.out.println( "branch  is = "+brance);
			System.out.println("Static answer is here...........n");
		}
	}
}








public class Static_Nested_classs_Practic {

	public static void main(String args[])
	{
		Nested1.Nested u = new Nested1.Nested();
		u.getDetail();
		
	
	}
}
