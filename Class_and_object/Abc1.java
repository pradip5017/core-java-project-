package Class_and_object;
//method => it is a block of/set of coding statements. Which we create once and
//call it over multiple times

//1.method declaration(for now, calling=> inside userdefined class)
//2.method definition/create(for now, calling=> inside userdefined class)
//3.method calling/use(for now, calling=> inside main)
class Pqr{
	

	//6      3.7      5.2
			void addingNumbers(int a, float b, double c)    //here,a,b,c are formal parameters
			{
				 double d= a+b+c;
				 System.out.println("addition = "+d);  //2
				 System.out.println("bye");       ///3
			}
			
			void areaOfCircle(double pi, int r )  //pi*r*r
			{
				 System.out.println("area of circle  = "+pi*r*r);
				
				
			}	
			}
		public class Abc1 {


					public static void main(String args[]) {
						
						Pqr u1 = new Pqr();
						
						u1.addingNumbers(3, 2f, 1);
						u1.areaOfCircle(3.4, 10);
						
					}
					
					
//method => it is a block of/set of coding statements. Which we create once and
//call it over multiple times

//1.method declaration(for now, calling=> inside userdefined class)
//2.method definition/create(for now, calling=> inside userdeifned class)
//3.method calling/use(for now, calling=> inside main)
}
