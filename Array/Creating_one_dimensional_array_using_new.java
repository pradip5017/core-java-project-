package Array;

//import java.util.Scanner;

//1D Array => is a collection of multiple elements of same type

public class Creating_one_dimensional_array_using_new {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		
		
		int a[] = new  int[7];   //declartion of array=>creating an array using new keyword..bcz, in java..array is considered as an object 
		
		a = new int[] {1,2,3,5,6,7,6};  //intialization of an array

		
		for(int i=0; i<=6; i++)
		{
			System.out.println(a[i]);
		}
	}

}
