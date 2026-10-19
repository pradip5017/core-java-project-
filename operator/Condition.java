package operator;

public class Condition {



public static void main(String args[])
{
	
	/*char ch='u';
	
	
	if (ch >= 'a'  && ch <= 'z') //4
	{
		System.out.println(ch+ "is alphabet");
	}else if 
		(ch >= '0'  && ch <= '9') //4
		{
			System.out.println(ch+"is number");
		
	}
	
	else {
		System.out.println(ch +" is Symbol ");
	}*/
	
	
	int a=18,b;
	
	  b =a;    //assignment =

	  System.out.println("a = "+a);  //18
	  System.out.println("b = "+b);  //18
	  
	             //  18+18
	  a+=b ;    //a  = a+b
	  System.out.println("----------after a+=b---------------\n\n");
	  System.out.println("a="+a); //36
	  System.out.println("b="+b); //18
	  
	            // 18-36
	  b-=a;    //b=b-a  //b=   -18, a=36
	  System.out.println("----------after a-=b---------------\n\n");
	  System.out.println("a="+a); //36
	  System.out.println("b="+b); //-18
	 
	            //a=36, b=-18
	  a*=b;    //a=a*b        a=36*(-18) , a=-648  , b=-18
	  System.out.println("----------after a*=b---------------\n\n");
	  System.out.println("a="+a); //-648
	  System.out.println("b="+b); //-18
	  
	  
	          //a=-648,  b=-18
	  a/=b;     //a=a/b     a=-648/-18,   a=36,b=-18
	  System.out.println("----------after a/=b---------------\n\n");
	  System.out.println("a="+a); //36
	  System.out.println("b="+b); //-18
	  
	  
	  
	        //a=36,b=-18
	  b%=a;        //b=b%a,    b=-18%36, b=18,a=36
	  System.out.println("----------after a%=b---------------\n\n");
	  System.out.println("a="+a); //36
	  System.out.println("b="+b); //-18
}
}