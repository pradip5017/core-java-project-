package Interview_BasicArrayQuestion;
// check 5 element which index
public class Count_frequency_of_characters1 {
	public static void main(String[] args) {
		
		int arr[]= {1,2,4,5,7,8,9};
		
		int num = 5;
		for(int i=0;i<arr.length; i++)
		{
			if(arr[i]==num)
			{
				System.out.println(i);
			}
		}
	}

}
