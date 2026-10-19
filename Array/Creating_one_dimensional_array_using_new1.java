package Array;

public class Creating_one_dimensional_array_using_new1 {
	public static void main(String args[])
	{
		int arr[]= new int[8];
		arr = new int[]{1,2,3,4,5,6,7,8};
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+",");
		}
		
		System.out.println("\nReverse Array ");
		for(int i=arr.length-1; i>=0; i--)
			
		{
			System.out.print(arr[i]+",");
		}
	
	}

}
