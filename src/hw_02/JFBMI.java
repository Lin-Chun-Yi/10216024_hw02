/**package hw_02;
/**
 * 這是用外掛程式拉的
 */
/**import java.awt.BorderLayout;
*import java.awt.EventQueue;
*import java.awt.event.ActionEvent;
*import java.awt.event.ActionListener;
*
*import javax.swing.JFrame;
*import javax.swing.JPanel;
*import javax.swing.border.EmptyBorder;
*import javax.swing.JLayeredPane;
*import javax.swing.JTextField;
*import javax.swing.JLabel;
*import javax.swing.SwingConstants;
*import javax.swing.JButton;
*
*public class JFBMI extends JFrame {
*
*	/**
*	 * 
*	 */
/**	private static final long serialVersionUID = 1L;
*	private JPanel contentPane;
*	private JTextField textAge;
**	private JTextField textHeight;
*	private JTextField textWeight;
**	private JTextField textBmi;
*	JButton bt = new JButton("Calculate");
*	
*	/**
*	 * Launch the application.
*	 */
/**	public static void main(String[] args) {
*		EventQueue.invokeLater(new Runnable() {
*			public void run() {
*				try {
*					JFBMI frame = new JFBMI();
*					frame.pack();
*					frame.setTitle("BMI");
*				    frame.setLocationRelativeTo(null); // Center the frame
*				    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
*				    frame.setBounds(100, 100, 450, 300);
*					frame.setVisible(true);
*				} catch (Exception e) {
*					e.printStackTrace();
*				}
*			}
*		});
**	}
*
*	/**
*	 * Create the frame.
*	 */
/**	public JFBMI() {
*		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
*		setBounds(100, 100, 450, 300);
*		contentPane = new JPanel();
*		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
*		contentPane.setLayout(new BorderLayout(0, 0));
*		setContentPane(contentPane);
*		
*		JLayeredPane layeredPane = new JLayeredPane();
*		contentPane.add(layeredPane, BorderLayout.CENTER);
**		
*		JLabel lblHeight = new JLabel("Height(inchs)");
*		lblHeight.setBounds(140, 85, 78, 15);
*		layeredPane.add(lblHeight);
*		
*		JLabel lblAge = new JLabel("Age");
*		lblAge.setBounds(140, 37, 46, 15);
*		layeredPane.add(lblAge);
*		
*		JLabel lblWeight = new JLabel("Weight(pounds)");
*		lblWeight.setBounds(140, 129, 96, 15);
*		layeredPane.add(lblWeight);
*		
*		textAge = new JTextField();
*		textAge.setHorizontalAlignment(SwingConstants.RIGHT);
*		textAge.setBounds(34, 34, 96, 21);
*		layeredPane.add(textAge);
*		textAge.setColumns(10);
*		
***		textHeight = new JTextField();
*		textHeight.setHorizontalAlignment(SwingConstants.RIGHT);
*		textHeight.setBounds(34, 82, 96, 21);
*		layeredPane.add(textHeight);
*		textHeight.setColumns(10);
*		
*		textWeight = new JTextField();
*		textWeight.setHorizontalAlignment(SwingConstants.RIGHT);
*		textWeight.setBounds(34, 126, 96, 21);
*		layeredPane.add(textWeight);
*		textWeight.setColumns(10);
*		
*		
*		textBmi = new JTextField();
*		textBmi.setHorizontalAlignment(SwingConstants.CENTER);
*		textBmi.setBounds(260, 126, 96, 21);
*		layeredPane.add(textBmi);
*		textBmi.setColumns(10);
*		
*		bt.setBounds(43, 169, 87, 23);
*		layeredPane.add(bt);
*		
*		JLabel lblNewLabel = new JLabel("B  M  I");
*		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
*		lblNewLabel.setBounds(260, 70, 87, 45);
*		layeredPane.add(lblNewLabel);
*		
*		//
*		bt.addActionListener(new ButtonListener());
*	}
*	
*	class ButtonListener implements ActionListener {
*	    @Override 
*	    public void actionPerformed(ActionEvent e) {
*	*    	// Get values from text fields
**	    	int age = Integer.parseInt(textAge.getText());
*	    	double weight = Double.parseDouble(textWeight.getText());
*	    	double height = Double.parseDouble(textHeight.getText());
*
*	    	// Create a  object
*	    	BMI myBMI = new BMI("name", age, weight, height);
**	    	
*	    	//display the result
*	    	textBmi.setText(String.format("%.2f", myBMI.getBMI()));
*	    }
*	}
*}
*/