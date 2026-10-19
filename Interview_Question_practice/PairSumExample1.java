package Interview_Question_practice;

public class PairSumExample1 {
	public static void main(String args[])
	{
		int arr[]= {2,3,6,8,5,9,1,7};
		
		int target = 10;
		int count =0;
		
		System.out.println("Target Values :"+target);
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(arr[i]+ " + "+arr[j]+" = "+target);
					count++;
				}
			}
		}
		System.out.println("Tatal Count :"+count);
	}

}
