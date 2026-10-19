package java8feature.streamAPI;

import java.util.ArrayList;  
import java.util.List;

class Vehical {
	int speed;
	String name;
	float price;
	
	public Vehical(int speed, String name, float price)
	{
		this.speed=speed;
		this.name=name;
		this.price=price;
	}
	
	public String toString()
	{
		return  speed+ " " +name + " " +price;
	}
	
	
}
public class Filter_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Vehical> l1 = new ArrayList<Vehical>();
		
		l1.add(new Vehical (77, "truck" , 75000f));
		l1.add(new Vehical (80, "bike" , 50000f));
		l1.add(new Vehical (71, "bus" , 20000f));
		l1.add(new Vehical (60, "bmw" , 30000f));
		l1.add(new Vehical (50, "toyata" , 25000f));
		
		
		 //1.Findout those objects whose price> 30000
        //using stream API
		
		
		l1.stream().filter(v-> v.price > 30000).forEach(h -> System.out.println(h));   
		
//		System.out.println(l1);
		
		/*
		       //2.Findout those ojects whose price> 30000
        //using collection
		
		for( Vehical  v : l1)  // //v=> 77,"truck",25000f)
		{
			if(v.price >30000) {
				System.out.println(v);
				
			}
		}
			
		*/
		
		
		
		
		
		
		
		
	}

}
