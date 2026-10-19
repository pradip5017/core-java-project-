package Static_keyword;

import Static_keyword.Outer10.Nested11;

class Emp21{
			int id=11; 
			String name="Pradip";
			static String add ="Pune";
			
			
			 class Nested{
				
				void display()
				{
					System.out.println("Non static nested class");
					System.out.println(add);
//					System.out.println(this.name);
				}
			}
			 class Nested11
				{
					 {
					id = 43;   //value initialized 
					name="Jivan";
					add= "ch, Sambhaji nagar";
				}
					 
					void getDisplay()
					{
						System.out.println("\nThe Studen informatioin  is =\n");
						System.out.println("The address is ="+name);
						System.out.println("The address is ="+add);
						System.out.println("The address is ="+id);
					}
				}
		}

public class Static_Nested_Class_practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp21 p1 = new Emp21();
		Emp21.Nested e1 =  p1.new Nested();
		e1.display();
		
		Emp21.Nested11 i = p1.new Nested11();
		i.getDisplay(); // declation of a method
		
	}

}
