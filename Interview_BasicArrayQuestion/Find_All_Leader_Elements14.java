package Interview_BasicArrayQuestion;

public class Find_All_Leader_Elements14 {
	public static void main(String args[])
	{
		int arr[]= {22,21,20,45,34,35,33,57,45,56,88};
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
