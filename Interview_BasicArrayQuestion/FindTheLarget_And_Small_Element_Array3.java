package Interview_BasicArrayQuestion;

public class FindTheLarget_And_Small_Element_Array3 {
	public static void main(String args[])
	{
		int arr[]= {31,3,43,7,43,73,85};
		
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < min)
			{
				min =+ arr[i];
			}
		}
		System.out.println("minimum :"+min);
	}

}
