package swing_programming;

import javax.swing.JButton;     
import javax.swing.JFrame;
/*
package/libraries(java.lang,java.util,java.io) => windows base
JavaEE => Enterprise Edition => web based=> runs on browser

JavaME => Micro Edition     => for developing small scale mobile based application
 */
public class Creating_frame {

	public static void main(String[] args) {
		
		JFrame f= new JFrame("login Form");
		
		
		JButton b1= new JButton("click");
		
		b1.setBounds(800, 200, 140, 50);
		
		
		JButton b2= new JButton("Submit");
		
		b2.setBounds(800, 20,140,50);
		
		f.setLayout(null);
		
		f.add(b1);
		
		f.add(b2);
		
		f.setSize(500, 400);
		f.setVisible(true);
		
		
		

	}

}
