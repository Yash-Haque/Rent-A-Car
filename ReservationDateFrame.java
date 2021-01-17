import java.util.*;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;

public class ReservationDateFrame extends JFrame implements ActionListener, Serializable{

	static final long serialVersionUID = 123457L;
	
	JLabel appLabel = new JLabel("Pick a Date For Reservation");
	
	JLabel line = new JLabel("____________________________________________________________");

	JLabel pickUp = new JLabel("Pick-Up Date");
	
	JLabel returnD = new JLabel("Return Date");
	
	//Pick-Up Date
	JComboBox pickUpDate;
	
	//Pick-Up Month
	JComboBox pickUpMonth;
	
	//Pick-Up Year
	JComboBox pickUpYear;
	
	//Return Date
	JComboBox returnDate;
	
	//Return Month
	JComboBox returnMonth;
	
	//Return Year
	JComboBox returnYear;
	
	//Next Button
	JButton next = new JButton("Next");
	
	//Go Back Button
	JButton back = new JButton("Back");
	
	Container container = getContentPane();
	
	public ReservationDateFrame() {
		
		this.setTitle("Rent And Run");
		this.setBounds(500, 100, 400, 600); 
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
	
	//Pick-Up Label
	pickUp.setBounds(80, 148, 312, 37);
	pickUp.setForeground(Color.white);
	pickUp.setFont(new Font("Helvetica", Font.PLAIN, 14));
	container.add(pickUp);
	
	//Pick-Up Date
	Integer[] pUD= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
	pickUpDate = new JComboBox(pUD);
	pickUpDate.setBounds(80, 185, 60, 25);
	pickUpDate.setForeground(Color.white);
	pickUpDate.setBackground(Color.gray);
	pickUpDate.setFont(new Font("Helvetica", Font.PLAIN, 14));
	container.add(pickUpDate);
	
	//Pick-Up Month
	String[] pUM = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	pickUpMonth = new JComboBox(pUM);
	pickUpMonth.setBounds(150, 185, 60, 25);
	pickUpMonth.setForeground(Color.white);
	pickUpMonth.setBackground(Color.gray);
	pickUpMonth.setFont(new Font("Helvetica", Font.PLAIN, 14));
	container.add(pickUpMonth);
	
	//Pick-Up Year
	Integer[] pUY = {2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020};
	pickUpYear = new JComboBox(pUY);
	pickUpYear.setBounds(220, 185, 60, 25);
	pickUpYear.setForeground(Color.white);
	pickUpYear.setBackground(Color.gray);
	pickUpYear.setFont(new Font("Helvetica", Font.PLAIN, 14));
	container.add(pickUpYear);
	
	//Return Date Label
	returnD.setBounds(80, 235, 312, 37);
	returnD.setForeground(Color.white);
	returnD.setFont(new Font("Helvetica", Font.PLAIN, 14));
	container.add(returnD);
	
	//Return Date
	Integer[] rD = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
	returnDate = new JComboBox(rD);
	returnDate.setBounds(80, 272, 60, 25);
	returnDate.setForeground(Color.white);
	returnDate.setBackground(Color.gray);
	returnDate.setFont(new Font("Helvetica", Font.PLAIN, 14));
	container.add(returnDate);
	
	//Return Month
	String[] rM = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	returnMonth = new JComboBox(rM);
	returnMonth.setBounds(150, 272, 60, 25);
	returnMonth.setForeground(Color.white);
	returnMonth.setBackground(Color.gray);
	returnMonth.setFont(new Font("Helvetica", Font.PLAIN, 14));
	container.add(returnMonth);
	
	//Return Year
	Integer[] rY = {2020, 2021, 2022, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2030};
	returnYear = new JComboBox(rY);
	returnYear.setBounds(220, 272, 60, 25);
	returnYear.setForeground(Color.white);
	returnYear.setBackground(Color.gray);
	returnYear.setFont(new Font("Helvetica", Font.PLAIN, 14));
	container.add(returnYear);
	
	//Date Checker
	
	//Next Button
	next.setBounds(253, 450, 97, 26);
	next.setHorizontalTextPosition(SwingConstants.CENTER);
	next.setVerticalTextPosition(SwingConstants.CENTER);
	next.setAlignmentX(CENTER_ALIGNMENT);
	next.setBackground(new Color(50, 205, 50));
	next.setFont(new Font("Helvetica", Font.PLAIN, 14));
	container.add(next);
	
	//Back Button
	back.setBounds(40, 450, 97, 26);
	back.setHorizontalTextPosition(SwingConstants.CENTER);
	back.setVerticalTextPosition(SwingConstants.CENTER);
	back.setAlignmentX(CENTER_ALIGNMENT);
	back.setBackground(new Color(50, 205, 50));
	back.setFont(new Font("Helvetica", Font.PLAIN, 14));
	container.add(back);
	
}
	public void addActionEvent() {
	pickUpDate.addActionListener(this);
	pickUpMonth.addActionListener(this);
	pickUpYear.addActionListener(this);
	returnDate.addActionListener(this);
	returnMonth.addActionListener(this);
	returnYear.addActionListener(this);
	next.addActionListener(this);
	back.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == pickUpDate) {
			int pD = (int)pickUpDate.getSelectedItem();
		}
		
		if(e.getSource() == pickUpMonth) {
			String pM = (String)pickUpMonth.getSelectedItem();
		}
		
		if(e.getSource() == pickUpYear) {
			int pY = (int)pickUpYear.getSelectedItem();
		}
		
		if(e.getSource() == returnDate) {
			int rD = (int)returnDate.getSelectedItem();
		}
		
		if(e.getSource() == returnMonth) {
			String rM = (String)returnMonth.getSelectedItem();
		}
		
		if(e.getSource() == returnYear) {
			int rY = (int)returnYear.getSelectedItem();
		}
		
		if(e.getSource() == next) {
			// Date Checker
			this.setVisible(false);
			CarChoiceFrame cCF = new CarChoiceFrame();
			cCF.setVisible(true);
		}
		
		if(e.getSource() == back) {
			this.setVisible(false);
			LoginFrame lF = new LoginFrame();
			lF.setVisible(true);			
		}
	}
}
