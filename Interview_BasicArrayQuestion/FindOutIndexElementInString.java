package Interview_BasicArrayQuestion;

public class FindOutIndexElementInString {
	public static void main(String[] args) {
		String s1[] = {"Pradip","rahul","Hrushikesh","Ambadas"};
		String str = "Hrushikesh";
		for(int i=0; i<s1.length; i++)
		{
			if(s1[i]==str)
			{
				System.out.print("String Element index in array :"+i);
			}
		}
	}

}
