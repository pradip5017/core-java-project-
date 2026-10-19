package polymorphism;
//Polymorphism  => poly(many) + morphs(forms)
//1.purpose=>  using one object in different ways
//2.definition => means using one object in multiple ways
   //OR one object is having multiple forms is called as polymorphism

//3. e.g person=>person may be a family member,student,frnd,emp,dr
//4.How to implement?
//by using the concept of method overloading and overriding...we can implement concept of polymorphism
//5.Program


//Types of polymorphism
//1.Compile time poly/early binding/static binding/static dispatch process
   //multiple methods having same name but with different parameter list
  //method overloading can be possible by changing the number of arguments or 
 //by changing types of argument 
//but method overloading is not possible by changing the return type of the method

class Overloading
{
	//static void add(int a,int b)
	void add(int a,int b)
	{
     System.out.println("in add(int a,int b) : "+(a+b));
	}
	  
    void add(float a,float b)
	{
  	System.out.println("in add(float a,float b) : "+(a+b));
	}

	void add(double a,int b)  //method definition
	{
		System.out.println("in add(double a,int b) : "+(a+b));
	}
	void add(int  a,double b,double c)
	{
		System.out.println("in add(int  a,double b,double c): "+(a+b+c));
	}
	

	
}

public class Method_Overlodding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overloading o1=new Overloading();
		  o1.add(4.5, 6);  //method calling
		  o1.add(4,5);
		  o1.add(4.5f, 3.1f);
		  o1.add(4, 6.7, 1.2);
	}

}


