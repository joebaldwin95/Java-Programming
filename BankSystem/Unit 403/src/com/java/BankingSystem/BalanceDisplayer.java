package com.java.BankingSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

import javax.swing.Action;

public class BalanceDisplayer {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel name;
	private JButton btnRetrieve;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BalanceDisplayer window = new BalanceDisplayer();
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
	public BalanceDisplayer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][][][][grow][grow]", "[][][][][][]"));
		
		JLabel lblBalanceChecker = DefaultComponentFactory.getInstance().createTitle("Balance Checker");
		frame.getContentPane().add(lblBalanceChecker, "cell 3 0,alignx right");
		
		name = new JLabel("Name:");
		frame.getContentPane().add(name, "cell 3 2,alignx left");
		
		textField_1 = new JTextField();
		frame.getContentPane().add(textField_1, "cell 4 2");
		textField_1.setColumns(10);
		
		JLabel Balance = new JLabel("Balance:");
		frame.getContentPane().add(Balance, "cell 3 3");
		
		textField = new JTextField();
		frame.getContentPane().add(textField, "cell 4 3");
		textField.setColumns(10);
		
		btnRetrieve = new JButton("Retrieve");
		btnRetrieve.setAction(action);
		frame.getContentPane().add(btnRetrieve, "cell 3 5,alignx left");
	}

	@SuppressWarnings("serial")
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Retreive");
			putValue(SHORT_DESCRIPTION, "Retrieves account name and balance.");
		}
		public void actionPerformed(ActionEvent e) {
			CurrentAccount account = new CurrentAccount();
			Customer customer = new Customer();
			customer.setFname("Joe");
			customer.setLname("Baldwin");
			account.forceDeposit(159.10);
			textField_1.setText("£" + account.getBalance());
			textField.setText(customer.getFname() + " " + customer.getLname());
			
		}
	}
}
