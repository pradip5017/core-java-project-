package Interview_BasicArrayQuestion;
// fetching prime number of number
public class ArrayInsert1 {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,7,9};
		int index = 7;
		int add = 8;
		
		int newarr[]=new int[arr.length + 1];
		
		for(int i=0; i<arr.length; i++)
		{
			newarr[i]=arr[i];
		}
		
		 	newarr[index] = add;
		 	
		 	for(int i=index;i<arr.length; i++)
		 	{
		 		newarr[i+1]=arr[i];
		 	}
		 	
		 	for(int num : newarr)
		 	{
		 		System.out.print(num+" ");
		 	}
	}

}
