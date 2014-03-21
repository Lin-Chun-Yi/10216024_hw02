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
import java.awt.FlowLayout;

public class MyBMI extends JFrame {
	/**
	 * 
	 */

	private JTextField jtfAge = new JTextField();
	private JTextField jtfHeight = new JTextField();
	private JTextField jtfWeight = new JTextField();
	private JTextField jtfBmi = new JTextField();
	
	private JButton jbtCalculate = new JButton("Calculate BMI");
	
	public MyBMI(){
		JPanel p1 = new JPanel(new GridLayout(4, 2));
		p1.add(new JLabel("Age"));
		p1.add(jtfAge);
		p1.add(new JLabel("Height(inchs)"));
		p1.add(jtfHeight);
		p1.add(new JLabel("Weight(pounds)"));
		p1.add(jtfWeight);
		p1.add(new JLabel("BMI"));
		p1.add(jtfBmi);
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(jbtCalculate);
		
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		
		jbtCalculate.addActionListener(new ButtonListener());
	}
	
	private class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int age = Integer.parseInt(jtfAge.getText());
	    	double weight = Double.parseDouble(jtfHeight.getText());
	    	double height = Double.parseDouble(jtfWeight.getText());

	    	// Create a  object
	    	BMI myBMI = new BMI("name", age, weight, height);
	    	
	    	//display the result
	    	jtfBmi.setText(String.format("%.2f", myBMI.getBMI()));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBMI frame = new MyBMI();
		
		frame.setTitle("BMI");
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
