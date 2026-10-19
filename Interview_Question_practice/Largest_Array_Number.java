package Interview_Question_practice;

public class Largest_Array_Number {
	public static void main(String args[])
	{
		int arr[]= {54,234,646,76,43,657,79,43,124,6,78,234,};
		
		int larg = arr.length;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > larg)
			{
				larg = arr[i];
			}
		}
		System.out.println(larg);
	}

}
