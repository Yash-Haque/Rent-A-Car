import java.util.*;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;


public class SignUppFrame extends JFrame implements ActionListener{
	
	String path = "User.txt";
	
	private static final long serialVersionUID = 1L;

	//Application Label
	JLabel appLabel = new JLabel("Sign Up");
	
	//Tip
	JLabel tip = new JLabel("Please fill in this form to create an account.");
	
	JLabel line = new JLabel("___________________________________________________________________");
	
	//First Name
	JLabel fNLabel = new JLabel("First Name");
	JTextField firstName = new JTextField();
	
	//Last Name
	JLabel lNLabel = new JLabel("Last Name");
	JTextField lastName = new JTextField();
	
	//Username
	JLabel user = new JLabel("Username");
	JTextField userTxtField = new JTextField();
	
	//Email
	JLabel emailLabel = new JLabel("Email");
	JTextField email = new JTextField();
	
	//Password
	JLabel passLabel = new JLabel("Password");
	JPasswordField password = new JPasswordField();
	
	//Show Password
	JCheckBox checkBox = new JCheckBox();
	
	//Confirm Password
	JLabel cPLabel = new JLabel("Confirm Password");
	JPasswordField confirmPass = new JPasswordField();
	
	//T&C
	JLabel termsAndConditions = new JLabel("I accept the Terms of Use and Privacy Policy.");
	JCheckBox tcCheck = new JCheckBox();
	
	//Next Button
	JButton next = new JButton("Next");
	
	//Back Button
	JButton back = new JButton("Back");
	
	Container container = getContentPane();
	
	SignUppFrame(){
	

		
		this.setTitle("Rent And Run");
		this.setBounds(500, 50, 400, 700); 
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
		
		//Line
		line.setBounds(0, 68, 400, 19);
		line.setForeground(Color.WHITE);
		line.setFont(new Font("Helvetica", Font.PLAIN, 12));
		container.add(line);
		
		//First Name
		fNLabel.setBounds(52, 100, 195, 37);
		fNLabel.setForeground(Color.white);
		fNLabel.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(fNLabel);
		
		firstName.setBounds(5, 137, 180, 37);
		firstName.setForeground(Color.white);
		firstName.setBackground(Color.gray);
		firstName.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(firstName);
		String fN = firstName.getText();
		
		//Last Name
		lNLabel.setBounds(260, 100, 180, 37);
		lNLabel.setForeground(Color.WHITE);
		lNLabel.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(lNLabel);
	
		lastName.setBounds(200, 137, 180, 37);
		lastName.setForeground(Color.white);
		lastName.setBackground(Color.gray);
		lastName.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(lastName);
		String lN = lastName.getText();
		
//		//Username
//		user.setBounds(42, 174, 180, 37);
//		user.setForeground(Color.WHITE);
//		user.setFont(new Font("Helvetica", Font.PLAIN, 14));
//		container.add(user);
//		
//		userTxtField.setBounds(42, 211, 300, 37);
//		userTxtField.setToolTipText("Try something unique.");
//		userTxtField.setForeground(Color.white);
//		userTxtField.setBackground(Color.gray);
//		userTxtField.setFont(new Font("Helvetica", Font.PLAIN, 14));
//		container.add(userTxtField);
//		String usrTxtField = userTxtField.getText();
		
		//Email
		emailLabel.setBounds(42, 248, 180, 37);
		emailLabel.setForeground(Color.WHITE);
		emailLabel.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(emailLabel);
		
		email.setBounds(42, 285, 300, 37);
		email.setForeground(Color.white);
		email.setBackground(Color.gray);
		email.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(email);
		String emaill = email.getText();
//		email.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				if(email.getText().contains("@") == false || email.getText().contains(".") == false)
//					JOptionPane.showMessageDialog(null, "Invalid Email");
//			}
//		});
//		
		//Password
		passLabel.setBounds(42, 322, 312, 37);
		passLabel.setForeground(Color.WHITE);
		passLabel.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(passLabel);
		
		password.setBounds(42, 359, 250, 37);
		password.setForeground(Color.WHITE);
		password.setBackground(Color.gray);
		password.setToolTipText(" Try using numbers and characters.");
		password.setToolTipText("Password should be atleast 8 characters long.");
		password.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(password);

		
		//Show Password
		checkBox.setBounds(300, 365, 20, 20);
		checkBox.setForeground(Color.white);
		checkBox.setBackground(Color.gray);
		checkBox.setToolTipText("Show Password");
		container.add(checkBox);
		
		//Confirm Password 
		cPLabel.setBounds(42, 396, 312, 37);
		cPLabel.setForeground(Color.WHITE);
		cPLabel.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(cPLabel);
		
		confirmPass.setBounds(42, 433, 250, 37);
		confirmPass.setForeground(Color.WHITE);
		confirmPass.setBackground(Color.gray);
		confirmPass.setToolTipText(" Rewrite the same password again to verify.");
		confirmPass.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(confirmPass);

		confirmPass.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if(Arrays.equals(password.getPassword(), confirmPass.getPassword())) {
					//File IO
			}
				else {
					
					JOptionPane.showMessageDialog(null, "The password and Confirm Password does not match");
				}
				}
		});
		
		//T&C
		termsAndConditions.setBounds(45, 485, 312, 37);
		termsAndConditions.setForeground(Color.WHITE);
		termsAndConditions.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(termsAndConditions);

		tcCheck.setBounds(20, 485, 20, 37);
		tcCheck.setForeground(Color.white);
		tcCheck.setBackground(Color.DARK_GRAY);
		tcCheck.setToolTipText("Show Password");
		container.add(tcCheck);
		
		//Next Button
		next.setBounds(253, 550, 97, 26);
		next.setHorizontalTextPosition(SwingConstants.CENTER);
		next.setVerticalTextPosition(SwingConstants.CENTER);
		next.setAlignmentX(CENTER_ALIGNMENT);
		next.setBackground(new Color(50, 205, 50));
		next.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(next);
		
//		next.addActionListener(new ActionListener() {
//			
//			public void actionPerformed(ActionEvent e) {
//				if(firstName.getText().contains("") || lastName.getText().contains("") || email.getText().contains("")) {
//					if((password.getPassword().length == 0) || (confirmPass.getPassword().length == 0))
//						JOptionPane.showMessageDialog(null, "Please fill in all of the blank spaces.");
//				}
//				else {
//					dispose();
//					CustomerrFrame cF = new CustomerrFrame();
//					cF.setVisible(true);
//				}
//			}
//		});
		
		
		
		
		//Back Button
		back.setBounds(40, 550, 97, 26);
		back.setHorizontalTextPosition(SwingConstants.CENTER);
		back.setVerticalTextPosition(SwingConstants.CENTER);
		back.setAlignmentX(CENTER_ALIGNMENT);
		back.setBackground(new Color(50, 205, 50));
		back.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(back);
//	back.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				LoginFrame lF = new LoginFrame();
//				lF.setVisible(true);
//				
//				
//			}
//			else
//				JOptionPane.showMessageDialog(null, "Invalid Username or Password. Please consider signing up.");
//			
//		});
//	

	}
	
	
	public void addActionEvent() {
		next.addActionListener(this);
		back.addActionListener(this);
		checkBox.addActionListener(this);
		tcCheck.addActionListener(this);
	}
	
	public boolean check(String email)
	{
		String line;
		try {
			FileReader fr = new FileReader(path);
	        BufferedReader br = new BufferedReader(fr);
	        
	        while ((line = br.readLine()) != null)
	        {
	        	if(email.split("@")[0].equalsIgnoreCase(line.split(" ")[2].split("@")[0]))
	        	{
	        		return true;
	        	}
	        }
		}
		catch (Exception ep) {
			System.out.println("ERROR 404! File-Not-Found");
            //ep.printStackTrace();
        }
		return false;
	}
	
//	public boolean userCheck(String username)
//	{
//		String line;
//		try {
//			FileReader fr = new FileReader(path);
//	        BufferedReader br = new BufferedReader(fr);
//	        
//	        while ((line = br.readLine()) != null)
//	        {
//	        	if(username.equalsIgnoreCase(line))
//	        	{
//	        		return true;
//	        	}
//	        }
//		}
//		catch (Exception ep) {
//			System.out.println("ERROR 404! File-Not-Found");
//            //ep.printStackTrace();
//        }
//		return false;
//	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		if(e.getSource() == next) {
//			if(fN.contains("") || lastName.getText().contains("") || email.getText().contains("")) {
//				JOptionPane.showMessageDialog(null, "Please fill in all of the blank spaces.");
//			}
//			else {
//				dispose();
//				CustomerrFrame customer = new CustomerrFrame();
//				customer.setVisible(true);
//			this.setVisible(false);
//			CustomerrFrame cF = new CustomerrFrame();
//			cF.setVisible(true);
//		}
		
		if(e.getSource() == back) {
			this.setVisible(false);
			LoginFrame lF = new LoginFrame();
			lF.setVisible(true);
		}
		
		if(e.getSource() == checkBox) {
			if(checkBox.isSelected())
				password.setEchoChar((char)0);
			else
				password.setEchoChar((char) 8226); 
		}
		
		if(e.getSource() == tcCheck) {
			if(!(tcCheck.isSelected())) {
				JOptionPane.showMessageDialog(null, "Please check out the Terms and Conditions.");
			}
		}
		
		if (e.getSource() == next) 
		{
			try
			{
				//Checks Email
			      if(!check(email.getText())) //Checking ID textField
			      {
			    	  
			    	  FileWriter myWriter = new FileWriter(path,true);
			    	  myWriter.write(firstName.getText()+" "+lastName.getText()+" "+email.getText()+" "+password.getText()+"\n");
				      myWriter.close();
			    	  
			    	  
//			    	  FileWriter write = new FileWriter(path,true);
//			    	  write.write(firstName.getText() + " " + lastName.getText() + " " + email.getText() + " " + password.getText() + " " );
			    	  
				      JOptionPane.showMessageDialog(null, "You Have Successfully Registered your Name and ID, please press ok to Continue","Confirmation", JOptionPane.WARNING_MESSAGE);
				      CustomerrFrame c = new CustomerrFrame();
				      this.setVisible(false);
				      c.setVisible(true);
			      }
			      else
			      {
			    	  JOptionPane.showMessageDialog(null, "Username already in use!","Confirmation", JOptionPane.WARNING_MESSAGE);
			      }
			 }
			catch (IOException ep) {
			      System.out.println("ERROR 404! File-Not-Found");
			      ep.printStackTrace();
			    }
		}
		
		
	}
	
	
}
