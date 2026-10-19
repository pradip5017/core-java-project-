package Interview_Question_practice;

public class demo {
	
	public static void main(String args[])
	{
		int arr[]= {10,20,30,40,50};
		
		for(Integer num :arr)
		{
			System.out.println(num);
		}
		
		
		
		for(Integer num: arr)
		{
			num =100;
		}
		
		for(Integer num :arr)
		{
			System.out.println("num:"+num);
		}
		
	}

}
