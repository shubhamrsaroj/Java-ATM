package Myf;
import javax.swing.*;
import java.awt.event.*;
import java.awt.EventQueue;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import JavaAllProjects.ATM;

import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;

public class Atmmm extends JFrame {
	private ATM account= new ATM();
    private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
    
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atmmm frame=new Atmmm();
		            frame.setVisible(true);
				    
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	/**
	 * Create the frame.
	 */
	private void depositButtonActionPerformed(ActionEvent evt) {
        String amountText = textField.getText();
        double amount = Double.parseDouble(amountText);

        account.deposit(amount);

        // Update GUI or display a message confirming the deposit
        // For example:
          try {
        textField.setText(Double.toString(amount));
       
    }
         catch(Exception e) {
             	 e.printStackTrace();
         }
	}

    // Action performed when the withdraw button is clicked
    private void withdrawMoney(ActionEvent evt) {
        String amountText = textField.getText();
        double amount = Double.parseDouble(amountText);

        double withdrawed= account.withdraw(amount);
    
        
            // Withdrawal successful
            // Update GUI or display a message confirming the withdrawal
            // For example:
			 textField.setText(Double.toString(withdrawed));
			 
        
    }
    private void checkBalancee(ActionEvent evt) {
       

            double amountg=account.checkBalance();
        
            // Withdrawal successful
            // Update GUI or display a message confirming the withdrawal
            // For example:
			 textField_2.setText(Double.toString(amountg));
        
    }
	
	public Atmmm() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1030, 526);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		//deposit
		JButton btnNewButton = new JButton("DEPOSIT");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(128, 0, 255));
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				   depositButtonActionPerformed(e);
				
				}
				
		});
		btnNewButton.setBounds(343, 243, 155, 65);
		contentPane.add(btnNewButton);
		//checkbalance
		JButton btnNewButton_1 = new JButton("CHECK BALANCE");
		btnNewButton_1.setBackground(new Color(255, 128, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkBalancee(e);
				
			}
		});
		btnNewButton_1.setBounds(581, 246, 148, 65);
		contentPane.add(btnNewButton_1);
		                      
		JLabel lblNewLabel = new JLabel("WELCOME TO WORLD BANK");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(217, 60, 431, 91);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setSelectionColor(new Color(255, 255, 255));
		textField.setBackground(new Color(128, 0, 255));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(237, 353, 155, 69);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Add Balance");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(265, 432, 116, 24);
		contentPane.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setSelectionColor(new Color(255, 255, 255));
		textField_2.setBackground(new Color(255, 128, 64));
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setBounds(470, 353, 148, 69);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("WITHDRAW");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				withdrawMoney(e);
			
			}
		});
		btnNewButton_2.setBackground(new Color(255, 0, 255));
		btnNewButton_2.setBounds(94, 243, 133, 65);
		contentPane.add(btnNewButton_2);
		
		
	}
}
