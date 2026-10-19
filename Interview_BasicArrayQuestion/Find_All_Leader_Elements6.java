package Interview_BasicArrayQuestion;

public class Find_All_Leader_Elements6 {
	public static void main(String args[])
	{
		int arr[]= {22,4,6,35,32,27,56,54,90};
		int max =arr.length;
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
