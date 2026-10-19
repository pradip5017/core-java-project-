package Interview_Question_practice;

public class BigElement_Array_Number {
	public static void main(String args[])
	{
		int arr[] = {34,23,43,123,654,534,1,23,55,2,435,546,345};
		
		int max= arr.length;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println("max values :"+max);
	}

}
