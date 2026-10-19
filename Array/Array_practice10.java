package Array;

public class Array_practice10 {
	public static void main(String args[])
	{
		
//		int a []= {1,2,3,4,5,6,7,7,8,9};
//		
//		for(int i=0; i<a.length; i++)
//		{
//			System.out.println("The Array Element is = " +a[i]);
//		}
		
		//Reverse Array
		System.out.println("Reverse Array..!!");
		
		int arr[]= {2,3,4,5,6,7,8,9,11};
		
		for(int i=arr.length-1; i>0; i--)
		{
			System.out.println("Reverse Array Elements..!!="+arr[i]);
		}
		
		System.out.println("Array..!!");
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Arrya  elemetns = "+arr[i]);
		}
	}

}
