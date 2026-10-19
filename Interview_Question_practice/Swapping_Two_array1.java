package Interview_Question_practice;

public class Swapping_Two_array1 {
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5,6};
		int b[] = {9,8,7,6,5,4};
		
		int swap[]= a;
		
		a=b;
		b=swap;
		
		System.out.print("A Array:");
		for(Integer x :a)
		{
			System.out.print(x+" ");
		}
		System.out.print("\nB Array :");
		for(Integer x :b)
		{
			System.out.print(x+" ");
		}
		
	}

}
