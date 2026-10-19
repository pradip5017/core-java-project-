package final_keyword;

//static keyword is use for declaration purpose

//this & super => used for calling purpose
//static & final  => used for declaration purpose

//Final/const keyword =>  is used to declare variable,method,class as a final

//1.final variable =>the variable which is declared as a final can NOT be changed  and its
//value remain fixed throughout the program..

class Animal 
{
	final double pi = 3.14;
	
	 int r = 5;
	
	
	void areaOfcircle()
	{
    // double	pi=44.5;     //pi=4.15;     //error=> bcz,pi is declared as a final and we can't change the value of final field

		System.out.println("Area of Circle="+(pi*r*r));
	}
}

public class Final_Keyword_With_Variable {
	public static void main(String args[])
	{
		Animal a1 = new Animal();
		
		a1.areaOfcircle();
				
	}

}
