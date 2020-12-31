import java.util.*;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;

public class CarChoiceFrame extends JFrame implements ActionListener {

	JLabel appLabel = new JLabel("Choose a car from the following");
	
	JLabel line = new JLabel("____________________________________________________________");
	
	//Image 1
	ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\Project\\Car Rental\\src\\2018-Toyota-Corolla-Axio-WxB-front-three-quarters.jpg"));
	JLabel image = new JLabel(img);
	
	Container container = getContentPane();
	
	CarChoiceFrame(){
		
		this.setTitle("Rent And Run");
		this.setBounds(500, 50, 700, 650); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setResizable(true);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\\\Eclipse\\\\Project\\\\Car Rental\\\\src\\\\e5b21f3d-b41d-4d88-a2cf-72739501c4c4_200x200(2).png"));
	
		initialise();
	}
	
	public void initialise() {
		
		//Container Layout + Background
		container.setLayout(null);
		container.setBackground(Color.DARK_GRAY);
		
		//Label Design
		appLabel.setBounds(5, 0, 300, 37);
		appLabel.setForeground(new Color(50, 205, 17)); 
		appLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
		appLabel.setAlignmentX(TOP_ALIGNMENT); 
		container.add(appLabel);
		
		//Line
		line.setBounds(0, 37, 700, 19);
		line.setForeground(Color.WHITE);
		line.setFont(new Font("Helvetica", Font.PLAIN, 12));
		container.add(line);
		
		//Image 1
		image.setBounds(5, 56, img.getIconWidth(), img.SCALE_DEFAULT);
		image.setSize(128, 90);
		container.add(image);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
