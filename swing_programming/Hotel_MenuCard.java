package swing_programming;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Hotel_MenuCard implements ActionListener {

	

	JMenu jmA,jma,jmI,jmb,jmB,jmc,jmC,jmD,jmd,jme;
	JMenuItem i1,i2,i11,i12,i112,i111,i113,i13,i14,i15,i21,i22,i23,i24,i25,i26,i27,i28,i211,i212,i213,i214,i215,i216,i217,i218 ,i31
	,i32,i33,i34,i35,i36,i37,i38,i39,i41,i42,i43,i44,i45,i46,i47,i48, i411,i412,i413,i414,i415,i416,i417;
	
	JLabel l1;
	JButton b1;
	Font fn;
	
	Hotel_MenuCard() {
		
		JFrame jf=new JFrame("Hotel Amrai 69 Menu Card !!");
		
		JMenuBar mb=new JMenuBar();
		
		fn=new Font("Script",Font.ROMAN_BASELINE,20);
		
		//jf.isActive();
		b1=new JButton("CLick");
		b1.setBounds(200,300,100,30);
		b1.addActionListener((ActionListener)this);
	
	//Starter---	
		jmA= new JMenu ("Starter");
			i1=new JMenuItem("Mushroom Nazakat        ₹285");
			i2=new JMenuItem("Harabara Kebab          ₹295");
			jma=new JMenu("Paneer");
			   i11=new JMenuItem("Paneer Angara       ₹349");
			   i12=new JMenuItem("Paneer Chilli       ₹339");
			   i13=new JMenuItem("Paneer Tikka    	  ₹385");
			   i14=new JMenuItem("Paneer Malai Tikka  ₹299");
			   jmI=new JMenu("Paneer Kebab");
			   		i111=new JMenuItem("Paneer Banjara Kebab    ₹299");
			   		i112=new JMenuItem("Paneer Pahadi Kebab     ₹319");
			   		i113=new JMenuItem("Paneer Bara Kebabb      ₹339");
			   i15=new JMenuItem("Paneer Tikka Dildar  ₹350");
	
	//Rasoi---
		jmB= new JMenu ("Rasoi");
		   jmb= new JMenu ("Veg");
				i21=new JMenuItem("Dal fry/tadaka        ₹145/155");
				i22=new JMenuItem("Dal palak             ₹295");	   
				i23=new JMenuItem("Paneer palak          ₹259");
				i24=new JMenuItem("Veg Kolhapuri         ₹295");	   
				i25=new JMenuItem("Veg Lahori            ₹275");
				i26=new JMenuItem("Veg Chakori           ₹275");	   
				i27=new JMenuItem("Kaju Curry/Masala     ₹315/345");
				i28=new JMenuItem("Mashroom Masala       ₹295");	   
		   jmc= new JMenu ("Non-Veg");
			   	i211=new JMenuItem("Mutton fry/Curry     ₹499/459");
				i212=new JMenuItem("Mutton Alani         ₹449");	   
				i213=new JMenuItem("Mutton Banjara       ₹439");
				i214=new JMenuItem("Butter Chikken       ₹399");	   
				i215=new JMenuItem("Mutton Hand          ₹559");
				i216=new JMenuItem("Chiken handi         ₹499");	   
				i217=new JMenuItem("Fish Fry             ₹299");
				i218=new JMenuItem("Fish Curry           ₹249");	
	
	//Angar---	
		jmC= new JMenu ("Angar");
			
				i31=new JMenuItem("Roti Plain/Butter        ₹30/45");
				i32=new JMenuItem("Bhakari(Jwari/Bajari)    ₹39");	   
				i33=new JMenuItem("Chapati Butter           ₹39");
				i34=new JMenuItem("Naan Plain/Butter        ₹255/69");	   
				i35=new JMenuItem("Kulcha Plain/Butter      ₹40/45");
				i36=new JMenuItem("Laccha Paratha Plain/Butter ₹75/85");	   
				i37=new JMenuItem("Garlic Naan plain/Butter  ₹85/99");
				i38=new JMenuItem("Cheese Garlic Naan plain/Butter  ₹129/139");	
				i39=new JMenuItem("Roti Basket(16pcs)       ₹549");	

	//Rasoi---
		jmD= new JMenu ("Rice & Biryani");
			jmd= new JMenu ("Veg");
					i41=new JMenuItem("Steam Rice(H/F)       ₹95/115");
					i42=new JMenuItem("Indrayani Rice(H/F)   ₹99/119");	   
					i43=new JMenuItem("Jeera Rice(H/F)       ₹105/145");
					i44=new JMenuItem("Indrayani Ghee Rice(H/F)  ₹115/145");	   
					i45=new JMenuItem("Veg Pulad             ₹165");
					i46=new JMenuItem("Dal Khichadi           ₹175");	   
					i47=new JMenuItem("Veg Biryani            ₹259");
					i48=new JMenuItem("Pulao Panner/Kashmiri  ₹230");	   
		    jme= new JMenu ("Non-Veg");
					i411=new JMenuItem("Egg Biryani          ₹345");
					i412=new JMenuItem("Chiken Biryani       ₹349");	   
					i413=new JMenuItem("Mutton Biryani       ₹439");
					i414=new JMenuItem("Mutton Alani Rice    ₹385");	   
					i415=new JMenuItem("Chiken Dum Biryani   ₹405");
					i416=new JMenuItem("Mutton Dumm Biryani  ₹515");	   
					i417=new JMenuItem("Prawns Biryani       ₹549");
						
							
				
				
				
		
//------------	
	//Starter--
		jmA.add(i1);     //step 3
		jmA.add(i2);
		jmA.add(jma);
		  jma.add(i11);
		  jma.add(i12);
		  jma.add(i13);
		  jma.add(i14);
		  jma.add(jmI);
		     jmI.add(i111);
		     jmI.add(i112); 
		     jmI.add(i113);
		  jma.add(i15);
	
	//Rasoi--
	  jmB.add(jmb);  
	  	  jmb.add(i21);
	  	  jmb.add(i22);
	  	  jmb.add(i23);
	  	  jmb.add(i24);
	  	  jmb.add(i25);
	  	  jmb.add(i26);
	  	  jmb.add(i27);
	  	  jmb.add(i28);
	  jmB.add(jmc);  
	  	  jmc.add(i211);
	  	  jmc.add(i212);
	  	  jmc.add(i213);
	  	  jmc.add(i214);
	  	  jmc.add(i215);
	  	  jmc.add(i216);
	  	  jmc.add(i217);
	  	  jmc.add(i218);
	  
	//Angar-----
	  	  jmC.add(i31);
	  	  jmC.add(i32);
	  	  jmC.add(i33);
	  	  jmC.add(i34);
	  	  jmC.add(i35);
	  	  jmC.add(i36);
	  	  jmC.add(i37);
	  	  jmC.add(i38);
	      jmC.add(i39);
		   
	//RIce---
		  jmD.add(jmd);  
		  	  jmd.add(i41);
		  	  jmd.add(i42);
		  	  jmd.add(i43);
		  	  jmd.add(i44);
		  	  jmd.add(i45);
		  	  jmd.add(i46);
		  	  jmd.add(i47);
		  	  jmd.add(i48);
		  jmD.add(jme);  
		  	  jme.add(i411);
		  	  jme.add(i412);
		  	  jme.add(i413);
		  	  jme.add(i414);
		  	  jme.add(i415);
		  	  jme.add(i416);
		  	  jme.add(i417);
		  	 
		l1=new JLabel();
//------------	
		
		mb.add(jmA);      //step 2   //jmA=starter
		mb.add(jmB);
		mb.add(jmC);
		mb.add(jmD);
		
		
		
		jf.add(b1);
		jf.add(l1);
		jf.setJMenuBar(mb);     //step 1
		jf.setSize(600,500);
		jf.setLayout(null);
		jf.setVisible(true);
	}	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		l1.setText("WelCome to Hotel Aamrai 69 🏯 !!");
		l1.setBounds(100, 200, 500, 50);
		l1.setFont(fn);
		
	}


//MAIN CLASS START--
	public static void main(String[] args) {
		
		//Hotel_MenuCard hm = new Hotel_MenuCard();
		//OR
		new Hotel_MenuCard();
		
		ColorChooser cch=new ColorChooser();
	}

}
