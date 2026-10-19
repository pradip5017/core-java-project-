package Interview_BasicArrayQuestion;
//find out min and max value in array
public class FindTheLarget_And_Small_Element_Array1 {

	public static void main(String args[])
	{
		int arr[]= {12,2,43,65,69,63,12,53,1};
		
		int min =arr[0];// min
		int max = arr.length;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println(max);
		
	}
}
