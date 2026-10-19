package Interview_BasicArrayQuestion;

public class Factorial1 {
	public static void main(String args[])
	{
		int n =3;
		int fact =1;
		
		for(int i=1; i<=n; i++)
		{
			fact = fact * i;
		}
		System.out.println("Number :"+n);
		System.out.println("Fact :"+fact);
	}

}
