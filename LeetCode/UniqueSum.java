	package LeetCode;
	
	public class UniqueSum {
		

		public static int findsum(int[]arr, int n)
		{
			// initialization variable	with 0
			
			int sum = 0;
			
			for(int i=0; i<n ; i++)
			{
				int j=i+1;
				if(j < n )
				{
					if(arr[j]==arr[i])
					{
						break;
					}
					j++;
				}
				
				// if such as a element exist then add
				
				if(j== n) 
				{
					sum +=arr[i];
				}
			}
			return sum;
		
			
		}
		
		
		
		
	public static void main(String args[])
	{
		int [] arr= {1,2,3,1,1,4,5,6};
		int n = arr.length;
		System.out.println(findsum(arr, n));
	}
	}
