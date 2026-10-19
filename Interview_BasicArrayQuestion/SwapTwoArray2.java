package Interview_BasicArrayQuestion;

public class SwapTwoArray2 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,2};
		
		int temp[]= a;
		a=b;
		b=temp;
		System.out.print("A :");
		for(int x:a)
		{
			System.out.print(" "+x);
		}
		System.out.print("\nB :");
		for(int x:b)
		{
			System.out.print(" "+x);
		}
	}

}
