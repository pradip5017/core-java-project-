package Interview_Question_practice;

public class Inter_change_two_array7 {
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5,6};
		int b[]= {7,8,9,0,1};
		
		int temp[]= a;
		a=b;
		b=temp;
		
		System.out.print("\nA :");
		for(Integer x : a)
		{
			System.out.print(x+" ");
		}
		System.out.print("\nb :");
		for(int x : b)
		{
			System.out.print(x+" ");
		}
	}

}
