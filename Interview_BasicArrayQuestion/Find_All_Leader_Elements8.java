package Interview_BasicArrayQuestion;
// find out leader Element in Array
public class Find_All_Leader_Elements8 {

	public static void main(String[] args) {
		int arr[]= {25,14,21,23,46,34,57,43};
		
		int leader = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]> leader)
			{
				leader =+arr[i];
				System.out.print(leader+" ");
			}
		}
		
	}
}
