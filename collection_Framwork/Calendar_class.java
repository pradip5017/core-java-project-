package collection_Framwork;
import java.util.Arrays;     
import java.util.Calendar;

//invoke  => to call
//instance/bean =>  object
//instantiation => creation of object
		

//Calendar API(collection of built in methods)

public class Calendar_class {

	public static void main(String[] args) {
	
Calendar cal=Calendar.getInstance();  //As Calendar is an abstract class..we cannot create the object of Calendar class by using new keyword...so getInstance() method returns object of calendar class
		
//		System.out.println(cal.getTime()); //timestamp=>date,time

	   
		
		cal.add(Calendar.DATE,-5);           //-5 means it will return 5days before date from current date 
		System.out.println(cal.getTime());
		
		
		
		
	  /*cal.add(Calendar.DATE, 5);           //5 means it will return 5days AFTER date from current date 
		System.out.println(cal.getTime());
		*/
		
		
		
	/*
	cal.add(Calendar.MONTH, 2);           //2 means it will return month which is 2 month AFter date from current date 
		System.out.println(cal.getTime());
	*/
	
		
		

	/*		cal.add(Calendar.YEAR, -1);           //-1 means it will return YEAR which is 1 year back date from current date 
			System.out.println(cal.getTime());
		
		*/
		

		/*	
		cal.add(Calendar.HOUR, -3);           //-3 means it will return HOUR which is 3 hours back date from current date 
			System.out.println(cal.getTime());
		*/
		
		
		
	//	System.out.println(cal.get(Calendar.DATE));  //current day of current month
		
		
		
	//System.out.println(cal.get(Calendar.MONTH));  //current month
		
		
	//System.out.println(cal.get(Calendar.DAY_OF_WEEK));  //sun=1,mon=2,tue=3.. //current day of current week
		
		
		
		
     //System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));   //2   //returns current week number  in month starting from sunday
		
		
		//System.out.println(cal.get(Calendar.DAY_OF_YEAR));    //returns current no of day in year
		
		
	//System.out.println(cal.get(Calendar.ERA));    //returns current ERA
		
		
			
	    //System.out.println(cal.get(Calendar.MINUTE));    //returns current minute
		
		
		//System.out.println(cal.get(Calendar.MONTH));  //jan=0,feb=1,march=2..  //returns current month
		
	//	System.out.println(cal.get(Calendar.WEEK_OF_MONTH)); //3   //returns current weekof current month
	
	
	// System.out.println(cal.get(Calendar.WEEK_OF_YEAR));    //returns current weekof current year
	
		
		//System.out.println(cal.getMaximum(Calendar.WEEK_OF_MONTH)); //6 april 2023
		//System.out.println(cal.getMinimum(Calendar.WEEK_OF_MONTH));  //0
		
		
		
	
	   //System.out.println(cal.getMaximum(Calendar.WEEK_OF_YEAR));   //53
		//System.out.println(cal.getMinimum(Calendar.WEEK_OF_YEAR));  //1
		
		
		
		//System.out.println(cal.getMinimalDaysInFirstWeek());  //1//returns miminum days in first week of the month
	
		
	
	//	System.out.println(cal.getMaximum(Calendar.DAY_OF_MONTH)); //31
		//System.out.println(cal.getMinimum(Calendar.DAY_OF_MONTH)); //1
       
		
		
	
		//System.out.println(cal.getMaximum(Calendar.DAY_OF_YEAR));   //366
		//System.out.println(cal.getMinimum(Calendar.DAY_OF_YEAR)); //1
    	
		
		
		
		
		

		
	//	System.out.println(cal.get(Calendar.HOUR_OF_DAY));  //returns current hour of the day
	
		
		
	
	
		//System.out.println(cal.getMaximum(Calendar.HOUR));  //11
		//System.out.println(cal.getMinimum(Calendar.HOUR));   //0

		
		
		
		

	 
		//System.out.println(cal.getAvailableCalendarTypes());
		
	// System.out.println(cal.getCalendarType());
	}
}

