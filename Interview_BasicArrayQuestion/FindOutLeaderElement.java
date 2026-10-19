package Interview_BasicArrayQuestion;
// leader element is 22, 46, 59
public class FindOutLeaderElement {
	public static void main(String args[])
	{
		int arr[]= {22,21,14,46,34,43,34,59};
		
		int leader = 0;
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
