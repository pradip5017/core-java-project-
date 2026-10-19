package Interview_BasicArrayQuestion;

public class FindOutBig_BigElement_in_Array1 {
	
	public static void main(String args[])
	{
		int arr[]= {17,2,4,5,34,43,6};
		
//		int max = 0;// max
		int min = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] <  min)
			{
				min =+ arr[i];
			}
		}
		System.out.println(min);
	}

}
