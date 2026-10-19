package Interview_Question_practice;

public class PairSumExample2 {
	public static void main(String args[])
	{
		
	
	int arr[]= {2,3,5,7,9,4,6,8};
	
	int target =10;
	int count =0;
	
	for(int i=0; i<arr.length; i++)
	{
		for(int j=i; j<arr.length; j++)
		{
			if(arr[i] +arr[j]== target)
			{
				System.out.println(arr[i]+" + "+arr[j]+" = "+target);
				count++;
			}
		}
	}
	System.out.println("Count:"+count);
		
	}
	

}
