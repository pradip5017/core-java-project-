package Interview_BasicArrayQuestion;

public class Find_All_Leader_Elements13 {
	
	public static void main(String args[])
	{
		int arr[]= {21,20,45,41,25,89,101};
		int leader =0;
		
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
