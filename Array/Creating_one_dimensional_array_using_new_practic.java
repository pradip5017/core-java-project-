package Array;
//array is a collect the all similar type  data to stare in one variable is called as Arrays..!!

public class Creating_one_dimensional_array_using_new_practic {
	public static void main(String[] args) {
		
		int a [] = new int[7];  // declation array 
		
		a = new int[] {9,8,7,6,5,4,3,2,1,0}; //initialization of array
		System.out.println("The number is show");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("\nStep secound\n");
		
		for (int i=a.length-1; i>=0; i--)  // reverse count to value of array 
		{
			System.out.print(a[i]+",");
		}
	}

}
