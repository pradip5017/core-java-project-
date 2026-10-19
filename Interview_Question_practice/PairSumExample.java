package Interview_Question_practice;
public class PairSumExample {
	public static void main(String args[])
	{
		int arr[]= {2,3,4,6,3,7,8,3,5,7,1,2,9};
		
		int target =10;
		int count =0;
		
	
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]+arr[j]==target)
				{
					
					System.out.println(arr[i]+" = "+arr[j]+" = "+target);
					count++;
				}
				
			}
			 
		}
		System.out.println("Total pair Count :"+count);
	}

}
