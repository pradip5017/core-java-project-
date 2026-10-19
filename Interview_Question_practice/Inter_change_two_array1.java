package Interview_Question_practice;

public class Inter_change_two_array1 {
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10};
		
		int temp[]= a;
		
		a=b;
		b=temp;
		
		System.out.print(" Array A:");
		for(int x :a)
		{
			System.out.print(x+" ");
		}
		System.out.print("\n Array B:");
		for(int x:b)
		{
			System.out.print(x+" ");
		}
}
}
