
/**
 * @author Jasmin Adilovic
 *
 */
import javax.swing.*;


import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.*;

import java.awt.*;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyWindow myWindow = new MyWindow();
		myWindow.setVisible(true);
		
		
		/*
		String firstNumber = "";
		String secondNumber = "";
		
		JFrame MyWindow = new JFrame("myWindow");
		MyWindow.setLayout(new FlowLayout());
		
		// Add Icon
		Icon bug = new ImageIcon(Program.class.getResource("bug1.png"));
		
		// Add Label
		JLabel myLabel = new JLabel("My Label", bug, SwingConstants.LEFT);
		myLabel.setForeground(Color.WHITE);
		myLabel.setToolTipText("This is myLabel");
		myLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		myLabel.setLocation(0, 0);
		myWindow.add(myLabel);
		
		// Add Text Field
		JTextField myTextField = new JTextField("Enter your name", 20);
		myTextField.setLocation(0, 40);
		myWindow.add(myTextField);
		
		// FIX THIS ERROR TOM
		//myTextField.addActionListener(textFieldHandler);
		
		// Modify my Window Properties
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setSize(320, 480);
		myWindow.getContentPane().setBackground(Color.BLACK);
		myWindow.setBounds(300, 200, 500, 300);
		myWindow.setLocation(200, 200);
		myWindow.setLocationRelativeTo(null);
		myWindow.setResizable(false);
		
		myWindow.setVisible(true);
		*/
		/*
		try {
			//obtain user input from JOptionPane input dialogs
			firstNumber = JOptionPane.showInputDialog("enter first integer");
			System.out.println(firstNumber);
			secondNumber = JOptionPane.showInputDialog("Enter second integer");
			System.out.println(secondNumber);
			
			// convert String inputs to int values for use in a calculation
			int number1 = Integer.parseInt(firstNumber);
			int number2 = Integer.parseInt(secondNumber);
			
			int sum = number1 + number2;
			
			// display result in a JOptionPane message dialog
	JOptionPane.showMessageDialog(null, "The sum is " + sum, "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
			
			} catch (Exception e){
				JOptionPane.showMessageDialog(null, "Incorect values entered", "Entry Error", JOptionPane.ERROR_MESSAGE);
				System.out.println(e);
		}
		
*/
	}

	public void textFieldHandler(){
		
	}
}
