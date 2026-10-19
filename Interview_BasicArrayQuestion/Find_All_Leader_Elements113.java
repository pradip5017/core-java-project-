package Interview_BasicArrayQuestion;

public class Find_All_Leader_Elements113 {
	public static void main(String args[])
	{
		int arr[]= {22,21,20,45,43,41,32,56,45,66};
		
		int max=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max =+arr[i];
				System.out.print(max+" ");
			}
		}
	}

}
