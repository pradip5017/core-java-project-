package Interview_BasicArrayQuestion;

public class Find_All_Leader_Elements0 {
	public static void main(String args[])
	{
		int arr[]= {11,23,12,32,55,43,78};
		int leader = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > leader)
			{
				 leader =+ arr[i];
				System.out.print(leader+" ");
			}
		}
	}

}
