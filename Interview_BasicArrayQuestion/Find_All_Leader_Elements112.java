package Interview_BasicArrayQuestion;

public class Find_All_Leader_Elements112 {
	public static void main(String args[])
	{
		int arr[]= {22,21,11,45,43,23,56,54,68};
		int max = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max =+ arr[i];
				System.out.print(max+" ");
			}
			
		}
	}

}
