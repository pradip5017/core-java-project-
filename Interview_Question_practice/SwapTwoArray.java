package Interview_Question_practice;

public class SwapTwoArray {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[]= {9,8,7,5,3};
		
		int temp[] =a;
		
		a=b;
		b=temp;
		System.out.print("A Array :");
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
