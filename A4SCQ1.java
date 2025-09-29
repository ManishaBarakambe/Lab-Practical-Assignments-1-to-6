package assignment4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class A4SCQ1 extends JFrame implements ActionListener {
    JTextArea textArea;
    JScrollPane scrollPane;
    JMenuBar menuBar;
    JMenu fileMenu, editMenu, helpMenu;
    JMenuItem newItem, openItem, saveItem, exitItem;
    JMenuItem cutItem, copyItem, pasteItem;
    JMenuItem aboutItem;

    public A4SCQ1() {
        // Frame setup
        setTitle("Simple Notepad");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Text area with scroll
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
        add(scrollPane);

        // Menu bar
        menuBar = new JMenuBar();

        // File Menu
        fileMenu = new JMenu("File");
        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // Edit Menu
        editMenu = new JMenu("Edit");
        cutItem = new JMenuItem("Cut");
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Paste");

        cutItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        // Help Menu
        helpMenu = new JMenu("Help");
        aboutItem = new JMenuItem("About");

        aboutItem.addActionListener(this);
        helpMenu.add(aboutItem);

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == newItem) {
            textArea.setText("");
        } else if (source == openItem) {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showOpenDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    textArea.read(reader, null);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error opening file");
                }
            }
        } else if (source == saveItem) {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showSaveDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    textArea.write(writer);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error saving file");
                }
            }
        } else if (source == exitItem) {
            dispose();
        } else if (source == cutItem) {
            textArea.cut();
        } else if (source == copyItem) {
            textArea.copy();
        } else if (source == pasteItem) {
            textArea.paste();
        } else if (source == aboutItem) {
            JOptionPane.showMessageDialog(this, "Simple Notepad\nCreated by assignment4", "About", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(A4SCQ1::new);
    }
}