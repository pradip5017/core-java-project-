package Interview_Question_practice;

public class PairSumArray4 {
	public static void main(String args[])
	{
		int arr[] ={1,2,4,5,7,9};
		int target =5;
		int count =0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(arr[i]+" + "+arr[j]+" = "+target);
					count ++;
				}
			}
		}
		System.out.println("Count :"+count);
	}

}
