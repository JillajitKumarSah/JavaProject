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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class PasswordReset {

	
	JFrame frame;
	JButton btn1,btn2;
	JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9;
	JTextField userName;
	JPasswordField password,confirmPassword;
	String message="";
		
	PasswordReset() {
			frame = new JFrame("Employee Management System>>Login>>RESET");
			frame.setSize(720,500);
			frame.setLayout(null);
			frame.setResizable(false);
			frame.setLocation(350,200);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//ImageIcon i1 = new ImageIcon("pic/resetPassword.jpg");
			ImageIcon i1 = new ImageIcon(getClass().getClassLoader().getResource("resetPassword.jpg"));
			Image img = i1.getImage().getScaledInstance(190, 190, Image.SCALE_DEFAULT);
			ImageIcon i2 = new ImageIcon(img);
			
			lbl1 = new JLabel(i2);
			lbl1.setBounds(30,40,200,200);
			frame.add(lbl1);
					
			lbl2 = new JLabel("User Name");
			lbl2.setBounds(270,40,130,30);
			lbl2.setFont(new Font("Arial", Font.PLAIN, 16));
			frame.add(lbl2);
			
			lbl3 = new JLabel("Password");
			lbl3.setBounds(270,100,130,30);
			lbl3.setFont(new Font("Arial", Font.PLAIN, 16));
			frame.add(lbl3);
			
			lbl7 = new JLabel("Confirm Password");
			lbl7.setBounds(270,160,130,30);
			lbl7.setFont(new Font("Arial", Font.PLAIN, 16));
			frame.add(lbl7);
			
			
			userName = new JTextField();
			userName.setBounds(440,40,200,30);
			userName.setFont(new Font("Arial", Font.PLAIN, 16));
			frame.add(userName);
			
			password = new JPasswordField();
			password.setBounds(440,100,200,30);
			password.setFont(new Font("Arial", Font.PLAIN, 16));
			frame.add(password);
			
			
			confirmPassword = new JPasswordField();
			confirmPassword.setBounds(440,160,200,30);
			confirmPassword.setFont(new Font("Arial", Font.PLAIN, 16));
			frame.add(confirmPassword);
			lbl9 = new JLabel(message);
			lbl9.setBounds(440,190,200,30);
			lbl9.setFont(new Font("Arial", Font.PLAIN, 10));
			lbl9.setForeground(Color.RED);
			frame.add(lbl9);
			
			//ImageIcon i5 = new ImageIcon("pic/ok.png");
			ImageIcon i5 = new ImageIcon(getClass().getClassLoader().getResource("ok.png"));
			btn1 = new JButton(i5);
			btn1.setBounds(360,220,90,40);
			btn1.setFont(new Font("Arial", Font.PLAIN, 20));
			frame.add(btn1);
			btn1.addActionListener(new ActionListener() {
			
					public void actionPerformed(ActionEvent ae) {
						
						String s1=new String(password.getText());
						String s2=new String(confirmPassword.getText());
						int compareValue = s1.compareTo(s2);
						
						if((userName.getText().isEmpty()) || (password.getText().isEmpty())) {
						JOptionPane.showMessageDialog(null,"Username/Password Cannot be empty");
						} 
						else if (compareValue!=0) {
							lbl9.setText("Password Mismatch");
						}
							
						else {
						
							try {
								DatabaseConnectivity connection = new DatabaseConnectivity();
								String userNameInput = userName.getText();
								String userPasswordInput = password.getText();
								String existingUserName="";
								
								/*************check username*************/
								ResultSet rs = connection.stmt.executeQuery("Select userName from logincredentials;");
								if(rs.next()) {
									
									existingUserName = rs.getString(1); //return userName from databse
								} // EOF if
								/******************************************************************************/
								
								String sqlQuery = "UPDATE logincredentials SET userName='"+userNameInput+"',  password='"+userPasswordInput+"' WHERE userName='"+existingUserName+"';";
								
								int result = connection.stmt.executeUpdate(sqlQuery);
								
								if(result==1) {
									JOptionPane.showMessageDialog(null, "Update Sucessful");
									frame.setVisible(false);
									new Login().frame.setVisible(true);
									
								}else 
									JOptionPane.showMessageDialog(null,"Invalid");
								
							}//EOF try
							catch(Exception e) {
								e.printStackTrace();
							} //EOF catch
						} //EOF else
					}//EOF actionPerformed()
			});
			
			
			//ImageIcon i6 = new ImageIcon("pic/cancel.png");
			ImageIcon i6 = new ImageIcon(getClass().getClassLoader().getResource("cancel.png"));
			btn2 = new JButton(i6);
			btn2.setBounds(500,220,100,40);
			btn2.setFont(new Font("Arial", Font.PLAIN, 20));
			frame.add(btn2);
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					frame.setVisible(false);
					new Login().frame.setVisible(true);
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

	public static void main(String[] args) {
		new PasswordReset();
	}

}
