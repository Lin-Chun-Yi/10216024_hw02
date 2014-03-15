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

public class JFBMI extends JFrame {

	private JPanel contentPane;

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
		
		JEditorPane dtrpnAge = new JEditorPane();
		dtrpnAge.setText("Age");
		dtrpnAge.setBounds(24, 62, 106, 21);
		layeredPane.add(dtrpnAge);
		
		JEditorPane dtrpnHeight = new JEditorPane();
		dtrpnHeight.setText("Height");
		dtrpnHeight.setBounds(24, 111, 106, 21);
		layeredPane.add(dtrpnHeight);
		
		JEditorPane dtrpnSc = new JEditorPane();
		dtrpnSc.setText("Weight");
		dtrpnSc.setBounds(24, 166, 106, 21);
		layeredPane.add(dtrpnSc);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setBounds(140, 117, 46, 15);
		layeredPane.add(lblHeight);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(140, 68, 46, 15);
		layeredPane.add(lblAge);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setBounds(140, 172, 46, 15);
		layeredPane.add(lblWeight);
		
		JEditorPane dtrpnBmi = new JEditorPane();
		dtrpnBmi.setText("BMI");
		dtrpnBmi.setBounds(243, 111, 106, 21);
		layeredPane.add(dtrpnBmi);
	}
}
