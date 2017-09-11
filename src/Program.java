
/**
 * @author Jasmin Adilovic
 *
 */


import javax.swing.JOptionPane;


public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String firstNumber = "";
		String secondNumber = "";
		
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
		

	}

}
