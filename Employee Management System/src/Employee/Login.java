package Employee;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JPasswordField;

public class Login {
	JFrame frame;
	JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6;
	JButton btn1,btn2;
	JTextField userName;
	JPasswordField password;
	Login(){
		frame = new JFrame("Employee Management System>>Login");
		frame.setSize(720,500);
		//frame.getContentPane().setBackground(Color.WHITE);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocation(350,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ImageIcon i1 = new ImageIcon("pic/login.png");
		ImageIcon i1 = new ImageIcon(getClass().getClassLoader().getResource("login.png"));
		Image img = i1.getImage().getScaledInstance(190, 190, Image.SCALE_DEFAULT);
		ImageIcon i2 = new ImageIcon(img);
		
		lbl1 = new JLabel(i2);
		lbl1.setBounds(30,40,200,200);
		frame.add(lbl1);
				
		//ImageIcon i3 = new ImageIcon("pic/user.png");
		ImageIcon i3 = new ImageIcon(getClass().getClassLoader().getResource("user.png"));
		lbl2 = new JLabel(i3);
		lbl2.setBounds(330,80,110,50);
		lbl2.setFont(new Font("Arial", Font.PLAIN, 20));
		frame.add(lbl2);
		
		//ImageIcon i4 = new ImageIcon("pic/password.png");
		ImageIcon i4 = new ImageIcon(getClass().getClassLoader().getResource("password.png"));
		lbl3 = new JLabel(i4);
		lbl3.setBounds(330,140,110,50);
		lbl3.setFont(new Font("Arial", Font.PLAIN, 20));
		frame.add(lbl3);
		
		userName = new JTextField();
		userName.setBounds(420,90,200,30);
		userName.setFont(new Font("Arial", Font.PLAIN, 16));
		frame.add(userName);
		
		password = new JPasswordField();
		password.setBounds(420,150,200,30);
		password.setFont(new Font("Arial", Font.PLAIN, 16));
		frame.add(password);
		
		//ImageIcon i5 = new ImageIcon("pic/ok.png");
		ImageIcon i5 = new ImageIcon(getClass().getClassLoader().getResource("ok.png"));
		btn1 = new JButton(i5);
		btn1.setBounds(360,220,90,40);
		btn1.setFont(new Font("Arial", Font.PLAIN, 20));
		frame.add(btn1);
		btn1.addActionListener(new ActionListener() {
		
				public void actionPerformed(ActionEvent ae) {
					try {
						DatabaseConnectivity connection = new DatabaseConnectivity();
						String userNameInput = userName.getText();
						String userPasswordInput = password.getText();
						String sqlQuery = "select * from logincredentials where userName='"+userNameInput+"' and password='"+userPasswordInput+"';";
						ResultSet rs = connection.stmt.executeQuery(sqlQuery);
						
						if(rs.next()) {
							frame.setVisible(false);
							new HomePage().frame.setVisible(true);
							
						}else 
							JOptionPane.showMessageDialog(null,"Invalid User/Password");
						
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
		});
		
		
		//ImageIcon i6 = new ImageIcon("pic/cancel.png");
		
		btn2 = new JButton("RESET");
		btn2.setBounds(500,220,100,40);
		btn2.setFont(new Font("Arial", Font.PLAIN, 20));
		btn2.setForeground(Color.RED);
		frame.add(btn2);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				frame.setVisible(false);
				new PasswordReset().frame.setVisible(true);
			}
		});
		
		//Support Section
		lbl4 = new JLabel();
		lbl4.setBounds(0,320,706,142);
		frame.add(lbl4);
		Border blackline = BorderFactory.createLineBorder(Color.BLUE, 2);
		lbl4.setBorder(blackline);
		
		lbl5 = new JLabel("Support : ");
		lbl5.setBounds(20,0,100,30);
		lbl5.setFont(new Font("Arial", Font.BOLD, 20));
		lbl5.setForeground(Color.RED);
		lbl4.add(lbl5);
		
		lbl6 = new JLabel();
		lbl6 = new JLabel("<html>Mobile No. : +977 - 9815825100<br>Mobile No. : +91 &ensp;- 7082621681<br>Email&ensp&ensp;&ensp;&ensp;&ensp;: javadeveloper.jillajit@gmail.com<br>Website &ensp;&ensp;: jeettechsolution.com</html> ");
		lbl6.setBounds(120,10,500,150);
		lbl6.setFont(new Font("Arial", Font.PLAIN, 18));
		lbl6.setForeground(Color.BLACK);
		lbl4.add(lbl6);
		
		
		frame.setVisible(true);
	}
	
	
	
	public static void main(String[] arg) {
		new Login();
	}

}


	
