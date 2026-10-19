package Interview_BasicArrayQuestion;
//missing element is 3,5,6
public class MissingNumber12 {
	public static void main(String[] args) {
		int arr[]= {1,2,4,7,8,9};
		
		int num = arr[arr.length-1];
		for(int i=1; i<num; i++)
		{
			boolean found = false;
			for(int j=0; j<arr.length; j++)
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
