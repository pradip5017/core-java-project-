package Interview_BasicArrayQuestion;

public class MissingNumber00 {
	public static void main(String args[])
	{
		int arr[]= {1,2,4,5,6,8,9};
		
		int num = 9;
		
		for(int i=1; i<num; i++)
		{
			boolean b1 = false;
			
			for(int n : arr)
			{
				if(num == i)
				{
					b1 = true;
					break;
				}
			}
		
		if(!b1)
		{
			System.out.print(i+" ");
		}
	}
	}
}
