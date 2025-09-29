package assignment4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class A4SBQ2 {
	

	
	
	    public static void main(String[] args) {
	        // Create frame
	        JFrame frame = new JFrame("Vaccine Info");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 300);
	        frame.setLocationRelativeTo(null);

	        // Create panel
	        JPanel panel = new JPanel(new GridLayout(7, 2, 10, 10));
	        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

	        // Name input
	        JLabel nameLabel = new JLabel("Name:");
	        JTextField nameField = new JTextField();

	        // Dose checkboxes
	        JLabel doseLabel = new JLabel("Dose Taken:");
	        JCheckBox dose1Checkbox = new JCheckBox("1st Dose");
	        JCheckBox dose2Checkbox = new JCheckBox("2nd Dose");

	        JPanel dosePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	        dosePanel.add(dose1Checkbox);
	        dosePanel.add(dose2Checkbox);

	        // Vaccine radio buttons
	        JLabel vaccineLabel = new JLabel("Vaccine:");
	        JRadioButton covishield = new JRadioButton("Covishield");
	        JRadioButton covaxin = new JRadioButton("Covaxin");
	        JRadioButton sputnik = new JRadioButton("Sputnik V");

	        ButtonGroup vaccineGroup = new ButtonGroup();
	        vaccineGroup.add(covishield);
	        vaccineGroup.add(covaxin);
	        vaccineGroup.add(sputnik);

	        JPanel vaccinePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	        vaccinePanel.add(covishield);
	        vaccinePanel.add(covaxin);
	        vaccinePanel.add(sputnik);

	        // Show button
	        JButton showButton = new JButton("Show");

	        // Result label
	        JLabel resultLabel = new JLabel("Result will appear here");

	        // Add components to panel
	        panel.add(nameLabel);
	        panel.add(nameField);
	        panel.add(doseLabel);
	        panel.add(dosePanel);
	        panel.add(vaccineLabel);
	        panel.add(vaccinePanel);
	        panel.add(new JLabel("")); // empty cell
	        panel.add(showButton);
	        panel.add(new JLabel("")); // empty cell
	        panel.add(resultLabel);

	        // Add panel to frame
	        frame.add(panel);
	        frame.setVisible(true);

	        // Event handling for Show button
	        showButton.addActionListener(e -> {
	            String name = nameField.getText().trim();
	            String dose1Status = dose1Checkbox.isSelected() ? "Yes" : "No";
	            String dose2Status = dose2Checkbox.isSelected() ? "Yes" : "No";
	            String vaccine = "";

	            if (covishield.isSelected()) vaccine = "Covishield";
	            else if (covaxin.isSelected()) vaccine = "Covaxin";
	            else if (sputnik.isSelected()) vaccine = "Sputnik V";
	            else vaccine = "None Selected";

	            resultLabel.setText("Name: " + name + " | Vaccine: " + vaccine +
	                                " | 1st Dose: " + dose1Status + " | 2nd Dose: " + dose2Status);
	        });
	    }
	}

