package Interview_BasicArrayQuestion;

public class Find_All_Leader_Elements7 {
	public static void main(String args[])
	{
		int arr[]= {11,22,34,66,58,39,56,94};
		
		/*
		int leader = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > leader)
			{
				leader =+ arr[i];
				System.out.print(leader+" ");
			}
		}
		*/
	
		
			int max = 0;
			for(int i=0; i<arr.length; i++)
			{
				if(i==0 || arr[i] > arr[i-1])
				{
					System.out.print(arr[i]+" ");
				}
			}
	}
}
