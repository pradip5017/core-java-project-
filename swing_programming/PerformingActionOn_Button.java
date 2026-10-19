package swing_programming;

import java.awt.Font;     

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//Swing is a graphical user interface (GUI) toolkit for Java that is used to create applications. 
//It is part of Oracle's Java Foundation Classes (JFC

//public class PerformingActionOn_Button {
//
//	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//JLabel   =>means readOnly text
		//JTextField => single line of Editable place
		//JTextArea => multi line of Editable place

		//1.Marker interface/zero/empty  => Serializable, Cloneable
		//2.functional/Single Abstract Method(SAM) interface/ one method =>Runnable,ActionListener=> actionPerformed()

		class PerformingActionOnButton implements ActionListener {

			JTextField t1;
			 
		     void PerformingActionOn_Button() 
		     {
				JFrame f= new JFrame("Login Page");
				
				 Font fn= new Font("Times new roman",Font.BOLD,20);
			     
				
			          
				JLabel  l1 =new JLabel("Enter text.....");
		        l1.setBounds(100, 140 , 160, 20); 
		        l1.setFont(fn);
				
		        t1=new JTextField();
		        t1.setBounds(100, 165 , 180, 80); 
				
				JButton b2= new JButton("Click");  //adding image on button
				b2.setBounds(100, 270, 120, 45);    //setting parameters of button
			   b2.addActionListener(this);    //registering button with ActionListener.....this line will get execute when we click on this button..and then it will automatically call actionPerformed() method defined below
				  
				
				
				
				f.setLayout(null); 
				    
				  
				    f.add(b2);
				    f.add(t1);
				    f.add(l1);
				f.setSize(500, 900);   //setting size of frame
				f.setVisible(true);

			}
			
			public void actionPerformed(ActionEvent e)
			{
				t1.setText("*****WELCOME TO JAVA-SESSION");
				
			}
			
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub

				PerformingActionOnButton p1=new PerformingActionOnButton() ;
					}

		

		
	}


