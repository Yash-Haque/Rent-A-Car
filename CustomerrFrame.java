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

	JLabel appLabel = new JLabel("Registration");

	//Window Tip
	JLabel tip = new JLabel("Just a little bit more...");
	JLabel tip1 = new JLabel("Please fill up this form to complete your SIgn Up process.");
	
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
	JComboBox genderBox = new JComboBox();
	
	//Contact/ Phone Number
	JLabel contact = new JLabel("Phone Number");
	JTextField phnNumber = new JTextField();
	
	//Status
	JLabel status = new JLabel("Status");
	JComboBox statBox = new JComboBox();
	
	//Address
	JLabel address = new JLabel("Address");
	JTextField addTxtField = new JTextField();

	//Next Button
	JButton next = new JButton("Next");
	
	//Or	
	JLabel or = new JLabel("OR");
	
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
		
		genderBox.setBounds(42, 137, 100, 37);
		genderBox.setForeground(Color.white);
		genderBox.setBackground(Color.gray);
		genderBox.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(genderBox);
		
		genderBox.addItem(new ComboItem("Male", "Value 1"));
		genderBox.addItem(new ComboItem("Female", "Value 2"));
		genderBox.addItem(new ComboItem("Transgender", "Value 3"));
		genderBox.addItem(new ComboItem("Other", "Value 4"));

		//Status
		status.setBounds(42, 180, 250, 37);
		status.setForeground(Color.white);
		status.setBackground(Color.DARK_GRAY);
		status.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(status);
		
		statBox.setBounds(42, 217, 100, 37);
		statBox.setForeground(Color.white);
		statBox.setBackground(Color.gray);
		statBox.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(statBox);
		
		statBox.addItem(new ComboItem("Single", "Value 1"));
		statBox.addItem(new ComboItem("Married", "Value 2"));
		statBox.addItem(new ComboItem("Other", "Value 3"));
		
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
		
		//Next Button
		next.setBounds(145, 439, 97, 26);
		next.setHorizontalTextPosition(SwingConstants.CENTER);
		next.setVerticalTextPosition(SwingConstants.CENTER);
		next.setBackground(new Color(50, 205, 50));
		next.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(next);
		
		//Or
		or.setBounds(95, 476, 192, 56);
		or.setForeground(Color.LIGHT_GRAY);
		or.setFont(new Font("Helvetica", Font.BOLD, 12));
		or.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(or);
		
		//Back Button
		back.setBounds(135, 550, 115, 29);
		back.setHorizontalTextPosition(SwingConstants.CENTER);
		back.setVerticalTextPosition(SwingConstants.CENTER);
		back.setBackground(new Color(50, 205, 50));
		back.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(back);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}

class ComboItem1
{
    private String key;
    private String value;

    public ComboItem1(String key, String value)
    {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString()
    {
       
    	return key;
    }

    public String getKey()
    {
       
    	return key;
    }

    public String getValue()
    {
        
    	return value;
    }
    
    //For when you get the item
    //Object item = comboBox.getSelectedItem();
    //String value = ((ComboItem1)item).getValue();
}