package Interview_Question_practice;

public class Inter_change_two_array2 {
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5};
		int b[] = {6,7,8,9,10};
		
		int tast[] = a;
		
		a = b;
		b= tast;
		
		System.out.print("First Array :");
		for(Integer x:a)
		{
			System.out.print(x+" ");
		}
		System.out.print("\nSecound Array:");
		for(Integer x :b)
		{
			System.out.print(x+" ");
		}
	}

}
