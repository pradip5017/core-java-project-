package Interview_Question_practice;

public class BigElement_Array_Number2 {
	public static void main(String args[])
	{
		int arr[]= {11,23,53,56,78,35,23,13,6,1};
		
		int max = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max =+ arr[i];
			}
		}
				
		System.out.println(max);
	}

}
