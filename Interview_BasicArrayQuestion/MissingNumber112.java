package Interview_BasicArrayQuestion;

public class MissingNumber112 {
	public static void main(String args[])
	{
		int arr[]= {2,5,7,9};
		
		int num = 9;
		for(int i=1; i<num; i++){
			
			boolean found = false;
			for(int n: arr)
			{
				if(n ==0)
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
