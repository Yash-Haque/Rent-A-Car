import java.util.*;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;

public class CustomerrFrame extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String path = "Customer.txt";
	
	
	
	JLabel appLabel = new JLabel("Registration");

	//Window Tip
	JLabel tip = new JLabel("Just a little bit more...");
	JLabel tip1 = new JLabel("Please fill up this form to complete your Sign Up process.");
	
	JLabel line = new JLabel("____________________________________________________________");
	
//	//First Name
//	JLabel fN = new JLabel("First Name");
//	JTextField firstName = new JTextField();
//	
//	//Last Name
//	JLabel lN = new JLabel("Last Name");
//	JTextField lastName = new JTextField();
	
	//Gender
	JLabel gender = new JLabel("Gender");
	JComboBox genderBox;
	
	//Contact/ Phone Number
	JLabel contact = new JLabel("Phone Number");
	JTextField phnNumber = new JTextField();
	
	//Status
	JLabel status = new JLabel("Status");
	JComboBox statBox;
	
	//Address
	JLabel address = new JLabel("Address");
	JTextField addTxtField = new JTextField();

	JLabel birth = new JLabel("Date of Birth");
	
	//Birth Date
	JComboBox birthDate;
	
	//Birth Month
	JComboBox birthMonth;
	
	//Birth Year
	JComboBox birthYear;
	
	//Next Button
	JButton next = new JButton("Next");
	
	//Back
	JButton back = new JButton("Back");
	
	
	Container container = getContentPane();
	
	CustomerrFrame(){
		
		this.setTitle("Rent And Run");
		this.setBounds(500, 50, 400, 650); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setResizable(false);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\\\Eclipse\\\\Project\\\\Car Rental\\\\src\\\\e5b21f3d-b41d-4d88-a2cf-72739501c4c4_200x200(2).png"));
	
		initialise();
		addActionEvent();
	}
	
	public void initialise() {
		
		//Container Layout + Background
		container.setLayout(null);
		container.setBackground(Color.DARK_GRAY);
		
		//Label Design
		appLabel.setBounds(5, 0, 300, 50);
		appLabel.setForeground(new Color(50, 205, 50)); 
		appLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
		appLabel.setAlignmentX(TOP_ALIGNMENT); 
		container.add(appLabel);
		
		//Tip Design
		tip.setBounds( 5, 50, 312, 18);
		tip.setForeground(Color.WHITE);
		tip.setFont(new Font("Helvetica", Font.PLAIN, 12));
		container.add(tip);
		
		tip1.setBounds( 5, 69, 400, 18);
		tip1.setForeground(Color.WHITE);
		tip1.setFont(new Font("Helvetica", Font.PLAIN, 12));
		container.add(tip1);
		
		//Line
		line.setBounds(0, 75, 400, 19);
		line.setForeground(Color.WHITE);
		line.setFont(new Font("Helvetica", Font.PLAIN, 12));
		container.add(line);
		
		//Gender
		gender.setBounds(42, 100, 100, 37);
		gender.setForeground(Color.white);
		gender.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(gender);
		
		String[] genderr = {"M", "F"};
		genderBox = new JComboBox(genderr);
		genderBox.setBounds(42, 137, 100, 37);
		genderBox.setForeground(Color.white);
		genderBox.setBackground(Color.gray);
		genderBox.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(genderBox);
		
		//Status
		status.setBounds(42, 180, 250, 37);
		status.setForeground(Color.white);
		status.setBackground(Color.DARK_GRAY);
		status.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(status);
		
		String[] stat = {"S", "M"};
		statBox = new JComboBox(stat);
		statBox.setBounds(42, 217, 100, 37);
		statBox.setForeground(Color.white);
		statBox.setBackground(Color.gray);
		statBox.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(statBox);
		
		//Contact
		contact.setBounds(42, 254, 300, 37);
		contact.setForeground(Color.white);
		contact.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(contact);
		
		phnNumber.setBounds(42, 291, 300, 37);
		phnNumber.setForeground(Color.white);
		phnNumber.setBackground(Color.gray);
		phnNumber.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(phnNumber);
		String c = phnNumber.getText();
		
		//Address
		address.setBounds(42, 328, 300, 37);
		address.setForeground(Color.white);
		address.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(address);	
		
		addTxtField.setBounds(42, 365, 320, 37);
		addTxtField.setForeground(Color.white);
		addTxtField.setBackground(Color.gray);
		addTxtField.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(addTxtField);
		String add = addTxtField.getText();
		
		//DOB Label
		birth.setBounds(42, 402, 312, 37);
		birth.setForeground(Color.white);
		birth.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(birth);
		
		//Birth Date
		Integer[] date = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
		birthDate = new JComboBox(date);
		birthDate.setBounds(42, 439, 60, 25);
		birthDate.setForeground(Color.white);
		birthDate.setBackground(Color.gray);
		birthDate.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(birthDate);
		
		//Birth Month
		String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		birthMonth = new JComboBox(month);
		birthMonth.setBounds(112, 439, 60, 25);
		birthMonth.setForeground(Color.white);
		birthMonth.setBackground(Color.gray);
		birthMonth.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(birthMonth);
		
		//Birth Year
		Integer[] year = {1970, 1971, 1972, 1973, 1974, 1975, 1976, 1977, 1978, 1979, 1980,
				1981, 1982, 1983, 1984, 1985, 1986, 1987, 1988, 1989, 1990,
				1991, 1992, 1993, 1994, 1995, 1996, 1997, 1998, 1999, 2000,
				2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010,
				2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020};
		birthYear = new JComboBox(year);
		birthYear.setBounds(182, 439, 60, 25);
		birthYear.setForeground(Color.white);
		birthYear.setBackground(Color.gray);
		birthYear.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(birthYear);
		
		//Birthday Checker
		
		
		
		
		//Next Button
		next.setBounds(253, 550, 97, 26);
		next.setHorizontalTextPosition(SwingConstants.CENTER);
		next.setVerticalTextPosition(SwingConstants.CENTER);
		next.setAlignmentX(CENTER_ALIGNMENT);
		next.setBackground(new Color(50, 205, 50));
		next.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(next);

		
		//Back Button
		back.setBounds(40, 550, 97, 26);
		back.setHorizontalTextPosition(SwingConstants.CENTER);
		back.setVerticalTextPosition(SwingConstants.CENTER);
		back.setAlignmentX(CENTER_ALIGNMENT);
		back.setBackground(new Color(50, 205, 50));
		back.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(back);

	}
	
	public void addActionEvent() {
		genderBox.addActionListener(this);
		statBox.addActionListener(this);
		birthDate.addActionListener(this);
		birthMonth.addActionListener(this);
		birthYear.addActionListener(this);
		next.addActionListener(this);
		back.addActionListener(this);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == genderBox) {
			String g = (String)genderBox.getSelectedItem();
			
		}
		
		if(e.getSource() == statBox) {
			String s = (String)statBox.getSelectedItem();
			
		}
		
		if(e.getSource() == birthDate) {
			int bD = (int)birthDate.getSelectedItem();
			
		}
		
		if(e.getSource() == birthMonth) {
			String bM = (String)birthMonth.getSelectedItem();
			
		}
		
		if(e.getSource() == birthYear) {
			int bY = (int)birthYear.getSelectedItem();
			
		}
		
		if(e.getSource() == next) {
			try {
				
				SignUppFrame s = new SignUppFrame();
				String firstName, lastName, email, password, gender, status, location, contact;
				

				gender = (String)genderBox.getEditor().getItem();
				status = (String)statBox.getEditor().getItem();
				contact = phnNumber.getText();
				location = addTxtField.getText();
				
				FileWriter write = new FileWriter("CustomerInfo.txt",true);
				write.write(gender + " " + status + " " + contact + " " + location + "\n");
				write.close();
				
				
//				FileWriter write = new FileWriter(path, true);
//				write.write(genderBox.getEditor().getItem()+" "+(String)statBox.getEditor().getItem()+" "+phnNumber.getText()+" "+addTxtField.getText()+" "+(int)birthDate.getEditor().getItem()+" "+(String)birthMonth.getEditor().getItem()+" "+(int)birthYear.getEditor().getItem()+"\n");
//				write.close();
				JOptionPane.showMessageDialog(null, "Successfully Registered! Please Login to continue...","Confirmation", JOptionPane.WARNING_MESSAGE);
				dispose();
				LoginFrame c = new LoginFrame();
				c.setVisible(true);
				
			}
			catch (IOException ep) {
			      System.out.println("ERROR 404! File-Not-Found");
			      ep.printStackTrace();
			    }
			catch (ClassCastException ex) {
				System.out.println("ERROR 404! Please Sign-Up again using a new ID and password.");
			}
		}
		
		
		if(e.getSource() == back) {
			this.setVisible(false);
			SignUppFrame sF = new SignUppFrame();
			sF.setVisible(true);
		}
		
	}
	
	
	
	
	
}
