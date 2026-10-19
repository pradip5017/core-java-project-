package Array;

public class Array_practice1 {
	public static void main (String args[])
	{
		
		int a []= {3,4,5,6,7,8,8,9,};
		
		
		System.out.println("Print the array Element in and reverse the array..!!");
		
		for(int i=a.length-1; i>0; i--)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nSecound Array Elements");
		for(int j=0; j<a.length; j++) {
			
			System.out.print(+a[j]+" ");
		}
	}

}
