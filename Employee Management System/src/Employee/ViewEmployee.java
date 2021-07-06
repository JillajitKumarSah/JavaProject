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
import javax.swing.JTextField;


public class ViewEmployee {

	
	JFrame frame;
	JLabel backgroundImageL,searchL,nameL,ageL,addressL,emailL,designationL, idL,fatherL,
			dobL,mobL,educationL,aadharL,nationalityL,nameOUL,ageOUL,addressOUL,emailOUL,designationOUL,
			idOUL,fatherOUL,dobOUL,mobOUL,educationOUL,aadharOUL,nationalityOUL;
	JTextField searchTF;
	JButton iconB, printB,cancelB;
	String name,address,email,designation,father,dob,mob,education,aadhar,nationality,age1,id1;
	int age,id,flag=0;
	
	ViewEmployee(){
		frame = new JFrame("Employee Management System>>Login>>Home>>View Employee");
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
						int userInput = Integer.parseInt(searchTF.getText());
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
							nameOUL.setText(name);
							age1=Integer.toString(age);
							ageOUL.setText(age1);
							addressOUL.setText(address);
							emailOUL.setText(email);
							designationOUL.setText(designation);
							id1=Integer.toString(id);
							idOUL.setText(id1);
							fatherOUL.setText(father);
							dobOUL.setText(dob);
							mobOUL.setText(mob);
							educationOUL.setText(education);
							aadharOUL.setText(aadhar);
							nationalityOUL.setText(nationality);
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
		
		nameOUL = new JLabel();
		nameOUL.setBounds(160,80,180,30);
		nameOUL.setFont(new Font("Arial", Font.PLAIN, 16));
		nameOUL.setForeground(Color.BLACK);
		backgroundImageL.add(nameOUL);
		
		ageL = new JLabel("Age");
		ageL.setBounds(50,120,90,30);
		ageL.setFont(new Font("Arial", Font.BOLD, 16));
		ageL.setForeground(Color.BLACK);
		backgroundImageL.add(ageL);
		
		ageOUL = new JLabel();
		ageOUL.setBounds(160,120,180,30);
		ageOUL.setFont(new Font("Arial", Font.PLAIN, 16));
		ageOUL.setForeground(Color.BLACK);
		backgroundImageL.add(ageOUL);
		
		addressL = new JLabel("Address");
		addressL.setBounds(50,160,90,30);
		addressL.setFont(new Font("Arial", Font.BOLD, 16));
		addressL.setForeground(Color.BLACK);
		backgroundImageL.add(addressL);
		
		addressOUL = new JLabel();
		addressOUL.setBounds(160,160,180,30);
		addressOUL.setFont(new Font("Arial", Font.PLAIN, 16));
		addressOUL.setForeground(Color.BLACK);
		backgroundImageL.add(addressOUL);
		
		emailL = new JLabel("Email");
		emailL.setBounds(50,200,90,30);
		emailL.setFont(new Font("Arial", Font.BOLD, 16));
		emailL.setForeground(Color.BLACK);
		backgroundImageL.add(emailL);
		
		emailOUL = new JLabel();
		emailOUL.setBounds(160,200,180,30);
		emailOUL.setFont(new Font("Arial", Font.PLAIN, 16));
		emailOUL.setForeground(Color.BLACK);
		backgroundImageL.add(emailOUL);
		
		designationL = new JLabel("Designation");
		designationL.setBounds(50,240,90,30);
		designationL.setFont(new Font("Arial", Font.BOLD, 16));
		designationL.setForeground(Color.BLACK);
		backgroundImageL.add(designationL);
		
		designationOUL = new JLabel();
		designationOUL.setBounds(160,240,180,30);
		designationOUL.setFont(new Font("Arial", Font.PLAIN, 16));
		designationOUL.setForeground(Color.BLACK);
		backgroundImageL.add(designationOUL);
		
		idL = new JLabel("ID");
		idL.setBounds(50,280,90,30);
		idL.setFont(new Font("Arial", Font.BOLD, 16));
		idL.setForeground(Color.BLACK);
		backgroundImageL.add(idL);
		
		idOUL = new JLabel();
		idOUL.setBounds(160,280,180,30);
		idOUL.setFont(new Font("Arial", Font.PLAIN, 16));
		idOUL.setForeground(Color.BLACK);
		backgroundImageL.add(idOUL);
		
		fatherL = new JLabel("Father's Name");
		fatherL.setBounds(360,80,110,30);
		fatherL.setFont(new Font("Arial", Font.BOLD, 16));
		fatherL.setForeground(Color.BLACK);
		backgroundImageL.add(fatherL);
		
		fatherOUL = new JLabel();
		fatherOUL.setBounds(490,80,180,30);
		fatherOUL.setFont(new Font("Arial", Font.PLAIN, 16));
		fatherOUL.setForeground(Color.BLACK);
		backgroundImageL.add(fatherOUL);
		
		dobL = new JLabel("DOB");
		dobL.setBounds(360,120,90,30);
		dobL.setFont(new Font("Arial", Font.BOLD, 16));
		dobL.setForeground(Color.BLACK);
		backgroundImageL.add(dobL);
		
		dobOUL = new JLabel();
		dobOUL.setBounds(490,120,180,30);
		dobOUL.setFont(new Font("Arial", Font.PLAIN, 16));
		dobOUL.setForeground(Color.BLACK);
		backgroundImageL.add(dobOUL);
		
		mobL = new JLabel("Mobile No");
		mobL.setBounds(360,160,90,30);
		mobL.setFont(new Font("Arial", Font.BOLD, 16));
		mobL.setForeground(Color.BLACK);
		backgroundImageL.add(mobL);
		
		mobOUL = new JLabel();
		mobOUL.setBounds(490,160,180,30);
		mobOUL.setFont(new Font("Arial", Font.PLAIN, 16));
		mobOUL.setForeground(Color.BLACK);
		backgroundImageL.add(mobOUL);
		
		educationL = new JLabel("Education");
		educationL.setBounds(360,200,90,30);
		educationL.setFont(new Font("Arial", Font.BOLD, 16));
		educationL.setForeground(Color.BLACK);
		backgroundImageL.add(educationL);
		
		educationOUL = new JLabel();
		educationOUL.setBounds(490,200,180,30);
		educationOUL.setFont(new Font("Arial", Font.PLAIN, 16));
		educationOUL.setForeground(Color.BLACK);
		backgroundImageL.add(educationOUL);
		
		aadharL = new JLabel("Aadhar No");
		aadharL.setBounds(360,240,90,30);
		aadharL.setFont(new Font("Arial", Font.BOLD, 16));
		aadharL.setForeground(Color.BLACK);
		backgroundImageL.add(aadharL);
		
		aadharOUL = new JLabel();
		aadharOUL.setBounds(490,240,180,30);
		aadharOUL.setFont(new Font("Arial", Font.PLAIN, 16));
		aadharOUL.setForeground(Color.BLACK);
		backgroundImageL.add(aadharOUL);
		
		nationalityL = new JLabel("Nationality");
		nationalityL.setBounds(360,280,90,30);
		nationalityL.setFont(new Font("Arial", Font.BOLD, 16));
		nationalityL.setForeground(Color.BLACK);
		backgroundImageL.add(nationalityL);
		
		nationalityOUL = new JLabel();
		nationalityOUL.setBounds(490,280,180,30);
		nationalityOUL.setFont(new Font("Arial", Font.PLAIN, 16));
		nationalityOUL.setForeground(Color.BLACK);
		backgroundImageL.add(nationalityOUL);
		
		printB = new JButton("Print");
		printB.setBounds(250,350,100,30);
		printB.setFont(new Font("Arial", Font.BOLD,16));
		printB.setForeground(Color.green);
		backgroundImageL.add(printB);
		printB.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent ae) {
				
				try {/*
			
					PrinterJob job = PrinterJob.getPrinterJob();
					 private static void printWithPaper(PDDocument document)
						      throws IOException, PrinterException
						  {
						    PrinterJob job = PrinterJob.getPrinterJob();
						    job.setPageable(new PDFPageable(document));

						    // define custom paper
						    Paper paper = new Paper();
						    paper.setSize(306, 396); // 1/72 inch
						    paper.setImageableArea(0, 0, paper.getWidth(), paper.getHeight()); // no margins

						    // custom page format
						    PageFormat pageFormat = new PageFormat();
						    pageFormat.setPaper(paper);
						    
						    // override the page format
						    Book book = new Book();
						    // append all pages
						    book.append(new PDFPrintable(document), pageFormat, document.getNumberOfPages());
						    job.setPageable(book);
						    
						    job.print();
						  }
						}*/
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
	/*
	private static void printWithPaper(PlainDocument document)
		      throws IOException, PrinterException
		  {
		    PrinterJob job = PrinterJob.getPrinterJob();
		    job.setPageable(new Pageable(document));

		    // define custom paper
		    Paper paper = new Paper();
		    paper.setSize(306, 396); // 1/72 inch
		    paper.setImageableArea(0, 0, paper.getWidth(), paper.getHeight()); // no margins

		    // custom page format
		    PageFormat pageFormat = new PageFormat();
		    pageFormat.setPaper(paper);
		    
		    // override the page format
		    Book book = new Book();
		    // append all pages
		    book.append(new Printable(document), pageFormat, document.getNumberOfPages());
		    job.setPageable(book);
		    
		    job.print();
		  }
		}
	*/
	
	public static void main(String[] arg) {
		
		new ViewEmployee();
	}
}
