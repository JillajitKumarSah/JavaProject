package Employee;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class HomePage implements ActionListener{
	
	JFrame frame;
	JLabel lbl1,lbl2,lbl3,lbl5;
	JButton btn1, btn2, btn3, btn4;
	
	HomePage() {
		frame = new JFrame("Employee Management System>>Login>>Home");
		frame.setSize(720,500);
		//frame.getContentPane().setBackground(Color.WHITE
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocation(350,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ImageIcon img1 =new ImageIcon("pic/logo2.png");
		ImageIcon img1 = new ImageIcon(getClass().getClassLoader().getResource("logo2.png"));
		Image i1 = img1.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
		ImageIcon img = new ImageIcon(i1);
		
		lbl1 = new JLabel(img);
		lbl1.setBounds(100,80,310,310);
		frame.add(lbl1);
		
		lbl2 = new JLabel();
		lbl2.setBounds(411,0,309,500);
		frame.add(lbl2);
		
		lbl3 = new JLabel("Employe Details");
		lbl3.setFont(new Font("Arial", Font.PLAIN,32));
		lbl3.setForeground(Color.BLUE);
		lbl3.setBounds(0,0,300,50);
		lbl2.add(lbl3);
		
		btn1 = new JButton("ADD");
		btn1.setFont(new Font("Arial",Font.BOLD,18));
		btn1.setBounds(0,100,120,40);
		lbl2.add(btn1);
		btn1.addActionListener(this);/*
		btn1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent ae) {
				try {
					frame.setVisible(false);
					new 
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		});  */
		
		btn2 = new JButton("REMOVE");
		btn2.setFont(new Font("Arial",Font.BOLD,18));
		btn2.setBounds(150,100,120,40);
		lbl2.add(btn2);
		btn2.addActionListener(this);
		
		btn3 = new JButton("VIEW");
		btn3.setFont(new Font("Arial",Font.BOLD,18));
		btn3.setBounds(0,170,120,40);
		lbl2.add(btn3);
		btn3.addActionListener(this);
		
		btn4 = new JButton("UPDATE");
		btn4.setFont(new Font("Arial",Font.BOLD,18));
		btn4.setBounds(150,170,120,40);
		lbl2.add(btn4);
		btn4.addActionListener(this);
		
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==btn1) {
			
			frame.setVisible(false);
			new AddEmployee();
			
		}

		if(ae.getSource()==btn2) {
			
			frame.setVisible(false);
			new RemoveEmployee();
		}

		if(ae.getSource()==btn3) {
			frame.setVisible(false);
			new ViewEmployee();
		}

		if(ae.getSource()==btn4) {
			frame.setVisible(false);
			new UpdateEmployee();
		}

		
	}
	
	public static void main(String[] arg) {
		
		new HomePage();
		
	}

}
