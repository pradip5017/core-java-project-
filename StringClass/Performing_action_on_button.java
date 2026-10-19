package StringClass;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//JLabel   =>means readOnly text
//JTextField => single line of Editable place
//JTextArea => multi line of Editable place

//TYPES OF INTERFACE---->
//1.Marker interface/zero/empty  => Serializable, Cloneable
//2.functional/Single Abstract Method(SAM) interface/ one method =>Runnable,ActionListener=> actionPerformed()
public class Performing_action_on_button implements ActionListener {
	
	
	JTextField t1 ;
	
	Performing_action_on_button(){
		
		JFrame f1 = new JFrame("login here");
		
		Font fn = new Font("tim is new roman", Font.BOLD,20);
		
		
		JLabel l1 = new JLabel("Enter text");
		 
		l1.setBounds(100, 140, 150 , 680);
		
		l1.setFont(fn);
		
		t1 = new JTextField();
		t1.setBounds(100, 180, 160, 60);
		
		
		JButton b2 = new JButton("Click me");//adding image on button
		
		b2.setBounds(100, 170, 180, 80); //setting parameters of button
		b2.addActionListener(this);//registering button with ActionListener.....this line will get execute when we click on this button..and then it will automatically call actionPerformed() method defined below
		
		
		
		
	f1.setLayout(null);
	
	f1.add(b2);
	f1.add(l1);
	f1.add(t1);
	
	f1.setSize(500, 800);
	f1.setVisible(true);
		
	}
	
	public void ActionPerformed(ActionEvent e) {
		
		t1.setText("****** Welcome to my class");
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Performing_action_on_button p1 = new Performing_action_on_button();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
