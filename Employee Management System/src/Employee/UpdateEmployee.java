package Employee;

import java.awt.Color;
import java.awt.Font;

import java.awt.Image;
import java.awt.event.ActionListener;

import java.sql.ResultSet;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class UpdateEmployee {

	
	JFrame frame;
	JLabel backgroundImageL,searchL,nameL,ageL,addressL,emailL,designationL, idL,fatherL,
			dobL,mobL,educationL,aadharL,nationalityL;
	JTextField searchTF,nameOUTF,ageOUTF,addressOUTF,emailOUTF,designationOUTF,
				idOUTF,fatherOUTF,dobOUTF,mobOUTF,educationOUTF,aadharOUTF,nationalityOUTF;
	JButton iconB, printB,cancelB;
	String name,address,email,designation,father,dob,mob,education,aadhar,nationality,age1,id1;
	int age,id,userInput;
	
	UpdateEmployee(){
		frame = new JFrame("Employee Management System>>Login>>Home>>Update Employee");
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
						userInput = Integer.parseInt(searchTF.getText());
						DatabaseConnectivity connection = new DatabaseConnectivity();
						
						String query = "SELECT * FROM employeedetails where ID = "+userInput+";";
						ResultSet rs = connection.stmt.executeQuery(query);
						while(rs.next()) {
							
							name = rs.getString("Name");
							age = rs.getInt("Age");
							address = rs.getString("Address");
							email = rs.getString("Email");
							designation = rs.getString("Designation");
							id = rs.getInt("ID");
							father = rs.getString("Father");
							dob = rs.getString("DOB");
							mob = rs.getString("Mobile");
							education = rs.getString("Education");
							aadhar = rs.getString("Adhar");
							nationality = rs.getString("Nationality");
							
							nameOUTF.setText(name);
							age1=Integer.toString(age);
							ageOUTF.setText(age1);
							addressOUTF.setText(address);
							emailOUTF.setText(email);
							designationOUTF.setText(designation);
							id1=Integer.toString(id);
							idOUTF.setText(id1);
							fatherOUTF.setText(father);
							dobOUTF.setText(dob);
							mobOUTF.setText(mob);
							educationOUTF.setText(education);
							aadharOUTF.setText(aadhar);
							nationalityOUTF.setText(nationality);
						}
						
						
							
						
					
				}//EOFtry
				catch(Exception e){
				e.printStackTrace();
				}
			}
			
		});
		
		nameL = new JLabel("Name");
		nameL.setBounds(50,80,90,30);
		nameL.setFont(new Font("Arial", Font.BOLD, 16));
		nameL.setForeground(Color.BLACK);
		backgroundImageL.add(nameL);
		
		nameOUTF = new JTextField();
		nameOUTF.setBounds(160,80,180,30);
		nameOUTF.setFont(new Font("Arial", Font.PLAIN, 16));
		nameOUTF.setForeground(Color.BLACK);
		backgroundImageL.add(nameOUTF);
		
		ageL = new JLabel("Age");
		ageL.setBounds(50,120,90,30);
		ageL.setFont(new Font("Arial", Font.BOLD, 16));
		ageL.setForeground(Color.BLACK);
		backgroundImageL.add(ageL);
		
		ageOUTF = new JTextField();
		ageOUTF.setBounds(160,120,180,30);
		ageOUTF.setFont(new Font("Arial", Font.PLAIN, 16));
		ageOUTF.setForeground(Color.BLACK);
		backgroundImageL.add(ageOUTF);
		
		addressL = new JLabel("Address");
		addressL.setBounds(50,160,90,30);
		addressL.setFont(new Font("Arial", Font.BOLD, 16));
		addressL.setForeground(Color.BLACK);
		backgroundImageL.add(addressL);
		
		addressOUTF = new JTextField();
		addressOUTF.setBounds(160,160,180,30);
		addressOUTF.setFont(new Font("Arial", Font.PLAIN, 16));
		addressOUTF.setForeground(Color.BLACK);
		backgroundImageL.add(addressOUTF);
		
		emailL = new JLabel("Email");
		emailL.setBounds(50,200,90,30);
		emailL.setFont(new Font("Arial", Font.BOLD, 16));
		emailL.setForeground(Color.BLACK);
		backgroundImageL.add(emailL);
		
		emailOUTF = new JTextField();
		emailOUTF.setBounds(160,200,180,30);
		emailOUTF.setFont(new Font("Arial", Font.PLAIN, 16));
		emailOUTF.setForeground(Color.BLACK);
		backgroundImageL.add(emailOUTF);
		
		designationL = new JLabel("Designation");
		designationL.setBounds(50,240,90,30);
		designationL.setFont(new Font("Arial", Font.BOLD, 16));
		designationL.setForeground(Color.BLACK);
		backgroundImageL.add(designationL);
		
		designationOUTF = new JTextField();
		designationOUTF.setBounds(160,240,180,30);
		designationOUTF.setFont(new Font("Arial", Font.PLAIN, 16));
		designationOUTF.setForeground(Color.BLACK);
		backgroundImageL.add(designationOUTF);
		
		idL = new JLabel("ID");
		idL.setBounds(50,280,90,30);
		idL.setFont(new Font("Arial", Font.BOLD, 16));
		idL.setForeground(Color.BLACK);
		backgroundImageL.add(idL);
		
		idOUTF = new JTextField();
		idOUTF.setBounds(160,280,180,30);
		idOUTF.setFont(new Font("Arial", Font.PLAIN, 16));
		idOUTF.setForeground(Color.BLACK);
		backgroundImageL.add(idOUTF);
		
		fatherL = new JLabel("Father's Name");
		fatherL.setBounds(360,80,110,30);
		fatherL.setFont(new Font("Arial", Font.BOLD, 16));
		fatherL.setForeground(Color.BLACK);
		backgroundImageL.add(fatherL);
		
		fatherOUTF = new JTextField();
		fatherOUTF.setBounds(490,80,180,30);
		fatherOUTF.setFont(new Font("Arial", Font.PLAIN, 16));
		fatherOUTF.setForeground(Color.BLACK);
		backgroundImageL.add(fatherOUTF);
		
		dobL = new JLabel("DOB");
		dobL.setBounds(360,120,90,30);
		dobL.setFont(new Font("Arial", Font.BOLD, 16));
		dobL.setForeground(Color.BLACK);
		backgroundImageL.add(dobL);
		
		dobOUTF = new JTextField();
		dobOUTF.setBounds(490,120,180,30);
		dobOUTF.setFont(new Font("Arial", Font.PLAIN, 16));
		dobOUTF.setForeground(Color.BLACK);
		backgroundImageL.add(dobOUTF);
		
		mobL = new JLabel("Mobile No");
		mobL.setBounds(360,160,90,30);
		mobL.setFont(new Font("Arial", Font.BOLD, 16));
		mobL.setForeground(Color.BLACK);
		backgroundImageL.add(mobL);
		
		mobOUTF = new JTextField();
		mobOUTF.setBounds(490,160,180,30);
		mobOUTF.setFont(new Font("Arial", Font.PLAIN, 16));
		mobOUTF.setForeground(Color.BLACK);
		backgroundImageL.add(mobOUTF);
		
		educationL = new JLabel("Education");
		educationL.setBounds(360,200,90,30);
		educationL.setFont(new Font("Arial", Font.BOLD, 16));
		educationL.setForeground(Color.BLACK);
		backgroundImageL.add(educationL);
		
		educationOUTF = new JTextField();
		educationOUTF.setBounds(490,200,180,30);
		educationOUTF.setFont(new Font("Arial", Font.PLAIN, 16));
		educationOUTF.setForeground(Color.BLACK);
		backgroundImageL.add(educationOUTF);
		
		aadharL = new JLabel("Aadhar No");
		aadharL.setBounds(360,240,90,30);
		aadharL.setFont(new Font("Arial", Font.BOLD, 16));
		aadharL.setForeground(Color.BLACK);
		backgroundImageL.add(aadharL);
		
		aadharOUTF = new JTextField();
		aadharOUTF.setBounds(490,240,180,30);
		aadharOUTF.setFont(new Font("Arial", Font.PLAIN, 16));
		aadharOUTF.setForeground(Color.BLACK);
		backgroundImageL.add(aadharOUTF);
		
		nationalityL = new JLabel("Nationality");
		nationalityL.setBounds(360,280,90,30);
		nationalityL.setFont(new Font("Arial", Font.BOLD, 16));
		nationalityL.setForeground(Color.BLACK);
		backgroundImageL.add(nationalityL);
		
		nationalityOUTF = new JTextField();
		nationalityOUTF.setBounds(490,280,180,30);
		nationalityOUTF.setFont(new Font("Arial", Font.PLAIN, 16));
		nationalityOUTF.setForeground(Color.BLACK);
		backgroundImageL.add(nationalityOUTF);
		
		printB = new JButton("Update");
		printB.setBounds(250,350,100,30);
		printB.setFont(new Font("Arial", Font.BOLD,16));
		printB.setForeground(Color.RED);
		backgroundImageL.add(printB);
		printB.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent ae) {
				
				try {
					name = nameOUTF.getText();
					age = Integer.parseInt(ageOUTF.getText());
					address = addressOUTF.getText();
					email = emailOUTF.getText();
					designation = designationOUTF.getText();
					id = Integer.parseInt(idOUTF.getText());
					father = fatherOUTF.getText();
					dob = dobOUTF.getText();
					mob = mobOUTF.getText();
					education = educationOUTF.getText();
					aadhar = aadharOUTF.getText();
					nationality = nationalityOUTF.getText();
					
					userInput = Integer.parseInt(searchTF.getText());
					int age,id;
					age=Integer.parseInt(ageOUTF.getText());
					id = Integer.parseInt(idOUTF.getText());
					
					DatabaseConnectivity connection = new DatabaseConnectivity();
					String query = "UPDATE employeedetails SET Name='"+name+"',Age="+age+",Address='"+address+"',Email='"+email+
							"',Designation='"+designation+"',id="+id+",Father='"+father+"',DOB='"+dob+"',Mobile='"+mob+"',Education='"+education+
							"',Adhar='"+aadhar+"',Nationality='"+nationality+"'WHERE ID = "+userInput+";";
					
					int result = connection.stmt.executeUpdate(query);
					String message = result + " Employee Updated Sucessfully";
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


		frame.setVisible(true); 
		
		
				
	}
		
	public static void main(String[] arg) {
		
		new UpdateEmployee();
	}
}
