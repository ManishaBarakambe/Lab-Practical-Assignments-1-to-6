package assignment4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class A4SBQ1 {
	
	 
	    private static int attemptCount = 0;
	    private static final String CORRECT_USERNAME = "admin";
	    private static final String CORRECT_PASSWORD = "1234";

	    public static void main(String[] args) {
	        // Create frame
	        JFrame frame = new JFrame("Login Form");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(350, 200);
	        frame.setLocationRelativeTo(null);

	        // Create panel
	        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
	        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

	        // Components
	        JLabel userLabel = new JLabel("Username:");
	        JTextField userField = new JTextField();

	        JLabel passLabel = new JLabel("Password:");
	        JPasswordField passField = new JPasswordField();

	        JButton loginButton = new JButton("Login");
	        JButton resetButton = new JButton("Reset");

	        // Add components to panel
	        panel.add(userLabel);
	        panel.add(userField);
	        panel.add(passLabel);
	        panel.add(passField);
	        panel.add(loginButton);
	        panel.add(resetButton);

	        // Add panel to frame
	        frame.add(panel);
	        frame.setVisible(true);

	        // Login button event
	        loginButton.addActionListener(e -> {
	            String username = userField.getText();
	            String password = new String(passField.getPassword());

	            if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
	                JOptionPane.showMessageDialog(frame, "Login successful");
	                attemptCount = 0; // reset on success
	            } else {
	                attemptCount++;
	                if (attemptCount >= 3) {
	                    JOptionPane.showMessageDialog(frame, "Login Failed");
	                    loginButton.setEnabled(false); // disable login after 3 attempts
	                } else {
	                    JOptionPane.showMessageDialog(frame, "Username or Password is incorrect");
	                }
	            }
	        });

	        // Reset button event
	        resetButton.addActionListener(e -> {
	            userField.setText("");
	            passField.setText("");
	        });
	    }
	
}