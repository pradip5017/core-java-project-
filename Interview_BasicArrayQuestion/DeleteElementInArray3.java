package Interview_BasicArrayQuestion;
//delete 1 element of 2 index values;
public class DeleteElementInArray3 {
	public static void main(String args[])
	{
		int arr[]= {1,2,1,3,4,5,6,7,8,9};
		
		int index = 2;
		int arr1[]= new int [arr.length-1];
		int j=0;
		for(int i=0; i<arr.length; i++)
		{
			if(i==index)
			{
				continue;
			}
			arr1[j]=arr[i];
			j++;
		}
		for(int n : arr1)
		{
			System.out.print(n+" ");
		}
	}

}
