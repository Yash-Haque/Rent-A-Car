import java.util.*;
import javax.swing.*;

//import RentalView.finalStepButton;
//import RentalView.firstCarButton;
//import RentalView.forthCarButton;
//import RentalView.secondCarButton;
//import RentalView.thirdCarButton;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;

public class CarChoiceFrame extends JFrame implements ActionListener {

	JLabel appLabel = new JLabel("Choose a car from the following");
	
	JLabel line = new JLabel("____________________________________________________________");

	//Car 1
	ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\Project\\Car Rental\\src\\rsz_2018-toyota-corolla-axio-wxb-front-three-quarters.jpg"));
	JButton image = new JButton(img);
	
	//Car 2
	ImageIcon img1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\Project\\Car Rental\\src\\2017-toyota-prius-plus-natl-angular-front-exterior-view_100677201_l.jpg"));
	JButton image1 = new JButton(img1);
	
	//Car 3
	ImageIcon img2 = new ImageIcon(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\Project\\Car Rental\\src\\rsz_allion-main.jpg"));
	JButton image2 = new JButton(img2);
	
	//Car 4
	ImageIcon img3 = new ImageIcon(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\Project\\Car Rental\\src\\rsz_premio-main.jpg"));
	JButton image3 = new JButton(img3);
	
//	//Image 1
//	ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\Project\\Car Rental\\src\\rsz_2018-toyota-corolla-axio-wxb-front-three-quarters.jpg"));
//	JLabel image = new JLabel(img);
//	
//	JLabel line1 = new JLabel("____________________________________________________________");
//	
//	//Image 2
//	ImageIcon img1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\Project\\Car Rental\\src\\2017-toyota-prius-plus-natl-angular-front-exterior-view_100677201_l.jpg"));
//	JLabel image1 = new JLabel(img1);
//	
//	JLabel line2 = new JLabel("____________________________________________________________");
//	
//	//Image 3
//	ImageIcon img2 = new ImageIcon(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\Project\\Car Rental\\src\\rsz_allion-main.jpg"));
//	JLabel image2 = new JLabel(img2);	
//	
//	JLabel line3 = new JLabel("____________________________________________________________");
//	
//	//Image 4
//	ImageIcon img3 = new ImageIcon(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\Project\\Car Rental\\src\\rsz_premio-main.jpg"));
//	JLabel image3 = new JLabel(img3);	
	
	Container container = getContentPane();
	
	CarChoiceFrame(){
		
		this.setTitle("Rent And Run");
		this.setBounds(500, 50, 700, 650); 
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

		
		
		//-------------------------------------first car button

		image.setBackground(Color.black);
		//image.addActionListener(new firstCarButton());
//		image.setRolloverEnabled(true);
//		image.setRolloverIcon(img);
		image.setPressedIcon(img);
		image.setBounds(5, 74, img.getIconWidth(), img.getIconHeight());
		container.add(image);
	
	//---------------------------------second car button

		image1.setBackground(Color.black);
		//image1.addActionListener(new secondCarButton());
//		image1.setRolloverEnabled(true);
//		image1.setRolloverIcon(img1);
		image1.setPressedIcon(img1);
		image1.setBounds(5, 200, img1.getIconWidth(), img1.getIconHeight());
		container.add(image1);
		
	//---------------------------------------third car button

		image2.setBackground(Color.black);
		//image2.addActionListener(new thirdCarButton());
//		image2.setRolloverEnabled(true);
//		image2.setRolloverIcon(img2);
		image2.setPressedIcon(img2);
		image2.setBounds(5, 326, img2.getIconWidth(), img2.getIconHeight());
		container.add(image2);
	
	//------------------------------------------forth car button

		image3.setBackground(Color.black);
		//image3.addActionListener(new forthCarButton());
//		image3.setRolloverEnabled(true);
//		image3.setRolloverIcon(img3);
		image3.setPressedIcon(img3);
		image3.setBounds(5, 452, img3.getIconWidth(), img3.getIconHeight());
		container.add(image3);
		
	//-------------------------------------------------to go receipt section (Final step)
//  	ImageIcon carNextImage = new ImageIcon("../images/submit.GIF");
//		carNextB = new JButton(carNextImage);
//		carNextB.setBackground(Color.WHITE);
//		carNextB.setBounds(460, 300, 100, 50);
//		//carNextB.addActionListener(new finalStepButton());
//		carNextB.setRolloverEnabled(true);
//		carNextB.setRolloverIcon(carNextImage);
//		carNextB.setPressedIcon(carNextImage);
//		carP.add(carNextB);
		
		//-----------------------------------TEXT AREA for pick a car putting details for car when we click buttons over top
		JTextArea carDetailsTA = new JTextArea(6, 25);
		carDetailsTA.setText("toyota | 2009 | pick-up | 250\nhonda | 2541 | pick-up | 900");
		carDetailsTA.setAutoscrolls(true);
		carDetailsTA.setEditable(false);
		carDetailsTA.setBounds(420, 40, 150, 240);
		container.add(carDetailsTA);
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
