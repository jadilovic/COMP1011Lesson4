import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class TextHandler implements ActionListener {

	private JTextField _textField;
	private JPasswordField _passwordField;
	
	public TextHandler(JTextField textField, JPasswordField passwordField){
		this._textField = textField;
		this._passwordField = passwordField;
	}
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == this._textField){
			System.out.println("Textfield clicked");
		}
		else if(event.getSource() == this._passwordField){
			System.out.println("Passwordfield clicked");
		}
		else
			System.out.println("Something else happened");
		
	}

}
