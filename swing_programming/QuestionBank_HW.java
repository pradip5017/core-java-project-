package swing_programming;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;




public class QuestionBank_HW extends JFrame implements ActionListener {
	
	JRadioButton jr1,jr2,jr3,jr4, jr21,jr22,jr23,jr24, jr31,jr32,jr33,jr34;
	JLabel l1,l2,l3,l11,l22,l33;
	ButtonGroup  bg,bg2,bg3;
	JButton b1,b2,b3;
	
	QuestionBank_HW(){     //constructor---
		
		//JFrame jf=new JFrame();
		super(" Question Bank !! ");
		
		Font fn=new Font("Times new roman", Font.BOLD, 17);  

//Que 1-
		JLabel jl=new JLabel("Q1-What is the maximum thread priority in java? ");
		jl.setBounds(20, 20, 500, 30);
		jl.setFont(fn);
	
				Font mcqfn=new Font("Times new roman", Font.BOLD, 16);  
				
				jr1=new JRadioButton("5");
				jr1.setBounds(50, 50, 100, 50);
				jr1.setFont(mcqfn);
				
				jr2=new JRadioButton("20",true);
				jr2.setBounds(50, 90, 100, 50);
				jr2.setFont(mcqfn);
				
				jr3=new JRadioButton("9");   //radio button is byDefault false=>Unselected.
				jr3.setBounds(50, 130, 100, 50);
				jr3.setFont(mcqfn);
				
				jr4=new JRadioButton("10");
				jr4.setBounds(50, 170, 100, 50);
				jr4.setFont(mcqfn);
				
				bg=new ButtonGroup();
				bg.add(jr1);
				bg.add(jr2);
				bg.add(jr3);
				bg.add(jr4);
				
				b1=new JButton("SUBMIT");
				b1.setBounds(50, 220,100,30);
				b1.setFont(mcqfn);
				b1.addActionListener((ActionListener)this);
				
				 l1= new JLabel();          
			     l1.setBounds(50, 230, 400, 100);
			     l1.setFont(mcqfn);
			     
			     l11= new JLabel();          
			     l11.setBounds(50, 250, 400, 100);
			     l11.setFont(mcqfn);
			     

//Que 2---------------------------
			   	
		JLabel jl2=new JLabel("Q2-Which method must be implemented by java thread");
			   	jl2.setBounds(20, 320, 500, 30);
			   	jl2.setFont(fn);
			   	
			   	
			   	jr21=new JRadioButton("run()");
			   	jr21.setBounds(50, 360, 100, 50);
			   	jr21.setFont(mcqfn);
			   				
			   	jr22=new JRadioButton("Start");
			   	jr22.setBounds(50, 400, 100, 50);
			    jr22.setFont(mcqfn);
			   				
			   	jr23=new JRadioButton("wait()");   //radio button is byDefault false=>Unselected.
			   	jr23.setBounds(50, 440, 100, 50);
			   	jr23.setFont(mcqfn);
			   				
			   	jr24=new JRadioButton("sleep()");
			   	jr24.setBounds(50, 480, 100, 50);
			   	jr24.setFont(mcqfn);
			   				
			   	bg2=new ButtonGroup();
			   	bg2.add(jr21);
			   	bg2.add(jr22);
			   	bg2.add(jr23);
			   	bg2.add(jr24);
			   				
			   	b2=new JButton("SUBMIT");
			   	b2.setBounds(50, 530,100,30);
			   	b2.setFont(mcqfn);
			   	b2.addActionListener((ActionListener)this);
			   				
			   	l2= new JLabel();          
			   	l2.setBounds(50, 540, 400, 100);
			    l2.setFont(mcqfn);
			    
			    l22= new JLabel();          
			   	l22.setBounds(50, 560, 400, 100);
			    l22.setFont(mcqfn);
			   			    			     

//Que 3---------------------------
			  			   	
			JLabel jl3=new JLabel("Q3-which one is the following unchecked exception in java ? ");
			 jl3.setBounds(20, 625  , 500, 30);
			 jl3.setFont(fn);
			  			   	
			  			   	
			  jr31=new JRadioButton("ClassNotFoundException");
			  jr31.setBounds(50, 660, 300, 50);
			  jr31.setFont(mcqfn);
			  			   				
			  jr32=new JRadioButton("SQLException");
			  jr32.setBounds(50, 700, 300, 50);
			  jr32.setFont(mcqfn);
			  			   				
			  jr33=new JRadioButton("IOException");   //radio button is byDefault false=>Unselected.
			  jr33.setBounds(50, 740, 300, 50);
			  jr33.setFont(mcqfn);
			  			   				
		      jr34=new JRadioButton("ArithmeticException");
			  jr34.setBounds(50, 780, 300, 50);
			  jr34.setFont(mcqfn);
			  			   				
			  bg3=new ButtonGroup();
				bg3.add(jr31);
			   	bg3.add(jr32);
			   	bg3.add(jr33);
			   	bg3.add(jr34);
				
			   	b3=new JButton("SUBMIT");
			   	b3.setBounds(50, 830,100,30);
			   	b3.setFont(mcqfn);
			   	b3.addActionListener((ActionListener)this);
			   				
			   	l3= new JLabel();          
			   	l3.setBounds(50, 840, 400, 100);
			    l3.setFont(mcqfn);
			    
			    l33= new JLabel();          
			   	l33.setBounds(50, 860, 400, 100);
			    l33.setFont(mcqfn);
			  			   			    			     
			                                  
			     
			
		
	//adding items into frame---	
		add(jl);
			add(jr1);
			add(jr2);
			add(jr3);
			add(jr4);
			add(b1);
			add(l1);
			add(l11);
			
			
		add(jl2);
			add(jr21);
			add(jr22);
			add(jr23);
			add(jr24);
			add(b2);
			add(l2);
			add(l22);
			
		add(jl3);
			add(jr31);
			add(jr32);
			add(jr33);
			add(jr34);
			add(b3);
			add(l3);
			add(l33);
		
		setSize(1000, 1000);
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(b1==e.getSource()) {
					if(jr1.isSelected()) {
						l1.setText("In Java Maximum thread priority is = "+jr1.getText());
						//l11.setText("But, The Correct Answer is = (d)10");
					}
					if(jr2.isSelected()) {
						l1.setText("In Java Maximum thread priority is = "+jr2.getText());
					}
					if(jr3.isSelected()) {
						l1.setText("In Java Maximum thread priority is = "+jr3.getText());
					}
					if(jr4.isSelected()) {
						l1.setText("In Java Maximum thread priority is = "+jr4.getText());
					}
			l11.setText("But, The Correct Answer is = (d)10");
		}
		
		if(b2==e.getSource()) {
					if(jr21.isSelected()) {
						l2.setText("In above methods, java has implemented  = "+jr21.getText());
					}
					else if(jr22.isSelected()) {
						l2.setText("In above methods, java has implemented  = "+jr22.getText());
					}
					else if(jr23.isSelected()) {
						l2.setText("In above methods, java has implemented  = "+jr23.getText());
					}
					else if(jr24.isSelected()) {
						l2.setText("In above methods, java has implemented  = "+jr24.getText());
					}
			l22.setText("But, The Correct Answer is = (a)run() method ");
		}
		
		if(b3==e.getSource()) {
				if(jr31.isSelected()) {
					l3.setText("In above Exceptions of java, Unchecked exception is  = "+jr31.getText());
				}
				else if(jr32.isSelected()) {
					l3.setText("In above Exceptions of java, Unchecked exception is  = "+jr32.getText());
				}
				else if(jr33.isSelected()) {
					l3.setText("In above Exceptions of java, Unchecked exception is  = "+jr33.getText());
				}
				else if(jr34.isSelected()) {
					l3.setText("In above Exceptions of java, Unchecked exception is  = "+jr34.getText());
				}	
			l33.setText("But, The Correct Answer is = (d)Arithematic Exception");
		}
		
	}
	
	
//MAIN CLASS START HERE__________________________________________________
	
	public static void main(String[] args) {
		
		QuestionBank_HW qb = new QuestionBank_HW();
	}

}