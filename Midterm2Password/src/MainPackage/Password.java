package MainPackage;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Password {

	private JFrame frame;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Password window = new Password();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Password() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JPasswordField passwordInput = new JPasswordField();
		passwordField.setBounds(171, 94, 200, 50);
		frame.getContentPane().add(passwordInput);
		
		JLabel lblEnterThePassword = new JLabel("Enter the password:");
		lblEnterThePassword.setBounds(34, 105, 131, 16);
		frame.getContentPane().add(lblEnterThePassword);
		lblEnterThePassword.setLabelFor(passwordInput);
		
		JButton btnOkay = new JButton("Okay");
		btnOkay.setBounds(48, 158, 117, 29);
		frame.getContentPane().add(btnOkay);
		btnOkay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = e.getActionCommand();
				char[] input = passwordInput.getPassword();
					if (passwordCorrect(input) == true) {
						JOptionPane.showMessageDialog(frame,
								"This is correct!");
					} 
					else {
						JOptionPane.showMessageDialog(frame, "Invalid, try again!!");
					}
			}

			private boolean passwordCorrect(char[] input) {
				char[] correctPassword = { 'b', 'u', 'g', 'a', 'b', 'o', 'o' };
				boolean password = true;
				if (input.length != correctPassword.length) {
					password = false;
				}

				else {
					password = true;
				}

				Arrays.fill(correctPassword, '0');
				return password;
			}});
		
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setBounds(208, 156, 117, 29);
		frame.getContentPane().add(btnHelp);
		
	}

}


	

