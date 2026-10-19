package Interview_BasicArrayQuestion;

public class Find_All_Leader_Elements4 {
	public static void main(String[] args) {
		
	int arr[]= {35,32,12,45,34,32,24,68};
	 int  num=arr.length;
	 
	 for(int i=0; i<arr.length; i++)
	 {
		 if(arr[i] > num)
		 {
			 num =+arr[i];
			 System.out.print(num+" ");
		 }
	 }
	}

}
