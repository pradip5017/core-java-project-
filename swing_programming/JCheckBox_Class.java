package swing_programming;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JCheckBox_Class {
	
	JCheckBox_Class(){
		
	
	
	JFrame f = new JFrame("checkbox Demo");
	
	JCheckBox ch = new JCheckBox(  );//non-parameterised constructor //false      //JCheckBox() //true => select , false=> unselected	
	ch.setBounds(100, 700, 150, 50);
	
	
	JCheckBox ch1 = new JCheckBox("CPP" );  //by default the value of this check box is false     //false =>unselected    //JCheckBox()
	ch.setBounds(100, 500, 100, 80);
	
	JCheckBox ch2 = new JCheckBox("Java", true);//selected //JChechBox(String s , Boolean selected);
	ch2.setBounds(100, 300, 160, 50);
	
	JCheckBox ch3 = new JCheckBox("CP" , true); //selected  //JCheckBox(String text, boolean selected)
	ch3.setBounds(100, 200, 50, 50);             //public void setBounds(int x, int y,int width,int height)
													// x-axis means component moves in horizontal direction
													// y-axis means component moves in vertical direction
	JCheckBox ch4 = new JCheckBox("W" , true);
	ch4.setBounds(100, 150, 50, 50);  
	
	
	JCheckBox ch5 = new JCheckBox("Sh" , true);
	
	ch5.setBounds(100, 100, 90, 50);
	
	
	f.add(ch);
	f.add(ch1);
	f.add( ch2);
	f.add(ch3);
	f.add(ch4);
	f.add(ch5);
	
	
	f.setSize(400, 400);
	f.setLayout(null);
	f.setVisible(true);
	
	
	
	
	
	
	
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new  JCheckBox_Class();


	}

}
