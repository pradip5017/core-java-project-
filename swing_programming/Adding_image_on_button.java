package swing_programming;

import javax.swing.ImageIcon;     
import javax.swing.JButton;
import javax.swing.JFrame;

public class Adding_image_on_button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		//frame/window/panel/container
		JFrame f = new JFrame("Login Page !");
		
		
		ImageIcon i1 = new ImageIcon("C:\\Users\\hp\\Desktop\\demo.txt\\fruits.png");//browsing image 
		
		JButton b1 =new JButton("Submit", i1);//adding image on button
		
		b1.setBounds(900, 300, 150, 80);
		
		
ImageIcon i2 = new ImageIcon("C:\\Users\\hp\\Desktop\\demo.txt");
		
		JButton b2 =new JButton("click me", i1);
		
		b2.setBounds(700, 200, 150, 80);
		
		
		
		
		
		f.setLayout(null);
		f.add(b1);
		f.add(b2);
		
		
		f.setSize(300, 400);//setting size of frame    //first appearence of size..
		
		f.setVisible(true);
		
		
		
		

	}

}
