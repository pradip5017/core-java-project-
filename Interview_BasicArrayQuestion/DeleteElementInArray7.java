package Interview_BasicArrayQuestion;

public class DeleteElementInArray7 {
	public static void main(String args[])
	{
		int arr[]= {2,4,6,8,9,3};
		int index = 3;
		
		int newarr[]= new int [arr.length -1];
		
		 int j=0;
		for(int i=0; i<arr.length; i++)
		{
			if(i == index)
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
