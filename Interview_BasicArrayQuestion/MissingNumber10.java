package Interview_BasicArrayQuestion;

//find out missing element
public class MissingNumber10 {
	public static void main(String[] args) {
		
		int arr[]= {7,2,8,9,25};
		int  num = arr[arr.length-1];
		for(int i=0; i<=num; i++)
		{
			boolean found = true;
			for(int j=0; j<arr.length; j++)
			{
				if(arr[j]==i)
				{
					found = false;
					break;
				}
			}
			if(found)
			{
				System.out.print(i+" ");
			}
				
		
		}
	}

}
