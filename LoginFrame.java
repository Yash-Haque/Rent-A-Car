import java.util.*;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;

public class LoginFrame extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Application Label
	JLabel appLabel = new JLabel("Rent And Run");
	
	//OR Design
	JLabel or = new JLabel("Haven't Singed In?");
	
	//Enter Username Label
	JLabel usernameLabel = new JLabel("Enter Username");
	
	//Text Field
	JTextField userTextField = new JTextField();
	
	//Enter Password Label
	JLabel passwordLabel = new JLabel("Enter Password");
	//Password Field
	JPasswordField userPassField = new JPasswordField();
	
	//CheckBox for Show Password
	JCheckBox showPass = new JCheckBox("Show Password");
	
	//Button for Login
	JButton loginButton = new JButton("Login");
	
	
	//Button for Registration
	JButton registrationButton = new JButton("Sign Up");
	
	
	//So in order to write content on top of the window i.e. the frame, we initialise a container.
			//All of the content work starting from background color to what features will be implemented
			//(that is added through components), everything is done in this container.
			
			//The advantage of using containers over panels is that when we close a container, all of the 
			// components inside the container will close at once. But, if it is a panel then all of the 
			// panels need to be closed separately (individually).
			
	Container container = getContentPane();
	
	LoginFrame(){
		
		this.setTitle("Rent And Run"); // sets title
		this.setBounds(500, 100, 400, 600); //setBounds (int XAxis, int YAxis, int width, int height) 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Closes the window when pressed x
		this.setResizable(false); // makes the window unable to resize
		
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\Project\\Car Rental\\src\\yash-01.png")); // sets image icon
		
		
		Initialise(); //Custom method to Initiate all of the design methods.
		//403740 For Circle
		// 69b04a For Car And Name
		
		
	}
	
	public void Initialise() {
		
		//Container Layout
		container.setLayout(null); //The Container has multiple inbuilt layout, setting the layout
		//to null means there will be no previously built layouts set on your container
		container.setBackground(Color.darkGray); //sets the Background Color of the container.
		//new Color(25, 20, 20)
		
		//Label Design
		appLabel.setBounds(92, 82, 192, 56); // Sets Location and Size of the Label.
		appLabel.setForeground(new Color(50, 205, 50)); //Sets Text Color.
		appLabel.setFont(new Font("Helvetica", Font.BOLD, 27)); // setFont(new Font("Text_Type", Text_Characteristic, Text_Size)
		appLabel.setHorizontalAlignment(SwingConstants.CENTER); //Sets Text Alignment
		container.add(appLabel); //Adds the Label Component to the OCntainer
		
		//Username Label
		usernameLabel.setBounds(42, 148, 312, 37);
		usernameLabel.setForeground(Color.white);
		usernameLabel.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(usernameLabel);
		
		//Text Field
		userTextField.setBounds(42, 185, 312, 37);
		userTextField.setForeground(Color.white);
		userTextField.setBackground(Color.gray);
		userTextField.setToolTipText("Tip: Try something unique!");
		userTextField.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(userTextField);
		
		//Password Label
		passwordLabel.setBounds(40, 221, 314, 37);
		passwordLabel.setForeground(Color.white);
		passwordLabel.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(passwordLabel);
		
		//Password Field
		userPassField.setBounds(40, 258, 314, 37);
		userPassField.setForeground(Color.white);
		userPassField.setBackground(Color.gray);
		userPassField.setToolTipText("Enter Password");
		userPassField.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(userPassField);
		
		//Show Password
		showPass.setBounds(360, 267, 20, 20);
		showPass.setForeground(Color.white);
		showPass.setBackground(Color.gray);
		showPass.setToolTipText("Show Password");
		container.add(showPass);
		showPass.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				userPassField.getPassword();
				userPassField.setEchoChar((char) 0);
//			else 
//				userPassField.setEchoChar((char) 1);

				//Couldn't Implement the turn off feature to Password Show.
			}
		});
		
		//Login Button
		loginButton.setBounds(145, 354, 97, 26);
		loginButton.setHorizontalTextPosition(SwingConstants.CENTER);
		loginButton.setVerticalTextPosition(SwingConstants.CENTER);
		loginButton.setBackground(new Color(50, 205, 50));
		loginButton.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(loginButton);
		loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			if(userTextField.getText().equals("admin") && userPassField.getText().equals("123")) {
				JOptionPane.showMessageDialog(null, "You Have Successfully logged in");
				dispose();
				CarFrame cF = new CarFrame();
				cF.setVisible(true);
				
				
			}
			else
				JOptionPane.showMessageDialog(null, "Invalid Username or Password. Please consider signing up.");

			}
		});
		
		//OR Design
		or.setForeground(Color.LIGHT_GRAY);
		or.setBounds(95, 400, 192, 56);
		or.setFont(new Font("Helvetica", Font.BOLD, 12));
		or.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(or);
		
		//SignUp-Registration Button
		registrationButton.setBounds(135, 490, 115, 29);
		registrationButton.setHorizontalTextPosition(SwingConstants.CENTER);
		registrationButton.setVerticalTextPosition(SwingConstants.CENTER);
		registrationButton.setBackground(new Color(50, 205, 50));
		registrationButton.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(registrationButton);
		registrationButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				SignUppFrame signUp = new SignUppFrame();
				signUp.setVisible(true);
				
			}
		});
	

//
//
//	}

}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
