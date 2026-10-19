package Abstraction;

//ram sham Gira => galary() , Vedio(),Audio() calllog()
abstract class RamApp
{
	void galary()
	{
		System.out.println("This is a Galary");
	}
	
	abstract void vedio();
	abstract void audio();
	abstract void calllog();
}

abstract class ShamApp extends RamApp
{
	void audio()
	{
		System.out.println("This is a Audio...");
	}
	
	void calllog()
	{
		System.out.println("This is Calllog...");
	}
	
}
	class GitaApp extends ShamApp
	{
		void vedio()
		{
			System.out.println("This is a Vedios........");
		}
	}


public class Abstact_program2 {
	public static void main(String args[])
	{
		GitaApp g1 = new GitaApp();
		g1.galary();
		g1.audio();
		g1.calllog();
		g1.vedio();
		
		
	}

}
