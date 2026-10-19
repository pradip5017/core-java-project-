package Interview_BasicArrayQuestion;

public class MissingNumber3 {
	public static void main(String[] args) {
		
		int arr[]= {1,4,7,9,24,68,95,86};
		
		
	
		int n = 76;
		
		for(int i=1; i<n; i++)
		{
			boolean b1 = false;
			
			for(int num :arr)
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
