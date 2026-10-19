package Class_and_object;

class Factorial1{
	
	void add(int a, int b , int c, int d, int e)
	{
		int f =a*b*c*d*e;
		System.out.println("factorial is "+f);
	}
	
	void areaOfCircle (double pi, int r)
	{
		System.out.println("Area of circle "+pi*r*r);
	}
}
public class Abc1_practice {
	public static void main(String args[])
	{
		Factorial1 f1 = new Factorial1();
		f1.add(5, 4, 3, 2, 1);
		f1.areaOfCircle(3.14, 1);
	}

}
