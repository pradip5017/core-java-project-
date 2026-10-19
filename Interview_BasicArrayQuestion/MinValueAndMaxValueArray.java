package Interview_BasicArrayQuestion;
//min and max values in Array
public class MinValueAndMaxValueArray {
	public static void main(String args[])
	{
		int arr[]= {21,31,7,9,5,32,4,7,11,5};
		int min = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]< min)
			{
				min =+arr[i];
			}
		}
		System.out.println(min);
	}
}
