package Interview_Question_practice;

public class BigElement_Array_Number12 {
	public static void main(String args[])
	{
		int arr[]= {33,45,6,78,23,64,86,2,7,83};
		
		int min =arr.length;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("Minimum Valus :"+min);
	}

}
