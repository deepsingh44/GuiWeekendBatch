package com.deepsingh44.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoginFile extends JFrame {

	private JPanel contentPane;
	private JTextField tfirstnum;
	private JTextField tsecondnum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFile frame = new LoginFile();
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
	public LoginFile() {
		setTitle("Cal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 454);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tfirstnum = new JTextField();

		tfirstnum.setBounds(164, 71, 224, 34);
		contentPane.add(tfirstnum);
		tfirstnum.setColumns(10);

		JLabel lblEnterFirstNumber = new JLabel("Enter First Number");
		lblEnterFirstNumber.setForeground(Color.WHITE);
		lblEnterFirstNumber.setBounds(39, 71, 115, 34);
		contentPane.add(lblEnterFirstNumber);

		JLabel lblEnterSecondNumber = new JLabel("Enter Second Number");
		lblEnterSecondNumber.setForeground(Color.WHITE);
		lblEnterSecondNumber.setBounds(39, 126, 115, 34);
		contentPane.add(lblEnterSecondNumber);

		tsecondnum = new JTextField();
		tsecondnum.setColumns(10);
		tsecondnum.setBounds(164, 126, 224, 34);
		contentPane.add(tsecondnum);

		JButton btnNewButton = new JButton("Add Here");
		btnNewButton.setBounds(127, 277, 194, 34);
		contentPane.add(btnNewButton);

		JLabel tresult = new JLabel("", JLabel.CENTER);
		tresult.setForeground(Color.WHITE);
		tresult.setBounds(121, 208, 200, 23);
		contentPane.add(tresult);

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String first = tfirstnum.getText();
				String second = tsecondnum.getText();
				// convert
				int x = Integer.parseInt(first);
				int y = Integer.parseInt(second);
				// addition
				// System.out.println(x+y);
				// set result in User interface
				tresult.setText(String.valueOf(x + y));

			}
		});

		tfirstnum.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (!Character.isDigit(e.getKeyChar())) {
					e.consume();
				}
			}
		});

		tsecondnum.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (!Character.isDigit(e.getKeyChar())) {
					e.consume();
				}
			}
		});
	}
}
