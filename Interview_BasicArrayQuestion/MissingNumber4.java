package Interview_BasicArrayQuestion;

public class MissingNumber4 {
	public static void main(String[] args) {
		int arr[]= {3,7,1,2,8,4,5};
		
		int n = arr.length;
		for(int i=1; i<n; i++)
		{
			boolean bl = false;
			
			for(int num :arr)
			{
				if(num == i)
				{
				bl = true;
				break;
			}
			}
			if(!bl)
			{
				System.out.print(i+" ");
			}
		}
	}
}
