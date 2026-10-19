package swing_programming;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuDemo1234 {

		
		JMenu m1 ,m2,paratha,sandwich,veg,non_veg, m3,hot,cold,m4,snacks,ladu,bev,drinks,fr,water;
		   
		JMenuItem  misal, dhokla, cheese, meyonize,is1,is2,ricePlate,veg_biryani,biryani1,biryani2,coffee, jalebi, icecream,rasmalai,soup,salad,rice,vp,methi,rava,tea,coldCoffee,mango,straw,mineral,normal;  
	   

		JMenuDemo1234() {
			JFrame f = new JFrame("menu and Menu items");
			
			JMenuBar mb = new JMenuBar();  //menu bar

		      m1=new JMenu("breakfast");   //2.
			      misal=new JMenuItem("Misal");  
			      dhokla=new JMenuItem("Dokhla");  
			      
		        paratha=new JMenu("Paratha"); 
		           cheese=new JMenuItem("cheese");  
		           meyonize=new JMenuItem("meyonize"); 
		      
		      
		         sandwich=new JMenu("Sandwich");  
		            is1=new JMenuItem("cheese grilled");
		            is2=new JMenuItem("veg Sandwich");
		            
		      
		      m2=new JMenu("lunch");
		         veg= new JMenu("Veg"); 
		           ricePlate=new JMenuItem("rice plate");
		           veg_biryani=new JMenuItem("veg biryani");
		      
		           
		        non_veg=new JMenu("Non Veg");
		         biryani1=new JMenuItem("hydrabadi biryani");
		         biryani2=new JMenuItem("dum biryani");
		      
		   
		       m3=new JMenu("dessert");
		         hot= new JMenu("hot"); 
		             coffee =new JMenuItem("coffee ");
		             jalebi =new JMenuItem("jalebi");
		          
		         cold= new JMenu("cold");
		            icecream =new JMenuItem("ice cream");
		            rasmalai =new JMenuItem("rasmalai");
		   
		      
		      m4=new JMenu("dinner");
		         soup=new JMenuItem("soup");   
		         salad=new JMenuItem("veg salad");
		         rice=new JMenuItem("rice");
		         
		       snacks=new JMenu("snacks");
		         ladu=new JMenu("ladu's variety");
		                 methi= new JMenuItem("methi ladu");
		                 rava= new JMenuItem("rava ladu");
		         
		          bev=new JMenu("beverages");    
		              tea= new JMenuItem("tea");
		             coldCoffee= new JMenuItem("cold coffee");
		  
		           drinks=new JMenu("drinks of your choice");      
		                  fr=new  JMenu("Fruiti");
		                      mango=new JMenuItem("mango fruiti");
		                       straw=new JMenuItem("strawberry fruiti");
		                  
		            
		              
		                       
		                       
		    m1.add(misal); 
		    m1.add(dhokla); 
		    m1.add(paratha);//p
		       paratha.add(cheese);
		        paratha.add(meyonize);  
		    
		    m1.add(sandwich);//s  
		       sandwich.add(is1);
		      sandwich.add(is2);
		        
		    m2.add(veg);
		      veg.add(ricePlate);
		      veg.add(veg_biryani);
		    
		      
		    m2.add(non_veg);
		       non_veg.add(biryani1);
		       non_veg.add(biryani2);
		    
		      m3.add(hot);
		         hot.add(coffee);
		         hot.add(jalebi);
		         
		      m3.add(cold);
		          cold.add(icecream);
		          cold.add(rasmalai);
		 
		    
		    m4.add(soup);
		    m4.add(salad);
		    m4.add(rice);
		    
		    snacks.add(ladu);
		     ladu.add(methi);
		     ladu.add(rava);

		     bev.add(tea);
		     bev.add(coldCoffee);
		     
		     drinks.add(fr);
		       fr.add(mango);
		       fr.add(straw);
		       
		       
		      
		    mb.add(m1);  //breafast
		    mb.add(m2);  //m2=lunch
		    mb.add(m3);  //m3=dessert
		    mb.add(m4);  //m4=dinner
		    mb.add(snacks);
		    mb.add(bev);
		    mb.add(drinks);
		 
		    
		    
		    f.setJMenuBar(mb);  
		    f.setSize(400,400);  
		    f.setLayout(null);  
		    f.setVisible(true);  
			}
			    
		//Layout(structure)
		//LayoutManager interface -=>1.BorderLayout 2 => java.awt,  javax.swing
		//1.BorderLayout
	         
		
		public static void main(String[] args) {
			
			new JMenuDemo1234();
	}

}
