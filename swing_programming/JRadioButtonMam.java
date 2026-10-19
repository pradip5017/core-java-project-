package swing_programming;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class JRadioButtonMam  extends JFrame implements ActionListener{
	JRadioButton r1,r2;
	JRadioButtonMam(){
		
		super("Using Radio Button");   //calling constructor  of super class JFrame and setting name of frame
		
		//JFrame f=new JFrame("LOgin page"); 
		
		r1=new JRadioButton("yes",  true);
		r1.setBounds(75,50,100,30);
		
		
		r2=new JRadioButton("no");
		
		r2.setBounds(75,50,100,30);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);  //RadioButtons should be added in ButtonGroup to select only  one radio button  at a time.
		bg.add(r2);
		
		
		
		
		//JOptionPane=> message dialog box, confirmation,input dia;p
		JButton b = new JButton("Click");
		b.setBounds(75,150,80,30);
		
		b.addActionListener((ActionListener)this);//this method is called after clicking on the click button  
		
		add(r1);//JRadioButtonDemo extends  JFrame
		add(r2);
		add(b);
		this.setSize(300, 300);
		setLayout(null);
		setVisible(true);
		
	}

		//There is no need to call this method manually..
		//this method will be called automatically when the component is registered using addActionListener() method
		
		
		public void actionPerformed(ActionEvent e) 
		{
			
			if(r1.isSelected())
			{
				JOptionPane.showMessageDialog(r1, "you are ans is yes");
				
			}
			
			if(r2.isSelected())
			{
				JOptionPane.showMessageDialog(r2, "Your are is no");   ///static void showMessageDialog(Component parentComponent, Object message)=>It is used to create an information-message dialog titled "Message".    
			}	
			
	}
	

	public static void main(String[] args) {
	
		new JRadioButtonMam();
		

	}

	
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//	}

}
