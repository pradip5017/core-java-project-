package Interview_BasicArrayQuestion;

public class Find_All_Leader_Elements5 {
	public static void main(String[] args) {
		int arr[]= {32,24,30,31,48,35,38,42,69};
		
		int result =0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > result)
			{
				result =+ arr[i];
				System.out.print(result+" ");
			}
		}
	}

}
