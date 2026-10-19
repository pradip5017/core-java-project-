package Interview_BasicArrayQuestion;

public class InsertElementInArray {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,6,7,8};
		
		int index = 4;
		int element = 5;
		
		int newarr[]= new int [arr.length + 1];
		for(int i=0;i<arr.length; i++)
		{
			newarr[i]=arr[i];
		}

			newarr[index]= element;
			for(int i=index; i<arr.length; i++)
			{
				newarr[i +1 ]=arr[i];
			}
			
			for(int n : newarr)
			{
				System.out.print(n+" ");
			}
	}

}
