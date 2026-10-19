package Interview_BasicArrayQuestion;

public class DeleteElementInArray0 {
	
	public static void main(String args[])
	{
		int arr[]= {3,5,7,9,4,6,8,12,67,15};
		
		int index =4;
		
		int arr1[] = new int [arr.length -1];
		
		int j=0; 
		for(int i=0; i<arr.length; i++)
		{
			if(i == index)
			{
				continue;
			}
			arr1[j]=arr[i];
			j++;
		}
		for(int n :arr1)
		{
			System.out.print(n+" ");
		}
	}

}
