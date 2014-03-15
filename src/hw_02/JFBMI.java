package hw_02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JFBMI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textAge;
	private JTextField textHeight;
	private JTextField textWeight;
	private JTextField textBmi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFBMI frame = new JFBMI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFBMI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setBounds(140, 117, 46, 15);
		layeredPane.add(lblHeight);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(140, 68, 46, 15);
		layeredPane.add(lblAge);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setBounds(140, 172, 46, 15);
		layeredPane.add(lblWeight);
		
		textAge = new JTextField();
		textAge.setHorizontalAlignment(SwingConstants.RIGHT);
		textAge.setBounds(34, 65, 96, 21);
		layeredPane.add(textAge);
		textAge.setColumns(10);
		int age = Integer.parseInt(textAge.getText());
		
		textHeight = new JTextField();
		textHeight.setHorizontalAlignment(SwingConstants.RIGHT);
		textHeight.setBounds(34, 114, 96, 21);
		layeredPane.add(textHeight);
		textHeight.setColumns(10);
		double height = Double.parseDouble(textHeight.getText());
		
		textWeight = new JTextField();
		textWeight.setHorizontalAlignment(SwingConstants.RIGHT);
		textWeight.setBounds(34, 169, 96, 21);
		layeredPane.add(textWeight);
		textWeight.setColumns(10);
		double weight = Double.parseDouble(textWeight.getText());
		
		BMI myBMI = new BMI("name", age, weight, height);
		textBmi = new JTextField();
		textBmi.setHorizontalAlignment(SwingConstants.CENTER);
		textBmi.setBounds(260, 140, 96, 21);
		layeredPane.add(textBmi);
		textBmi.setColumns(10);
		
		textBmi.setText(String.format("%.2f", myBMI.getBMI()));
	}
}
