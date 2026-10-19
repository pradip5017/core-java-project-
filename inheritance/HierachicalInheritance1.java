package inheritance;

	class Cal1
	{
		
	int a = 10;
	int b =20;
	
		void  Add(int a, int b)
		{
			System.out.println("Addition :"+(a+b));
			
		}
	}
	
	class Cal2 extends Cal1
	{
		void sub(int a, int b)
		{
			System.out.println("Subtraction :"+(a-b));
		}
		
	}
	
	class Cal3 extends Cal1
	{
		
		void mul(int a, int b)
		{
			System.out.println("Multiplication :"+(a*b));
		}
	}
	class Cal4 extends Cal1
	{ 
		void div(int a, int b)
		{
		System.out.println("Division :"+(a/b));
	}
	}
public class HierachicalInheritance1 {
	public static void main(String[] args) {
		
		
		Cal1 c1 = new Cal1();
		c1.Add(10, 20);
		
		Cal2 c2 = new Cal2();
		c2.sub(10, 20);
		
		Cal3 c3 = new Cal3();
		c3.mul(10, 20);
		
		Cal4 c = new Cal4();
//		c.Add(10, 20);
		c.div(10, 20);
		
	}

}
