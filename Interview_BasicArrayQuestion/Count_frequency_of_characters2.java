package Interview_BasicArrayQuestion;

public class Count_frequency_of_characters2 {
	public static void main(String[] args) {
		int arr[]= {1,2,4,98,26,8,9,346,43};
		
		int element = 4;
		for(int i=0;i<arr.length; i++)
		{
			if(arr[i]==element)
			{
				System.out.print(i+" ");
			}
		}
	}

}
