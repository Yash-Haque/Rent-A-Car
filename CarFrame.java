import java.util.*;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;

public class CarFrame extends JFrame implements ActionListener{
	
	//Window Label
	JLabel appLabel = new JLabel("Car Selection");
	
	//Tips
	JLabel tip = new JLabel("Please type the Model of car below");
	
	//cM Box
	//JTextField cmbox = new JTextField();
	JComboBox cmbox = new JComboBox();
	
	
	Container container = getContentPane();
	
	CarFrame(){
		
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
		
		//Label Design
		appLabel.setBounds(5, 0, 300, 50);
		appLabel.setForeground(new Color(50, 205, 50)); 
		appLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
		appLabel.setAlignmentX(TOP_ALIGNMENT); 
		container.add(appLabel);
		
		
		//Tip Label Design
		tip.setBounds( 5, 30, 312, 37);
		tip.setForeground(Color.WHITE);
		tip.setFont(new Font("Helvetica", Font.PLAIN, 12));
		container.add(tip);
		
		
		//cM Box
		cmbox.setBounds(42, 185, 312, 37);
		cmbox.setForeground(Color.white);
		cmbox.setBackground(Color.gray);
		cmbox.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(cmbox);
		
		cmbox.addItem(new ComboItem("Four-Seater Sedan", "Value 1"));
		cmbox.addItem(new ComboItem("Four-Seater Luxury Sedan", "Value 2"));
		cmbox.addItem(new ComboItem("Seven-Seater Microbus", "Value 3"));
		cmbox.addItem(new ComboItem("Eleven-Seater Microbus", "Value 4"));
		cmbox.addItem(new ComboItem("Pick-Up Truck", "Value 5"));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

class ComboItem
{
    private String key;
    private String value;

    public ComboItem(String key, String value)
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
    //String value = ((ComboItem)item).getValue();
}
