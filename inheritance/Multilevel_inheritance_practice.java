package inheritance;

	// Frute = Apple Banana, PineApple, Peel, Orange
		class Apple{
			
			String apple;
			String banana;
			
		}
		
		class Food extends Apple{
			
			String burger;
			String wadapav;
			
			void foods()
			{
				System.out.println("Eating foods..!!");
			}
		}

		class Dinner extends Food{
			
			Dinner(String apple, String banana, String burger, String wadapav)
			{
				this.apple=apple;
				this.banana=banana;
				this.burger=burger;
				this.wadapav=wadapav;
				
			}
			
			void Display()
			{
				System.out.println("Apple ="+apple);
				System.out.println("banana ="+banana);
				System.out.println("burger ="+burger);
				System.out.println("wadapav ="+wadapav);
			}
		}
	

public class Multilevel_inheritance_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dinner d1 = new Dinner("apple", "Banana","cg","wadapav");
		d1.Display();
		d1.foods();
		
	}

}
