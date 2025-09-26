package LabAssignments;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class A4SAQ4{
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Language Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

      
        String[] languages = { "c", "c++", "c#", "java", "PHP" };
        JComboBox<String> languageComboBox = new JComboBox<>(languages);

        
        JButton showButton = new JButton("Show");

        JLabel resultLabel = new JLabel("Selected Language: ");

        
        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedLanguage = (String) languageComboBox.getSelectedItem();
                resultLabel.setText("Selected Language: " + selectedLanguage);
            }
        });

        
        frame.add(new JLabel("Choose a language:"));
        frame.add(languageComboBox);
        frame.add(showButton);
        frame.add(resultLabel);

        
        frame.setVisible(true);
    }
}