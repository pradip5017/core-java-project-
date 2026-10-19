package Interview_BasicArrayQuestion;

public class DeleteElementInArray4 {

	public static void main(String args[])
	{
		int arr[]= {1,3,5,7,5,8,5,8};
		
		int index = 6;
		
		int arr1[]= new int[arr.length-1];
		
		int j=0;
		for(int i=0; i<arr.length; i++)
		{
			if(i==index)
			{
				continue;
			}
			arr1[j]= arr[i];
			j++;
		}
		
		for(int n : arr1)
		{
			System.out.print(n+" ");
		}
	}
}
