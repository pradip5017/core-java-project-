package Interview_BasicArrayQuestion;
// missing number in array
public class MissingNumber15 {

	public static void main(String[] args) {
		
		int arr[]= {1,4,6,9,12};
		
		int num = arr[arr.length-1];
		for(int i=0; i<num; i++)
		{
			boolean found = false;
			for(int j=1; j<arr.length; j++)
			{
				if(arr[j]==i)
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
