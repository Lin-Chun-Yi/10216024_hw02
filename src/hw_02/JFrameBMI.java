/**package hw_02;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLable;
import javax.awt.FlowLayout;

public class JFrameBMI extends JFrame {
	private JTextField jtfAge = new JTextField();
	private JTextField jtfHeight = new JTextField();
	private JTextField jtfWeight = new JTextField();
	private JTextField jtfBmi = new JTextField();
	
	private JButton jbtCalculate = new JButton("Calculate BMI");
	
	public JFrameBMI(){
		JPanel p1 = new JPanel(new GridLayout(3, 2));
		p1.add(new JLabel("Age"));
		p1.add(jtfAge);
		p1.add(new JLabel("Height(inchs)");
		p1.add(jtfHeight);
		p1.add(new JLabel("Weight(pounds)"));
		p1.add(jtfWeight);
		p1.add(new JLabel("BMI"));
		p1.add(jtfBmi);
		
		JPanel p2 = new JPanel(new FlowLayout.RIGHT);
		p2.add(jbtCalculate);
		
		add(p1, BorderLayout.CENTER);
		add(p1, BorderLayout.SOUTH);
		
		jbtCalculate.addActionListener(new ButtonListener);
	}
	
	private class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			int age = Integer.parseInt(textAge.getText());
	    	double weight = Double.parseDouble(textWeight.getText());
	    	double height = Double.parseDouble(textHeight.getText());

	    	// Create a  object
	    	BMI myBMI = new BMI("name", age, weight, height);
	    	
	    	//display the result
	    	textBmi.setText(String.format("%.2f", myBMI.getBMI()));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrameBMI frame = new JFrameBMI();
		
		frame.setTitle("BMI");
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
*/