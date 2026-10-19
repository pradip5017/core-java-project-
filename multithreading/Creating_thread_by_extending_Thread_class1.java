package multithreading;

	class Student extends Thread
	{
		int arr[]= {2,4,7,9,45,65};
		
		public void run()
		{
			for(int i=0; i<arr.length; i++)
			{
				System.out.println(arr[i]*2);
				try {
					
					Thread.sleep(2000);
				} catch (Exception e) {
					
				}
			}
		}
	}

public class Creating_thread_by_extending_Thread_class1 {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.start();
	}
}
