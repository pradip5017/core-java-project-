package Interview_Question_practice;

public class Inter_change_two_array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b[]= {9,8,7,6,5,4};
		
		int temp[]= a;
		a=b;
		b= temp;
		
		System.out.print("A Array :");
		for(int x :a)
		System.out.print(x+" ");
		
		System.out.print("\nB Array :");
		for(int x :b)
		{
			System.out.print(x+" ");
		}
	}

}
