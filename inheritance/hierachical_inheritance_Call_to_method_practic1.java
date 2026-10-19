package inheritance;

// subject => CPP, Java, Operating Sys, Php

		class Subject1
		{
			int a, b;
			
			void getdata(int a, int b)
			{
				this.a=a;
				this.b=a;
			}
			
			void display()
			{
				System.out.println("All subject marks=\n");
			}
		}
		
		class cpp extends Subject1
		{
		//	void cpp(int a, int b)
		//	{
		//		this.a=a;
		//		this.b=b;
		//	}
			
			void display1()
			{
				System.out.println("All subject marks=\n"+(a+b));
			}
		}
			
		class Java extends Subject1
		{
			
			void java()
			{
				System.out.println("the java marks is ="+(a+b));
			}
		}
		
		
		
		public class hierachical_inheritance_Call_to_method_practic1 {
			public static void main(String args[])
			{
				cpp c1 = new cpp();
				c1.getdata(5, 7);
				
				c1.display();
				c1.display1();
		//		c1.cpp(5, 7);
				
				
				Java j1 = new Java();
				j1.getdata(55, 70);
				j1.java();
				
			}
		
		}
