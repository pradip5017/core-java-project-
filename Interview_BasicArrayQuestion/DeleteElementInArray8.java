package Interview_BasicArrayQuestion;

public class DeleteElementInArray8 {
	public static void main(String args[])
	{
		int arr[] = {1,3,5,7,9,88,67};
		
		int index = 5;
		int newarr[]= new int [arr.length -1];
		int j=0;
		for(int i=0; i<arr.length; i++)
		{
			if(i==index)
			{
				continue;
			}
			newarr[j]= arr[i];
			j++;
		}
		for(int n : newarr)
		{
			System.out.print(n+" ");
		}
	}

}
