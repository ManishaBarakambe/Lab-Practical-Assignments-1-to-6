package assignment4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class A4SBQ3 {
	

	
	    private static JTextField display;

	    public static void main(String[] args) {
	        // Create frame
	        JFrame frame = new JFrame("Calculator");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(300, 400);
	        frame.setLocationRelativeTo(null);

	        // Create display field
	        display = new JTextField();
	        display.setEditable(false);
	        display.setFont(new Font("Arial", Font.BOLD, 24));
	        display.setHorizontalAlignment(JTextField.RIGHT);

	        // Create panel for buttons
	        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));

	        // Button labels
	        String[] buttons = {
	            "7", "8", "9", "/",
	            "4", "5", "6", "*",
	            "1", "2", "3", "-",
	            "0", "C", "=", "+"
	        };

	        // Add buttons to panel
	        for (String label : buttons) {
	            JButton button = new JButton(label);
	            button.setFont(new Font("Arial", Font.BOLD, 20));
	            buttonPanel.add(button);

	            // Add action listener
	            button.addActionListener(new CalculatorAction());
	        }

	        // Layout setup
	        frame.setLayout(new BorderLayout(10, 10));
	        frame.add(display, BorderLayout.NORTH);
	        frame.add(buttonPanel, BorderLayout.CENTER);
	        frame.setVisible(true);
	    }

	    // Action listener class
	    static class CalculatorAction implements ActionListener {
	        private static String current = "";
	        private static String operator = "";
	        private static double firstNum = 0;

	        public void actionPerformed(ActionEvent e) {
	            String command = e.getActionCommand();

	            if (command.matches("[0-9]")) {
	                current += command;
	                display.setText(current);
	            } else if (command.matches("[+\\-*/]")) {
	                operator = command;
	                firstNum = Double.parseDouble(current);
	                current = "";
	                display.setText("");
	            } else if (command.equals("=")) {
	                double secondNum = Double.parseDouble(current);
	                double result = 0;

	                switch (operator) {
	                    case "+": result = firstNum + secondNum; break;
	                    case "-": result = firstNum - secondNum; break;
	                    case "*": result = firstNum * secondNum; break;
	                    case "/": 
	                        if (secondNum != 0) result = firstNum / secondNum;
	                        else {
	                            display.setText("Error: Divide by 0");
	                            current = "";
	                            return;
	                        }
	                        break;
	                }

	                display.setText(String.valueOf(result));
	                current = String.valueOf(result);
	            } else if (command.equals("C")) {
	                current = "";
	                operator = "";
	                firstNum = 0;
	                display.setText("");
	            }
	        }
	    }
	
}