package Interview_Question_practice;

// remove dublicate charector in String 
// and Find dublicate Charector in String
public class ThinkiviteQuestionPractice {
	public static void main(String args[])
	{
		String s1 = "programming";
		String result ="";
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			
			if(s1.indexOf(ch)!= s1.lastIndexOf(ch))// this line Find dulicate Charector
			{
				if(result.indexOf(ch)==-1) // this line remove dublicate Charector
				{
					result = result +ch;
				}
			}
		}
		System.out.println(result);
	}

}
