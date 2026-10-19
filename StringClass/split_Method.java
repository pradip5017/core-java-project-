package StringClass;
//WAp to findout number of words in given string 
public class split_Method {
	public static void main(String[] args) {
		
		String s1= "java is a object oriented programming language";  // string words
		
		String words[] = s1.split(" "); //split method is used to divide string based on given string
		//String to array convert of words  using a (space print all code)
		
		
		System.out.println("no of words present in given string ="+words.length); //check the length of string words length of = 7 
		
		
		
		for (int i=0; i<words.length; i++)  // looping the words
		{
			System.out.println(words[i]); //print the words 
		}
	}

}
