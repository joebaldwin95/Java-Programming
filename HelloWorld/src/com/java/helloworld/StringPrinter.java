package com.java.helloworld;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridLayout;

import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.JTextField;

import java.awt.Button;

import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class StringPrinter {

	private JFrame frame;
	protected JTextField textField;
	String statementin;
	String statementout;
	private final Action action = new SwingAction();
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StringPrinter window = new StringPrinter();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StringPrinter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = DefaultComponentFactory.getInstance().createLabel("Statement:");
		label.setBounds(121, 40, 120, 16);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		
		textField.setBounds(191, 34, 134, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblStatementPrinter = DefaultComponentFactory.getInstance().createTitle("Statement Printer!");
		lblStatementPrinter.setBounds(168, 6, 122, 16);
		frame.getContentPane().add(lblStatementPrinter);
		
		JButton btnGo = new JButton("Go");
		btnGo.addActionListener(action);
		btnGo.setBounds(168, 68, 117, 29);
		frame.getContentPane().add(btnGo);
	
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Go");
			putValue(SHORT_DESCRIPTION, "Prints Your Text To Screen");
			
		}

		@Override
		public void actionPerformed(ActionEvent e)
				{
				statementout = null;
				statementin = textField.getText();
				statementout = statementin;
				textField_1 = new JTextField();
				textField_1.setBounds(18, 109, 414, 28);
				frame.getContentPane().add(textField_1);
				textField_1.setColumns(10);
				textField_1.setText(statementout);
				textField_1.validate();
				textField_1.repaint();
				
				 
				 
													 
}//ACTION PERFORMED
}//SWING ACTION
}//CLASS BODY
