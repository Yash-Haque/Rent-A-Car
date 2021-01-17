import java.util.*;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;

public class CurrentDate extends JFrame implements ActionListener, Serializable {
	
	static final long serialVersionUID = 123456L;
	
	JLabel appLabel = new JLabel("Select Today's Date");
	
	JLabel line = new JLabel("____________________________________________________________");
	
	//Date
	JComboBox date;
	
	//Month
	JComboBox month;
	
	//Year
	JComboBox year;
	
	//Next Button
	JButton next = new JButton("Next");
	
	//Back Button
	JButton back = new JButton("Back");
	
	Container container = getContentPane();
	
	public CurrentDate() {
			
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
		
		//Date
		Integer[] currentDate = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
		date = new JComboBox(currentDate);
		date.setBounds(80, 185, 60, 25);
		date.setForeground(Color.white);
		date.setBackground(Color.gray);
		date.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(date);
		
		//Month
		String[] currentMonth = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		month = new JComboBox(currentMonth);
		month.setBounds(150, 185, 60, 25);
		month.setForeground(Color.white);
		month.setBackground(Color.gray);
		month.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(month);
		
		//Year
		Integer[] currentYear = {2020, 2021, 2022, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2030};
		year = new JComboBox(currentYear);
		year.setBounds(220, 185, 60, 25);
		year.setForeground(Color.white);
		year.setBackground(Color.gray);
		year.setFont(new Font("Helvetica", Font.PLAIN, 14));
		container.add(year);
		
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
		
		date.addActionListener(this);
		month.addActionListener(this);
		year.addActionListener(this);
		next.addActionListener(this);
		back.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == date) {
			int d = (int)date.getSelectedItem();
		}
		
		if(e.getSource() == month) {
			String m = (String)month.getSelectedItem();
			
		}
		
		if(e.getSource() == year) {
			int y = (int)year.getSelectedItem();
		}
		
		if(e.getSource() == next) {
			this.setVisible(false);
			ReservationDateFrame rDF = new ReservationDateFrame();
			rDF.setVisible(true);
		}
		
		if(e.getSource() == back) {
			this.setVisible(false);
			ReservationDateFrame rDF = new ReservationDateFrame();
			rDF.setVisible(true);
		}
	}
}
