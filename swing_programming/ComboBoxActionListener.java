package swing_programming;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxActionListener  implements ActionListener{
	
	private static final ActionListener ActionListener = null;

	JComboBox cb, cb1;
	
	JLabel l1, l2;
	
	ComboBoxActionListener()
	{
		JFrame f = new JFrame();
		
		String lang [] = {"java", "cp", "pythod", "detnet", "js"};
		
		
//		Vector<String> land = new Vector();
		 
		
		cb = new JComboBox(lang);
		cb.setBounds(50, 50, 90, 20);
		
		
		String citis [] = {"pune", "nashil", "mumbai", "beed" , "thane", "sambhaji nagar"};
		
		
		cb1 = new JComboBox(citis);
		cb1.setBounds(200, 50, 90, 20);
		
		
		l1 = new JLabel();
		
		l1.setBounds(50, 150, 300, 400);
		
		
		l2 = new JLabel();
		l2.setBounds(50, 200, 300, 400);
		
		
		cb.addActionListener((ActionListener)this);
		cb1.addActionListener((ActionListener)this);
		
		f.add(cb);
		f.add(cb1);
		f.add(l1);
		f.add(l2);
		
		
		
		f.setLayout(null);
		f.setSize(400, 500);
		f.setVisible(true);
		
		
		
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(cb.isPopupVisible())
		{
			String str = "The language selected by you : "+cb.getItemAt(cb.getSelectedIndex());
			
			l1.setText(str);
			
		}
		
		if(cb1.isPopupVisible())
		{
			String str1 = "The Language is selected by you is  : " +cb1.getItemAt(cb1.getSelectedIndex());
			
			l2.setText(str1);
		}
		
	}
	
	
	public static void main(String[] args) {
	
		new ComboBoxActionListener();
	}


}
