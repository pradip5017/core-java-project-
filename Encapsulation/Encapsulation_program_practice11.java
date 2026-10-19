package Encapsulation;

class Mobile{
	
	int id;
	String name;
	long model;
	String features;
	
	 void setId (int id)
	{
		this.id=id;
	}
	 
	 void setName(String name)
	 {
		 this.name=name;
	 }
	 void setModel(long model )
	 {
		 this.model=model;
	 }
	 
	 void setFeatures (String features)
	 {
		 this.features=features;
	 }
	
	 	int getId()
	 {
		 return id;
	 }
	 String getName()
	 {
		 return name;
	 }
	 	long getModel()
	 	{
	 		return model;
	 	}
	 	String getFeatures()
	 	{
	 		return features;
	 	}
	 	
}

public class Encapsulation_program_practice11 {
	public static void main(String args[])
	{
		Mobile m1 = new Mobile();
		m1.setId(1);
		m1.setName("Vivo");
		m1.setModel(16);
		m1.setFeatures("y16");
		
		System.out.println("Mobile id is ="+m1.getId());
		System.out.println("Mobile name = "+m1.getName());
		System.out.println("Mobile model = "+m1.getModel());
		System.out.println("mobile feature = "+m1.getFeatures());
		
	}

}
