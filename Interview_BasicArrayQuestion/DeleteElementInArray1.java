package Interview_BasicArrayQuestion;
//  index position element is remove
public class DeleteElementInArray1 {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,6,5,6,7,8};
		
		int index = 7;
		
		int newarr[]= new int [arr.length-1];
		
		int j=0;
		for(int i=0; i<arr.length; i++)
		{
			if(i==index)
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
