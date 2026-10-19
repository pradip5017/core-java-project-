package Interview_BasicArrayQuestion;

public class DeleteElementInArray {
	public static void main(String[] args) {
		
		int arr[]= {11,32,3,43,5,63,7};
		
		int index = 3;
		
		int newarr[]= new int [arr.length - 1];
		
		int j =0;
		for(int i=0; i<arr.length; i++)
		{
			if(i == index)
			{
				continue;
			}
			newarr[j]=arr[i];
			j++;
		}
		for(int n : newarr)
		{
			System.out.print(n+" ");
		}
	}

}
