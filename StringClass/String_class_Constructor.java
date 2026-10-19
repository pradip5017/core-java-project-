package StringClass;

public class String_class_Constructor {
public static void main(String[] args) {
	/*	//1.constructor => default cosntrcutor creates an empty string
	   String s= new String();
	   System.out.println(s);  
	   
	    */
	
	
	
/*	//2.constructor => String(String s)
	   String s= new String("hello java");
	   System.out.println(s);  
	 */
	
/*	   //string to character array conversion=> toCharArray
	 //3.constructor => String(char a[])
	   char ch[]= {'h','e','l','l','o',' ','j','a','v','a'};
	   String s= new String(ch);   //character array(ch) to String(s) conversion
	   System.out.println(s);  
	*/
	
	
	

	 //4.constructor => String(char a[],int startIndex,int count)
	            // 0    1   2   3   4   5   6   7    8  9
//	   char ch[]= {'h','e','l','l','o',' ','j','a','v','a'};
//	   String s= new String(ch,6,2);
//	   System.out.println(s);
//	   
	   

	
	
	/*//byte to string convert
//	5. constructor => string (byte a[])
	
	byte a[]= {72,79, 76, 76, 79, 32, 80, 79,79, 74, 65 };
	String s = new String(a);
	System.out.println(s);
	
	*/
	
//	  //6.constructor => String(byte a[],int startIndex,int count)
	
//				0 1 2 3 4 5 6 7 8 9   space   10  11 12 13  14
	byte a[]= {80,114,97, 100, 105, 112, 32,   82, 97, 116,104, 111, 100 };
	String s = new String(a );
	System.out.println(s);
	
	 System.out.println("Secont Try ");
	byte x []= {89,114,97,100,105,112,32,82,97,116,104,111,100};
	String s1 = new String(x);
	System.out.println(s);
	
}
}
