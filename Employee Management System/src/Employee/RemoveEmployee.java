package Employee;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RemoveEmployee {

	JFrame frame;
	JLabel backgroundImageL,searchL,lbl3,lbl5,nameL,nameOUL,designationL,designationOUL;
	JButton submitB, cancelB,iconB;
	JTextField searchTF;
	
	RemoveEmployee(){
		frame = new JFrame("Employee Management System>>Login>>Home>>Remove Employee");
		frame.setSize(720,500);
		//frame.getContentPane().setBackground(Color.WHITE
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocation(350,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ImageIcon i1 = new ImageIcon("pic/dataentry.jpg");
		ImageIcon i1 = new ImageIcon(getClass().getClassLoader().getResource("dataentry.jpg"));
		Image i2 = i1.getImage().getScaledInstance(720,500,Image.SCALE_DEFAULT);
		ImageIcon img = new ImageIcon(i2);
		backgroundImageL = new JLabel(img);
		backgroundImageL.setBounds(0,0,720,500);
		frame.add(backgroundImageL);
		
		searchL = new JLabel("Enter Employee ID");
		searchL.setBounds(80,15,180,30);
		searchL.setFont(new Font("Arial", Font.BOLD,18));
		searchL.setForeground(Color.DARK_GRAY);
		backgroundImageL.add(searchL);
		
		searchTF = new JTextField();
		searchTF.setBounds(270,15,200,30);
		searchTF.setFont(new Font("Arial", Font.PLAIN,16));
		searchTF.setForeground(Color.BLACK);
		backgroundImageL.add(searchTF);
		
		//ImageIcon icon = new ImageIcon("pic/searchIcon.png");
		ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("searchIcon.png"));
		iconB = new JButton(icon);
		iconB.setBounds(475,15,30,30);
		backgroundImageL.add(iconB);
		iconB.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent ae) {
				try {
						String name,designation;
						int userInput = Integer.parseInt(searchTF.getText());
						DatabaseConnectivity connection = new DatabaseConnectivity();
						
						String query = "SELECT * FROM employeedetails where ID = "+userInput+";";
						ResultSet rs = connection.stmt.executeQuery(query);
						while(rs.next()) {
							
							name = rs.getString("Name");
							designation = rs.getString("Designation");
							nameOUL.setText(name);
							designationOUL.setText(designation);
							
						}
						
						
						
						
						
				}//EOFtry
				catch(Exception e){
				e.printStackTrace();
				}
			}
			
		});
		
		submitB = new JButton("REMOVE");
		submitB.setBounds(240,350,110,30);
		submitB.setFont(new Font("Arial", Font.BOLD,16));
		submitB.setForeground(Color.RED);
		backgroundImageL.add(submitB);
		submitB.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent ae) {
				
				try {

					int userInput = Integer.parseInt(searchTF.getText());
					DatabaseConnectivity connection = new DatabaseConnectivity();
					String query = "DELETE FROM employeedetails where ID = "+userInput+";";
					int result = connection.stmt.executeUpdate(query);
					String message = result + " Employee deleted Sucessfully";
					JOptionPane.showMessageDialog(null,message);
					frame.setVisible(false);
					new HomePage().frame.setVisible(true);
					
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		
		
		cancelB = new JButton("CANCEL");
		cancelB.setBounds(370,350,100,30);
		cancelB.setFont(new Font("Arial", Font.BOLD,16));
		cancelB.setForeground(Color.red);
		backgroundImageL.add(cancelB);
		cancelB.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent ae) {
				
				try {
					frame.setVisible(false);
					new HomePage().frame.setVisible(true);
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
			
		});
		

		nameL = new JLabel("Name");
		nameL.setBounds(50,80,90,30);
		nameL.setFont(new Font("Arial", Font.BOLD, 16));
		nameL.setForeground(Color.BLACK);
		backgroundImageL.add(nameL);
		
		nameOUL = new JLabel();
		nameOUL.setBounds(160,80,180,30);
		nameOUL.setFont(new Font("Arial", Font.PLAIN, 16));
		nameOUL.setForeground(Color.BLACK);
		backgroundImageL.add(nameOUL);
		
		designationL = new JLabel("Designation");
		designationL.setBounds(50,120,90,30);
		designationL.setFont(new Font("Arial", Font.BOLD, 16));
		designationL.setForeground(Color.BLACK);
		backgroundImageL.add(designationL);
		
		designationOUL = new JLabel();
		designationOUL.setBounds(160,120,180,30);
		designationOUL.setFont(new Font("Arial", Font.PLAIN, 16));
		designationOUL.setForeground(Color.BLACK);
		backgroundImageL.add(designationOUL);

		frame.setVisible(true);
	}
	public static void main(String[] arg) {
		
		new RemoveEmployee();
	}
	
}
