package Employee;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
public class SplashScreen implements ActionListener{

	JFrame farme;
	JLabel lbl,lbl2;
	JButton btn;
	
	SplashScreen() {
		//configure farme
		farme = new JFrame("Employee Management System");
		farme.setSize(720,500);
		//farme.getContentPane().setBackground(Color.WHITE);
		farme.setLayout(null);
		farme.setResizable(false);
		farme.setLocation(350,200);
		farme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ImageIcon i1 = new ImageIcon("pic/logoBig.png");
		ImageIcon i1 = new ImageIcon(getClass().getClassLoader().getResource("logoBig.png"));
		Image i2 = i1.getImage().getScaledInstance(695,490,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		
		lbl = new JLabel(i3);
		lbl.setBounds(0,0,700,495);
		farme.add(lbl);
		
		lbl2 = new JLabel("( Click Here To Continue )");
		lbl2.setBounds(240,400,700,50);
		lbl.add(lbl2);
		lbl2.setFont(new Font("Arial", Font.BOLD, 18));
		lbl2.setForeground(Color.RED);
		farme.setVisible(true);
		
		btn = new JButton();
		btn.setBounds(235,410,250,30);
		farme.add(btn);
		btn.addActionListener(this);
		
		while(true) {
			lbl2.setVisible(false);
			
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
			lbl2.setVisible(true);
			try {
				Thread.sleep(500);
			}catch(Exception exc) {}
		}
	}

	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==btn) {
			farme.setVisible(false);
			new Login();
		}
		
		
	}
	public static void main(String[] ars) {
		
		new SplashScreen();
	}
	
	
	
}
