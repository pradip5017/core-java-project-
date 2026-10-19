package StringClass;

public class Rotatation {
public static void main(String[] args) {
	
	String s1 = "table";  // true 
	String s2 = "tabddle"; //false
	
	
	String s3 = s1.concat(s1);  //table table
	
	if(s3.contains(s2)) {
		System.out.println("Relational Strings ");
	}else
	{
		System.out.println("Not- relational Strings ");
	}
	 
}
}
