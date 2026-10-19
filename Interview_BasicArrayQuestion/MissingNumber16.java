package Interview_BasicArrayQuestion;

public class MissingNumber16 {
	public static void main(String args[])
	{
		int arr[]= {2,4,6,9};
		
		int num = 9;
		
		for(int i=0;i<num; i++)
		{
			boolean found =false;
			for(int j=0; j<arr.length; j++)
			{
				if(num==i)
				{
					found = true;
					break;
				}
			}
		
		if(!found)
		{
			System.out.print(i+" ");
		}
	}
}

}
