package java8feature.streamAPI;

import java.util.ArrayList;  
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Collection=> interface,Collections=> class
//Collector=> interface,Collectors=> class



class Vehical1 {
	int speed;
	String name;
	float price;
	
	
	public Vehical1 (int speed, String name, float price)
	{
		this.speed=speed;
		this.name=name;
		this.price=price;
		
		
	}
	
	public String toString()
	 {
        return speed+" "+name+" "+price;
  }
}
public class ToList_ToSet_ToMap_method11 {

	 public static void main(String[] args) {
		 
		 
		    List<Vehical1>  l1 =new ArrayList<Vehical1>();
	          
	          l1.add(new Vehical1(77,"truck",75000f));  
	            l1.add(new Vehical1(80,"bus",30000f));  
	            l1.add(new Vehical1(60,"bike",28000f));  
	            l1.add(new Vehical1(78,"train",28000f));  
	            l1.add(new Vehical1(90,"plane",90000f)); 
	            l1.add(new Vehical1(40,"bicycle",10000f)); 
	           
	            
	            //1.Findout those objects whose price> 30000
	            //using stream API
	           //l1.stream().filter(v -> v.price> 30000).forEach(h->System.out.println(h));
	            
	            
	           //1.Converting/collection stream into list
	          //List<Vehical1> v1  =l1.stream().filter(v -> v.price> 30000).collect(Collectors.toList());
	            // System.out.println(v1);
	            
	     
	            //2.Converting/collection stream into set
	        //  Set<Vehical1> v2  =l1.stream().filter(v -> v.price> 30000).collect(Collectors.toSet());
	          //   System.out.println(v2);
	            
	            
	            //3.Converting/collection stream into map
	            Map<String,Float> v3  =l1.stream().filter(v -> v.price> 30000).collect(Collectors.toMap((k)->k.name,(v)->v.price));
	                System.out.println(v3);  //{"truck"=75000,plane=90000}
	    }

	}
