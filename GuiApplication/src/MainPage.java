import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class MainPage extends JFrame{
	private JLabel user;
	private JLabel pass;
	private JTextField username;
	private JPasswordField password;
	private JButton submit;
	
	final private JLabel label = new JLabel("Missing username or password");
	MainPage(){
		super("Main Page");
		setLayout(new FlowLayout());
		user = new JLabel("username : ");
		pass = new JLabel("password : ");
		
		username = new JTextField(20);
		username.setText("osum");
		password = new JPasswordField(20);
		password.setText("devangmehta");
		
		submit = new JButton("Submit");
//		submit.setEnabled(false);
	
		add(user);
		add(username);
		add(pass);
		add(password);
		add(submit);
		
		Handler handler = new Handler();
		submit.addActionListener(handler);
//		username.addActionListener(handler);
//		password.addActionListener(handler);
		
		
	}
	
	private class Handler implements ActionListener, ItemListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == submit) {
				if(username.getText().equals("") || password.getText().equals("")) {
//					setVisible(false);
					label.setText("Missing username or password");
					label.setForeground(Color.red);
					add(label);
				}
				else if(username.getText().equals("osum") && password.getText().equals("devangmehta")) {
					label.setText("");
					setVisible(false);
					dispose();
					Media obj = new Media();
					obj.setSize(400,200);
					obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					obj.setVisible(true);
					obj.setLocationRelativeTo(null);
				}
				else {
					add(label);
					label.setText("Incorrect Username or Password");
				}
			}
			
		}

		public void itemStateChanged(ItemEvent e) {
//			if(!username.getText().equals("") && !password.getText().equals("")) {
//				submit.setEnabled(true);
//			}
//			
		}
	}
}