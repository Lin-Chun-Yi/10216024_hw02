package hw_02;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;

public class MyBMI extends JFrame {
	/**
	 * 
	 */

	private JTextField jtfName = new JTextField();
	private JTextField jtfAge = new JTextField();
	private JTextField jtfHeight = new JTextField();
	private JTextField jtfWeight = new JTextField();
	private JLabel jlfBmi = new JLabel();
	
	private JButton jbtCalculate = new JButton("Calculate BMI");
	
	public MyBMI(){
		JPanel p1 = new JPanel(new GridLayout(4, 2));
		p1.add(new JLabel("Name"));
		p1.add(jtfName);
		p1.add(new JLabel("Age"));
		p1.add(jtfAge);
		p1.add(new JLabel("Height (meters)"));
		p1.add(jtfHeight);
		p1.add(new JLabel("Weight (kilograms)"));
		p1.add(jtfWeight);
		p1.setBorder(new TitledBorder("Enter age, height, weight."));
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(jbtCalculate);
		
		JPanel p3 = new JPanel(new GridLayout(1, 3));
		p3.add(new JLabel("BMI"));
		p3.add(jlfBmi);
		p3.setBorder(new TitledBorder("The result"));
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);
		
		jbtCalculate.addActionListener(new ButtonListener());
	}
	
	private class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int age = Integer.parseInt(jtfAge.getText());
	    	double height = Double.parseDouble(jtfHeight.getText());
	    	double weight = Double.parseDouble(jtfWeight.getText());

	    	// Create a  object
	    	BMI myBMI = new BMI("name", age, weight, height);
	    	
	    	//display the result
	    	jlfBmi.setText(String.format("%.2f", myBMI.getBMI()));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBMI frame = new MyBMI();
		
		frame.setTitle("BMI");
		frame.setSize(300, 230);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
