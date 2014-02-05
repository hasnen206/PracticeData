package com.jdbc.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.jdbc.dao.EmpDaoImpl;

public class JFrameDemo extends JFrame {
	JLabel PasswordLabel;
	JPasswordField passwordField;
	JLabel userNameJLabel;
	JTextField userNameJTxtField;
	JButton submitJButton;
	JPanel baseJPanel;
	JLabel adderJLabel;

	public JFrameDemo(){
		setTitle("Login Page");
		userNameJLabel=new JLabel("User Name");
		PasswordLabel=new JLabel("Password");
		passwordField=new JPasswordField(10);
		userNameJTxtField=new JTextField(10);
		submitJButton=new JButton("Submit");
		
		submitJButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				EmpDaoImpl obj=new EmpDaoImpl();
				if(obj.isValidUser(userid, user))
				{
					
				}
				JOptionPane.
				
			}
		});
		
		
		baseJPanel=new JPanel();
		baseJPanel.add(userNameJLabel);
		baseJPanel.add(userNameJTxtField);
		baseJPanel.add(PasswordLabel);
		baseJPanel.add(passwordField);
		setResizable(false);
		String user=userNameJTxtField.getText();
		String passString=passwordField.getText();
		int userid=Integer.parseInt(user);
		
		
		baseJPanel.add(submitJButton);
		
		add(baseJPanel);
		
		setVisible(true);
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new JFrameDemo();

	}

}
