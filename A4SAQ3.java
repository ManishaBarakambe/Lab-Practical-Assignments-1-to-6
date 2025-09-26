package LabAssignments;

import javax.swing.*;
import java.awt.event.*;

public class A4SAQ3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Count words and characters");
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); 
        JLabel wordLabel = new JLabel("Words: 0");
        wordLabel.setBounds(30, 20, 100, 20);
        frame.add(wordLabel);

        JLabel charLabel = new JLabel("Characters: 0");
        charLabel.setBounds(150, 20, 150, 20);
        frame.add(charLabel);
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(30, 50, 320, 150);
        frame.add(scrollPane);
        JButton countButton = new JButton("Count Words");
        countButton.setBounds(130, 220, 120, 30);
        frame.add(countButton);
        countButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                int charCount = text.length();
                String[] words = text.trim().split("\\s+");
                int wordCount = 0;

                if (!text.trim().isEmpty()) {
                    wordCount = words.length;
                }

                wordLabel.setText("Words: " + wordCount);
                charLabel.setText("Characters: " + charCount);
            }
        });
        frame.setVisible(true);
    }
}
