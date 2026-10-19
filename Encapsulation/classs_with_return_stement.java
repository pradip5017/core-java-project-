package Encapsulation;

class Xyz
{
	int add(int a, int b, int c) // formal argumenet list 
	{
		int d =a+b+c;
		System.out.println("Hello"); 
		
		return  d;
		
	}
	double avgOfMark(int math, float sci, double eng)
	{
		double avg =(math+sci+eng)/3;
		return avg;
	}
	
	String mgs()
	{
		return("Hello everyone");
	}
	
	
	String checkElighible(int age)
	{
		if (age >= 18)
		{
			return "Yess eligible for Votting...";
		}
		else {
			{
				return "not Eligible fot Vitting....";
			}
		}
	}
}



public class classs_with_return_stement {
	public static void main(String args[])
	{
		Xyz x1 = new Xyz();
		System.out.println(x1.add(12, 23, 10));
		
		
		System.out.println("avg of mark="+x1.avgOfMark(12, 2.4f, 5.0));
		
		System.out.println("Massage ="+x1.mgs());
		
		System.out.println("Votting  ="+x1.checkElighible(26));
		
		
		
		}

}
