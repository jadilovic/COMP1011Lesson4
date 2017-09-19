import java.awt.FlowLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;


public class MyWindow extends JFrame {

	private JPanel _contentPane;
	private JLabel _textField1Label;
	private JTextField _textField1 = new JTextField("Enter your name: ");
	private JLabel _passwordFieldLabel;
	private JPasswordField _passwordField = new JPasswordField("password");
	
	// CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++++++++++++++
	public MyWindow(){
		this._initialize();
		
		_createUI();
	}

	// PRIVATE METHODS ++++++++++++++++++++++++++++++++++++++++++++++
	private void _createUI() {
		this._textField1Label = new JLabel("Name");
		this._contentPane.add(_textField1Label);
		// this._textField1 = new JTextField("Enter your name: ");
		this._contentPane.add(this._textField1);
		
		this._passwordFieldLabel = new JLabel("Password");
		this._contentPane.add(_passwordFieldLabel);
		// this._passwordField = new JPasswordField("password");
		this._contentPane.add(_passwordField);
		
		TextHandler handler = new TextHandler(this._textField1, this._passwordField);
		this._textField1.addActionListener(handler);
		this._passwordField.addActionListener(handler);
	}
	
	private void _initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 480);
		this._contentPane = new JPanel();
		this._contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this._contentPane.setLayout(new FlowLayout());
		setContentPane(this._contentPane);
	}
}
