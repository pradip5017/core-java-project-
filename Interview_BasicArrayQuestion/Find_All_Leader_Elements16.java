package Interview_BasicArrayQuestion;

public class Find_All_Leader_Elements16 {
	public static void main(String args[])
	{
		int arr[]= {1,2,55,66,76,45,68,99};
		
		int num =0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > num)
			{
				num = arr[i];
				System.out.print(num+" ");
			}
		}
	}

}
