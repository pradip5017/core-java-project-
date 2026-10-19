package swing_programming;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;


class FrameA implements ActionListener
{
	public FrameA() {
		JFrame   f1=new JFrame("FIRST Frame");
		
		JButton b1=new JButton("Goto 2nd Frame");
		b1.addActionListener(this);
		
		    f1.add(b1);
		   f1.setSize(600, 500);
		   f1.setLayout(new FlowLayout());
		   f1.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		new FrameB();    //object of Frame B.
	}
}   //clsoe

class FrameB implements ActionListener
{
	FrameB()
	{
		JFrame   f1=new JFrame("SECOND Frame");
		
		JButton b1=new JButton("Goto 3rd Frame");
		b1.addActionListener(this);
		
		    f1.add(b1);
		   f1.setSize(600, 500);
		   f1.setLayout(new FlowLayout());
		   f1.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 new FrameC();
	}
}

class FrameC implements ActionListener
{
	public FrameC() {
JFrame   f1=new JFrame("THIRD Frame");
		
		JButton b1=new JButton("Goto 1st Frame");
		b1.addActionListener(this);
		
		    f1.add(b1);
		   f1.setSize(600, 500);
		   f1.setLayout(new FlowLayout());
		   f1.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		  new FrameA();
	}
}


public class Integrating_MultiFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 new FrameA();

	}

}
