package swing_programming;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class JRadioButtonDemo11 extends JFrame implements ActionListener{

	JRadioButton r1, r2;
	
	JRadioButtonDemo11(){
		super("Using Radio Button");
		
		
		r1 = new JRadioButton("yes", true);
		r1.setBounds(75, 50, 100, 30);
		
		r2 = new JRadioButton("yes", true);
		r2.setBounds(75, 50, 100, 30);
		
		JButton b1 = new JButton("Click");
		b1.setBounds(75, 100, 100, 50);
		
		b1.addActionListener((ActionListener)this);
		
		add(r1);
		add(r2);
		add(b1);
		
		this.setSize(300, 300);
		setLayout(null);
		setVisible(true);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(r1.isSelected()) {
			JOptionPane.showMessageDialog(r1, "Your answer is yes");
		}
		
		if(r2.isSelected()) {
			JOptionPane.showMessageDialog(r2, "your answer is yes");
		}
		
	}

	public static void main(String[] args) {
		
		new  JRadioButtonDemo11();
		
	}
}
