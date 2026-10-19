package Interview_Question_practice;

public class Largest_Array_Number1 {
	public static void main(String args[])
	{
		
	
	int arr[]= {1,2,3,4,52,53,64,87,3,23,8};
	
	int max =arr.length;
	
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i] >max)
		{
			max = arr[i];
		}
	}
	System.out.println(max);
}
	
}
