package Interview_BasicArrayQuestion;

public class Find_All_Leader_Elements20 {

	public static void main(String args[])
	{
		int arr[]= {11,10, 24,12,45,68};
		
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
