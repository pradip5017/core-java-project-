package Interview_Question_practice;

public class Multiplication_Question_in_Array {
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6};
		
		int mul =1;
		
		for(int i=0; i<arr.length; i++)
		{
			mul = mul * arr[i];
		}
		System.out.println("Multiplication :"+mul);
	}

}
