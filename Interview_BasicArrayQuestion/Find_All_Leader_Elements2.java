package Interview_BasicArrayQuestion;

public class Find_All_Leader_Elements2 {
	public static void main(String[] args) {
		
	int arr[]= {12,34,56,88,35,86,45};
		int num = 0;
		
		for(int i=0; i<arr.length; i++)
		{
				if(arr[i]> num)
				{
					num =+arr[i];
					System.out.print(num+" ");
				}
			
		}
	
	}

}
