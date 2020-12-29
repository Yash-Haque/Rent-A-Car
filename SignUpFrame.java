import java.util.*;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;

public class SignUpFrame extends JFrame implements ActionListener{
	
	//Window Label
	JLabel appLabel = new JLabel("Sign Up");
	
	//Tip
	JLabel tip = new JLabel("Please fill in this form to create an account.");
	
	JLabel fNLabel = new JLabel();
	
	JTextField firstName = new JTextField();
	
	JLabel lNLabel = new JLabel();
	
	JTextField lastName = new JTextField();
	
	JLabel emailLabel = new JLabel();
	
	JTextField email = new JTextField();
	
	JLabel passLabel = new JLabel();
	
	JPasswordField password = new JPasswordField();
	
	JLabel cPLabel = new JLabel();
	
	JPasswordField confirmPass = new JPasswordField();
	
	JLabel termsAndConditions = new JLabel();
	
	JCheckBox tcCheck = new JCheckBox();
	
	JButton next = new JButton();
	
	JLabel or = new JLabel();
	
	JButton back = new JButton();
	
	Container container = new Container();
	
	SignUpFrame(){
		
		this.setTitle("Rent And Run");
		this.setBounds(500, 100, 400, 600); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setResizable(false);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\\\Eclipse\\\\Project\\\\Car Rental"));
		
		Initialise();
	}

	
	public void Initialise() {
		
		//Container Layout + Background
		container.setLayout(null);
		container.setBackground(Color.DARK_GRAY);
		
//		//Label Design
//		appLabel.setBounds(5, 0, 300, 50); 
//		appLabel.setForeground(new Color(50, 205, 50)); 
//		appLabel.setFont(new Font("Helvetica", Font.BOLD, 27)); 
//		appLabel.setAlignmentX(TOP_ALIGNMENT); 
//		container.add(appLabel); 
//		
//		//Tip Design
//		tip.setBounds( 5, 138, 312, 37);
//		tip.setForeground(Color.WHITE);
//		tip.setFont(new Font("Helvetica", Font.PLAIN, 12));
//		container.add(tip);
//		
//		//First Name Label 
//		fNLabel.setBounds(42, 218, 312, 37);
//		fNLabel.setForeground(Color.white);
//		fNLabel.setFont(new Font("Helvetica", Font.PLAIN, 14));
//		container.add(fNLabel);
//		
//		//First Name Text Field
//		firstName.setBounds(42, 255, 312, 37);
//		firstName.setForeground(Color.white);
//		firstName.setBackground(Color.gray);
//		firstName.setFont(new Font("Helvetica", Font.PLAIN, 14));
//		container.add(firstName);
//		
//		// Last Name Label
//		lNLabel.setBounds(42, 292, 312, 37);
//		lNLabel.setForeground(Color.WHITE);
//		lNLabel.setFont(new Font("Helvetica", Font.PLAIN, 14));
//		
//		//Last Name Text Field
//		lastName.setBounds(42, 329, 312, 37);
//		lastName.setForeground(Color.white);
//		lastName.setBackground(Color.gray);
//		lastName.setFont(new Font("Helvetica", Font.PLAIN, 14));
//		
//		//Password Label
//		passLabel.setBounds(42, 366, 312, 37);
//		passLabel.setForeground(Color.WHITE);
//		passLabel.setFont(new Font("Helvetica", Font.PLAIN, 14));
//		
//		//Password Field
//		passLabel.setBounds(42, 403, 312, 37);
//		passLabel.setForeground(Color.WHITE);
//		passLabel.setBackground(Color.gray);
//		passLabel.setFont(new Font("Helvetica", Font.PLAIN, 14));
//		
//		//Confirm Password Label
//		cPLabel.setBounds(42, 440, 312, 37);
//		cPLabel.setForeground(Color.WHITE);
//		cPLabel.setFont(new Font("Helvetica", Font.PLAIN, 14));
//		
//		//Confirm Password Field
//		confirmPass.setBounds(42, 477, 312, 37);
//		confirmPass.setForeground(Color.WHITE);
//		confirmPass.setBackground(Color.gray);
//		confirmPass.setFont(new Font("Helvetica", Font.PLAIN, 14));
//		
//		//Terms and Condition Label
//		cPLabel.setBounds(42, 514, 312, 37);
//		cPLabel.setForeground(Color.WHITE);
//		cPLabel.setFont(new Font("Helvetica", Font.PLAIN, 14));
//		
//		//T&C Checkbox
//		tcCheck.setBounds(360, 312, 20, 20);
//		tcCheck.setForeground(Color.white);
//		tcCheck.setBackground(Color.gray);
//		tcCheck.setToolTipText("Show Password");
//		container.add(tcCheck);
//		
//		//Next Button
//		next.setBounds(145, 354, 97, 26);
//		next.setHorizontalTextPosition(SwingConstants.CENTER);
//		next.setVerticalTextPosition(SwingConstants.CENTER);
//		next.setBackground(new Color(50, 205, 50));
//		next.setFont(new Font("Helvetica", Font.PLAIN, 14));
//		container.add(next);
//		
//		//OR
//		or.setForeground(Color.LIGHT_GRAY);
//		or.setBounds(95, 400, 192, 56);
//		or.setFont(new Font("Helvetica", Font.BOLD, 12));
//		or.setHorizontalAlignment(SwingConstants.CENTER);
//		container.add(or);
//		
//		//Back Button
//		back.setBounds(135, 490, 115, 29);
//		back.setHorizontalTextPosition(SwingConstants.CENTER);
//		back.setVerticalTextPosition(SwingConstants.CENTER);
//		back.setBackground(new Color(50, 205, 50));
//		back.setFont(new Font("Helvetica", Font.PLAIN, 14));
//		container.add(back);
//		
	}

		
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
