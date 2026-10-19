package Abstraction;

	 abstract class User0
	{
		
		void Vahical()
		{
			System.out.println("Kia Suziki..!!");
		}
		
		abstract void start();
		
	}
	 class User1 extends User0{
		
		
		void vahical1()
		{
			System.out.println("Kia Car..!!");
		}
		void start()
		{
			System.out.println("Vahikar is start..!");
		}
	}
public class AbsrractionMethodPractice {

	public static void main(String[] args) {
		
		
		User1 u = new User1();
		u.Vahical();
		u.vahical1();
		u.start();
	}
}
