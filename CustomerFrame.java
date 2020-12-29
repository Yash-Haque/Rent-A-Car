import java.util.*;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;

public class CustomerFrame extends JFrame implements ActionListener{
	
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
	
	Container container = new Container();
	
	CustomerFrame(){
		
		this.setTitle("Rent And Run");
		this.setBounds(500, 25, 400, 750); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setResizable(false);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\\\Eclipse\\\\Project\\\\Car Rental"));
		
		Initialise();
	}
	
	public void Initialise() {
		
		//Container Layout + Background
		container.setLayout(null);
		container.setBackground(Color.DARK_GRAY);
		
		//Label Design
		appLabel.setBounds(5, 0, 300, 50); 
		appLabel.setForeground(new Color(50, 205, 50)); 
		appLabel.setFont(new Font("Helvetica", Font.BOLD, 27)); 
		appLabel.setAlignmentX(TOP_ALIGNMENT); 
		container.add(appLabel); 
		
		//Tip Design
		tip.setBounds( 5, 138, 312, 37);
		tip.setForeground(Color.WHITE);
		tip.setFont(new Font("Helvetica", Font.PLAIN, 12));
		container.add(tip);
		
		//First Name Label 
		fNLabel.setBounds(5, 218, 312, 37);
		fNLabel.setForeground(Color.white);
		fNLabel.setFont(new Font("Helvetica", Font.PLAIN, 14));
		
		//First Name Text Field
		// Last Name Labe
		//Last Name Text Field
		//Password Label
		//Password Field
		//Confirm Password Label
		//Confirm Password Field
		
		//Terms and Condition Label
		
		
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
