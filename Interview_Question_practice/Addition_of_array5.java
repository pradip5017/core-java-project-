package Interview_Question_practice;

public class Addition_of_array5 {
	public static void main(String args[])
	{
		int arr[]= {2,3,4};
		
		int add =0;// addition
		int sub = arr.length;	//subtratraction
		int mul = 1 ;//multipication

		for(int i=0;i<arr.length; i++)
		{
			add = add +arr[i];
			sub = sub -arr[i];
			mul = mul *arr[i];
		}
		System.out.println("Addition :"+add);
		System.out.println("Subtraction :"+sub);
		System.out.println("Multiplication :"+mul);
		
		double div = add /arr.length;
		System.out.println("Divition :"+div);
	}

}
