package Abstraction;

//We cannot create an object of abstract class bcz,it consists concrete methods which incompletes abstract class
//but we can create reference variable of abstract class
	
	abstract class RamApp1
	{
		void galary()
		{
			System.out.println("This is a Galary");   //a1.put();   //error=>we cannot call own method of non-abstract class by using the reference variable of abstract class
		}
		
		abstract void vedio();
		abstract void audio();
		abstract void calllog();
	}

	abstract class ShamApp1 extends RamApp1
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
		class GitaApp1 extends ShamApp1
		{
			void vedio()
			{
				System.out.println("This is a Videos........");
			}
		}


		public class Abstract_class_object {
			public static void main(String args[])
			{
				
				//We cannot create an object of abstract class bcz,it consists concrete methods which incompletes abstract class
				//but we can create reference variable of abstract class
				
				GitaApp1 g1 = new GitaApp1();   //here,p1 is reference variable of GitaApp() and also th object of GitaApp1  //here,we are creating an object of Pqr bcz,it is non-abstract class 
				g1.galary();
				g1.audio();
				g1.calllog();
				g1.vedio();
				
				
				ShamApp1 s2 = new GitaApp1(); //here,a1 is reference variable of ShamApp1 and object of Gitaapp1 class//instantiation(object 
				s2.audio();
				s2.calllog();
				s2.calllog();
				s2.vedio();
				
				
			}

}
		
		
		//here,we cannot create an object of RamApp and ShamApp(bcz,both are abstarct)
		 //but we can create reference variable of it
//		 ShamApp s1=new GitaApp();   //here,s1 is refrence variuable of ShamApp and object of GitaApp
//		 s1.audio();
//		 s1.callLog();
//		 s1.video();
//		 s1.gallery();
