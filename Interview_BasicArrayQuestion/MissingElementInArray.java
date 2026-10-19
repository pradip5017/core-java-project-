package Interview_BasicArrayQuestion;

public class MissingElementInArray {
	public static void main(String[] args) {
		int arr[]= {1,4,7,9};
		int num = 9;
		for(int i=1; i<=9; i++)
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
