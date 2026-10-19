package Interview_BasicArrayQuestion;
//find out small and large element in array
public class FindTheLarget_And_Small_Element_Array {
	public static void main(String args[])
	{
		int arr[]= {11,44,22,33,4,66,87,45,78,34,47,85,74,33};
		
		int small =arr[0];  // small
		int max = arr.length; // max
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max =arr[i];
			}
		}
		System.out.println(max);
	}
}
