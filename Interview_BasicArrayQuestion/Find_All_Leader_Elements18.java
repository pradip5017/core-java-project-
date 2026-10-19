package Interview_BasicArrayQuestion;

public class Find_All_Leader_Elements18 {
	public static void main(String args[])
	{
		int arr[]= {22,21,22,45,41,34,67,89};
		int max =0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
				System.out.print(max+" ");
			}
		}
	}
}
