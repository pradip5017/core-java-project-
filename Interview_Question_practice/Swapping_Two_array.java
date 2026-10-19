package Interview_Question_practice;

public class Swapping_Two_array {

	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10};
		
		int[] temp = a;
		
		a= b;
		b= temp;
		
		System.out.println("First Array..!!");
		for(int  x : a)
			System.out.print(x+" ");
		
		System.out.println(" \n Secound Array..!!");
		for(int x : b)
			System.out.print(x+" ");
			
		
		
	}
}
