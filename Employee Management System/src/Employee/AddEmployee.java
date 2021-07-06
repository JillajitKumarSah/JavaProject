package Employee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class AddEmployee {

	JFrame frame;
	JLabel backgroundImageL,headingL,nameL,ageL,addressL,emailL,designationL, idL,fatherL,dobL,mobL,educationL,aadharL,nationalityL;
	JButton submitB,cancelB;
	JTextField nameTF,ageTF,addressTF,emailTF,designationTF, idTF,fatherTF,dobTF,mobTF,educationTF,aadharTF,nationalityTF;
	
	AddEmployee(){
		frame = new JFrame("Employee Management System>>Login>>Home>>Add Employee");
		frame.setSize(720,500);
		//frame.getContentPane().setBackground(Color.WHITE)
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
		
		headingL = new JLabel("Fill New Employee Details");
		headingL.setBounds(230,10,260,40);
		headingL.setFont(new Font("Arial", Font.ITALIC, 20));
		headingL.setForeground(Color.darkGray);
		backgroundImageL.add(headingL);
		
		nameL = new JLabel("Name");
		nameL.setBounds(50,80,90,30);
		nameL.setFont(new Font("Arial", Font.BOLD, 16));
		nameL.setForeground(Color.darkGray);
		backgroundImageL.add(nameL);
		
		nameTF = new JTextField();
		nameTF.setBounds(160,80,180,30);
		nameTF.setFont(new Font("Arial", Font.PLAIN, 16));
		nameTF.setForeground(Color.darkGray);
		backgroundImageL.add(nameTF);
		
		ageL = new JLabel("Age");
		ageL.setBounds(50,120,90,30);
		ageL.setFont(new Font("Arial", Font.BOLD, 16));
		ageL.setForeground(Color.darkGray);
		backgroundImageL.add(ageL);
		
		ageTF = new JTextField();
		ageTF.setBounds(160,120,180,30);
		ageTF.setFont(new Font("Arial", Font.PLAIN, 16));
		ageTF.setForeground(Color.darkGray);
		backgroundImageL.add(ageTF);
		
		addressL = new JLabel("Address");
		addressL.setBounds(50,160,90,30);
		addressL.setFont(new Font("Arial", Font.BOLD, 16));
		addressL.setForeground(Color.darkGray);
		backgroundImageL.add(addressL);
		
		addressTF = new JTextField();
		addressTF.setBounds(160,160,180,30);
		addressTF.setFont(new Font("Arial", Font.PLAIN, 16));
		addressTF.setForeground(Color.darkGray);
		backgroundImageL.add(addressTF);
		
		emailL = new JLabel("Email");
		emailL.setBounds(50,200,90,30);
		emailL.setFont(new Font("Arial", Font.BOLD, 16));
		emailL.setForeground(Color.darkGray);
		backgroundImageL.add(emailL);
		
		emailTF = new JTextField();
		emailTF.setBounds(160,200,180,30);
		emailTF.setFont(new Font("Arial", Font.PLAIN, 16));
		emailTF.setForeground(Color.darkGray);
		backgroundImageL.add(emailTF);
		
		designationL = new JLabel("Designation");
		designationL.setBounds(50,240,90,30);
		designationL.setFont(new Font("Arial", Font.BOLD, 16));
		designationL.setForeground(Color.darkGray);
		backgroundImageL.add(designationL);
		
		designationTF = new JTextField();
		designationTF.setBounds(160,240,180,30);
		designationTF.setFont(new Font("Arial", Font.PLAIN, 16));
		designationTF.setForeground(Color.darkGray);
		backgroundImageL.add(designationTF);
		
		idL = new JLabel("ID");
		idL.setBounds(50,280,90,30);
		idL.setFont(new Font("Arial", Font.BOLD, 16));
		idL.setForeground(Color.darkGray);
		backgroundImageL.add(idL);
		
		idTF = new JTextField();
		idTF.setBounds(160,280,180,30);
		idTF.setFont(new Font("Arial", Font.PLAIN, 16));
		idTF.setForeground(Color.darkGray);
		backgroundImageL.add(idTF);
		
		fatherL = new JLabel("Father's Name");
		fatherL.setBounds(360,80,110,30);
		fatherL.setFont(new Font("Arial", Font.BOLD, 16));
		fatherL.setForeground(Color.darkGray);
		backgroundImageL.add(fatherL);
		
		fatherTF = new JTextField();
		fatherTF.setBounds(490,80,180,30);
		fatherTF.setFont(new Font("Arial", Font.PLAIN, 16));
		fatherTF.setForeground(Color.darkGray);
		backgroundImageL.add(fatherTF);
		
		dobL = new JLabel("DOB");
		dobL.setBounds(360,120,90,30);
		dobL.setFont(new Font("Arial", Font.BOLD, 16));
		dobL.setForeground(Color.darkGray);
		backgroundImageL.add(dobL);
		
		dobTF = new JTextField();
		dobTF.setBounds(490,120,180,30);
		dobTF.setFont(new Font("Arial", Font.PLAIN, 16));
		dobTF.setForeground(Color.darkGray);
		backgroundImageL.add(dobTF);
		
		mobL = new JLabel("Mobile No");
		mobL.setBounds(360,160,90,30);
		mobL.setFont(new Font("Arial", Font.BOLD, 16));
		mobL.setForeground(Color.darkGray);
		backgroundImageL.add(mobL);
		
		mobTF = new JTextField();
		mobTF.setBounds(490,160,180,30);
		mobTF.setFont(new Font("Arial", Font.PLAIN, 16));
		mobTF.setForeground(Color.darkGray);
		backgroundImageL.add(mobTF);
		
		educationL = new JLabel("Education");
		educationL.setBounds(360,200,90,30);
		educationL.setFont(new Font("Arial", Font.BOLD, 16));
		educationL.setForeground(Color.darkGray);
		backgroundImageL.add(educationL);
		
		educationTF = new JTextField();
		educationTF.setBounds(490,200,180,30);
		educationTF.setFont(new Font("Arial", Font.PLAIN, 16));
		educationTF.setForeground(Color.darkGray);
		backgroundImageL.add(educationTF);
		
		aadharL = new JLabel("Aadhar No");
		aadharL.setBounds(360,240,90,30);
		aadharL.setFont(new Font("Arial", Font.BOLD, 16));
		aadharL.setForeground(Color.darkGray);
		backgroundImageL.add(aadharL);
		
		aadharTF = new JTextField();
		aadharTF.setBounds(490,240,180,30);
		aadharTF.setFont(new Font("Arial", Font.PLAIN, 16));
		aadharTF.setForeground(Color.darkGray);
		backgroundImageL.add(aadharTF);
		
		nationalityL = new JLabel("Nationality");
		nationalityL.setBounds(360,280,90,30);
		nationalityL.setFont(new Font("Arial", Font.BOLD, 16));
		nationalityL.setForeground(Color.darkGray);
		backgroundImageL.add(nationalityL);
		
		nationalityTF = new JTextField();
		nationalityTF.setBounds(490,280,180,30);
		nationalityTF.setFont(new Font("Arial", Font.PLAIN, 16));
		nationalityTF.setForeground(Color.darkGray);
		backgroundImageL.add(nationalityTF);

		submitB = new JButton("SUBMIT");
		submitB.setBounds(250,350,100,30);
		submitB.setFont(new Font("Arial", Font.BOLD,16));
		submitB.setForeground(Color.green);
		backgroundImageL.add(submitB);
		submitB.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent ae) {
				if(nameTF.getText().isEmpty()||ageTF.getText().isEmpty()||
					addressTF.getText().isEmpty()||emailTF.getText().isEmpty()||
					designationTF.getText().isEmpty()||idTF.getText().isEmpty()||
					fatherTF.getText().isEmpty()||dobTF.getText().isEmpty()||
					mobTF.getText().isEmpty()||educationTF.getText().isEmpty()||
					aadharTF.getText().isEmpty()||nationalityTF.getText().isEmpty()) {
					
					JOptionPane.showMessageDialog(null,"Fileds cannot be empty");
					
					
				}
				else {
					try {
						String name,address,email,designation,father,dob,mob,education,aadhar,nationality;
						int age,id;
						name= nameTF.getText();
						address= addressTF.getText();
						email= emailTF.getText();
						designation= designationTF.getText();
						father= fatherTF.getText();
						dob= dobTF.getText();
						mob= mobTF.getText();
						education= educationTF.getText();
						aadhar= aadharTF.getText();
						nationality= nationalityTF.getText();
						
						age=Integer.parseInt(ageTF.getText());
						id = Integer.parseInt(idTF.getText());
						
						DatabaseConnectivity connection = new DatabaseConnectivity();
						String query = "INSERT INTO employeedetails VALUES('"+name+"',"+age+",'"+address+"','"+email+
								"','"+designation+"',"+id+",'"+father+"','"+dob+"','"+mob+"','"+education+
								"','"+aadhar+"','"+nationality+"');";
						
						int result = connection.stmt.executeUpdate(query);
						String message = result + " Employee added Sucessfully";
						JOptionPane.showMessageDialog(null,message);
						frame.setVisible(false);
						new HomePage().frame.setVisible(true);
					}catch(Exception e) {
						e.printStackTrace();
					}
					
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
		
		new AddEmployee();
	}
}
