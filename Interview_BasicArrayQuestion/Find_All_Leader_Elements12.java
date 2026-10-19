package Interview_BasicArrayQuestion;

public class Find_All_Leader_Elements12 {
	public static void main(String[] args) {
		
		int arr[]= {34,23,21,46,34,41,69};
		
		int num =0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > num)
			{
				num =+ arr[i];
				System.out.print(num+" ");
			}
		}
	}

}
