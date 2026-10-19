package Interview_BasicArrayQuestion;

public class DeleteElementInArray5 {
	public static void main(String args[])
	{
		int arr[]= {2,3,4,6,7,8,9,11};
		int num = 7;
		
		int newarr[]= new int[arr.length-1];
		
		int j=0;
		for(int i=0; i<arr.length; i++)
		{
			if(num==i)
			{
			continue;	
			}
			newarr[j]=arr[i];
			j++;
		}
		for(int n: newarr)
		{
			System.out.print(n+" ");
		}
	}
}
