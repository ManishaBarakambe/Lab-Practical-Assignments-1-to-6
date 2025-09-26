package LabAssignments;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class A4SAQ2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vaccination Details");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());
        JPanel namePanel = new JPanel();
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        namePanel.add(nameLabel);
        namePanel.add(nameField);
        JPanel centerPanel = new JPanel(new GridLayout(1, 2));
        JPanel dosePanel = new JPanel(new GridLayout(2, 1));
        dosePanel.setBorder(BorderFactory.createTitledBorder("Dose"));
        JRadioButton dose1 = new JRadioButton("1st Dose");
        JRadioButton dose2 = new JRadioButton("2nd Dose");
        ButtonGroup doseGroup = new ButtonGroup();
        doseGroup.add(dose1);
        doseGroup.add(dose2);
        dosePanel.add(dose1);
        dosePanel.add(dose2);
        JPanel vaccinePanel = new JPanel(new GridLayout(3, 1));
        vaccinePanel.setBorder(BorderFactory.createTitledBorder("Vaccine"));
        JRadioButton covishield = new JRadioButton("Covishield");
        JRadioButton covaxin = new JRadioButton("Covaxin");
        JRadioButton sputnik = new JRadioButton("Sputnik V");
        ButtonGroup vaccineGroup = new ButtonGroup();
        vaccineGroup.add(covishield);
        vaccineGroup.add(covaxin);
        vaccineGroup.add(sputnik);
        vaccinePanel.add(covishield);
        vaccinePanel.add(covaxin);
        vaccinePanel.add(sputnik);

        centerPanel.add(dosePanel);
        centerPanel.add(vaccinePanel);
        JPanel summaryPanel = new JPanel(new GridLayout(3, 1));
        summaryPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Summary"));

        JLabel summaryName = new JLabel("Name : ________");
        JLabel summaryDose = new JLabel("1st Dose: __    2nd Dose: ____");
        JLabel summaryVaccine = new JLabel("Vaccine: ________");

        summaryPanel.add(summaryName);
        summaryPanel.add(summaryDose);
        summaryPanel.add(summaryVaccine);
        frame.add(namePanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(summaryPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}