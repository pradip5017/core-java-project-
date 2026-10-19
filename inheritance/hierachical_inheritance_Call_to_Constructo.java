		package inheritance;
		
		class Operation1
		{
			int a,b;
			
			
			Operation1(int a, int b)
			{
				this.a=a;
				this.b=b;
			}
			
		}
		
		class Add1 extends Operation1
		{
			
			Add1(int a, int b)
			{
				super(a, b);
			}
			
			void printAddtion()
			{
				
				System.out.println("The addtion is="+(a+b));
			}
		}
		
		class Sub1 extends Operation1
		{
		
			 Sub1(int a, int b)
			{
				super(a, b);
			}
			
			void printSubtraction()
			{
				System.out.println("The subtraction is ="+(a-b));
			}
		}
		
		class Mul1 extends Operation1
		{
			
		
		    Mul1(int a, int b)
			{
				super(a, b);
			}
			
			void printmultiplation()
			{
				System.out.println("The subtraction is ="+(a*b));
			}
		}
		
		
		public class hierachical_inheritance_Call_to_Constructo {
		public static void main(String args[])
			
			// In Hierarchical_inheritance, we need to create an object of each child class  
				  ///and that each child class object can able to call parent class data
			
			{
				Add1 a1 = new Add1(1,5);
				
				a1.printAddtion();
				
				
				Sub1 s1 = new Sub1(1,3);
				
				s1.printSubtraction();
				
				
				
				
				Mul1 m1= new Mul1(2, 5);
				
				m1.printmultiplation();
			}
		
		}
