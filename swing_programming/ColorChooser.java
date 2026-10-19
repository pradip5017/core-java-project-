package swing_programming;
import java.awt.*;
import java.awt.event.*;


import javax.swing.*;

public class ColorChooser extends JFrame implements ActionListener{

	JButton b;    
	Container c;    //Container is having multiple content pane layers,
	        // so we have to get current content pane layer on which we want perform next action
	
	ColorChooser()
	{    
	    c=getContentPane();             //The getContentPane() method retrieves the content pane layer so that you can add an object to it. The content pane is an object created by the Java run time environment     
	   
	    b=new JButton("color");
	    
	    
	    
	 FlowLayout ff =new FlowLayout(FlowLayout.CENTER);
	    c.setLayout(ff);    //FlowLayout f1 = new FlowLayout()      
	    
	 
	    	  
	    
	    b.addActionListener(this);    //add(6,7)      add(int a,int b       
	    c.add(b);   
	    
	    
	}    
	public void actionPerformed(ActionEvent e) 
	{  
		// JColorChooser jc=new JColorChooser();
		 Color cl = JColorChooser.showDialog(this,"select any color",Color.blue);
		          
		 
		 c.setBackground(cl);    
	}    
	    
	public static void main(String[] args) {    
	    ColorChooser ch=new ColorChooser();    
	    ch.setSize(800,400);    
	    ch.setVisible(true);    
	    ch.setDefaultCloseOperation(EXIT_ON_CLOSE);    
	}    
	}    
