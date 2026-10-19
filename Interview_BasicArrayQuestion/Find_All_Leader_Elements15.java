package Interview_BasicArrayQuestion;

public class Find_All_Leader_Elements15 {
	public static void main(String args[])
	{
		int arr[]= {22,12,13,44,43,41, 68};
		
		int leader =0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > leader)
			{
				leader =+arr[i];
				System.out.print(leader+" ");
			}
		}
	}

}
