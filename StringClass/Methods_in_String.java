package StringClass;

public class Methods_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//1.concat
		//2.concatenation without using concat() method
		
//		String s3=new String("programming"); 
//		System.out.println(s3);
//		System.out.println(s3+"in java");
//		
		
		
		//---------------------------------------------------------------------
//		
//		String s1=new String("programming"); 
//		System.out.println(s1);
////		
////		
//		System.out.println(s1.charAt(6));   //String is nothing but charector   (m)
//		System.out.println(s1);
//		System.out.println(s1.charAt(9));   //3.char charAt(int index => returns CHAR present on given index
//											//4.boolean equals(Object)
//											//5.boolean equalsIgnoreCase(Object)
		
		//---------------------------------------------------------------------
		
		
//		String s1=new String("programming"); 
//		String s2=new String("programming"); //equals(Object)=> checks both contents as well as cases of both strings
//		
//		System.out.println(s1.equals(s2)); 
//		System.out.println(s2.equals(s1));
//		
		
		//---------------------------------------------------------------------
		
		
//		5. //equalsIgnoreCase(Object)=> checks only contents by ignoring cases of both strings
		
//		String s1=new String("pRogrammiNg"); 
//		String s2=new String("prograMmiNg");
//		
//		System.out.println(s1.equalsIgnoreCase(s2));  //equalsIgnoreCase(Object)=> checks only contents by ignoring cases of both strings
//	
		//---------------------------------------------------------------------
		 

		
////		6.: public boolean isEmpty()
//				String s1=new String("java progrAmMing");
//				System.out.println(s1.isEmpty());  //false
//				
				
				//------------------------------------
				
		
		
//		7 public String replac (char old , char new)
		/*
		String s1=new String("java programming ");
		System.out.println(s1);
		System.out.println(s1.replace('p', 'o'));
		*/
		
		//------------------------------------
//		8 public String replac (String old  , new String()replace first word)
		
//		String s1=new String("java programming ");
//		System.out.println(s1);
//		System.out.println(s1.replaceFirst("java", "cpp"));
		
		
		
		//-----------------------------------------------------------------------------------
		
//		9. //9: public String substring(int begin/start)
		//10: public String substring(int beginindex, int endindex)
		// 0123456789 

		
		/*
		String s1=new String("pradip Rathod ");
		System.out.println(s1);
		System.out.println(s1.substring(4)); //returns the string starting from 9th index till end of the string
		
		
		System.out.println(s1.substring(5,9)); //returns the string starting from 9th index till 11(12-1)
		
		
		*/
		//-----------------------------------------------------------------------------------
//10. 	//11.String trim()  =>removes spaces present at beginning of the string and at the ending of the string but it does not removes middle blank spaces.
		/*
		String s1=new String("    pradip Rathod      ");
		System.out.println(s1);
		
		System.out.println(s1.strip());
		
		*/	
		
		//-----------------------------------------------------------------------------------
//12. 
		//12.removing middle blank spaces from string
		
//		String s1=new String("    pradip Rathod      ");
//		System.out.println(s1);
//		System.out.println(s1.replace("" , " "));
		//here,space is replaced by empty string
		
		
		//-----------------------------------------------------------------------------------

		
		//13.public boolean contains(CharSequence sequence)
        //ram
//String s1=new String("java programming language");
//System.out.println(s1);     
//
//System.out.println(s1.contains("ram"));  //true
//System.out.println(s1.contains("ramu")); //false
//WAP to find whether given strings are rotational strings or not

		
		//-----------------------------------------------------------------------------------

		
		//14: int indexOf(char ch) => returns an index of given character
        //   0123456789       17
//String s1=new String("java programming language");
//System.out.println(s1);  
//
//System.out.println(s1.indexOf('a'));       //1  //returns an index of FIRST occurrence of given character 
//System.out.println(s1.indexOf('a',9));         //returns an index of MIDDLE occurrence or from 4th index of given character
//System.out.println(s1.lastIndexOf('a'));      //22  //returns an index

		
		
		//-----------------------------------------------------------------------------------
//	15.  lenth 
		
		
		
		
		
			//15.length()
//		String s1=new String("java");
//		System.out.println(s1);
//		System.out.println(s1.length());
//		
//		
		
		
		
		/*	//16.toUpperCase()
		String s1=new String("java ");
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		*/
		
		
		/*//17.toLowerCase()
				String s1=new String("ProGRamming");
				System.out.println(s1);
				System.out.println(s1.toLowerCase());
		*/
		
		
	}

}
