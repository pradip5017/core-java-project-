package Interview_BasicArrayQuestion;
// find out max and min element in Array
public class MaxAndMinimumElementInArray2 {
	public static void main(String args[])
	{
	
	int arr[]= {32,33,34,6,58,3,12,3,7,8,53};
	
	int max =arr[0];
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i] > max)
		{
			max = arr[i];
		}
	}
	System.out.println("maximum  Array Element :"+max);
	}

}
