package Interview_Question_practice;

public class BigElement_Array_Number01 {
	
	public static void main(String args[])
	{
		int arr[]= {11,2,4,56,87,23,90,4};
		
		int max = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println(max+" ");
	}

}
