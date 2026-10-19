package Interview_BasicArrayQuestion;

public class MissingNumber1 {
	public static void main(String[] args) {
		int arr[]= {2,3,5,7,9};
		
		int n = 9;
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
