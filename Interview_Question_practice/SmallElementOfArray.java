package Interview_Question_practice;

public class SmallElementOfArray {
	public static void main(String args[])
	{
		int arr[]= {12,11,652,343,4,5,6,33,232,53,64};
		
		int small = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < small)
			{
				small = arr[i];
			}
		}
		System.out.println(small);
		
	}

}
