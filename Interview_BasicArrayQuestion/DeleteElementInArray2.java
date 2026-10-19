package Interview_BasicArrayQuestion;
//delete 7 index element of Array
public class DeleteElementInArray2 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,7,8};
		
		int index = 7;
		
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
