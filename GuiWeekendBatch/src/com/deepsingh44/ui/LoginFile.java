package com.deepsingh44.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBox;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.border.BevelBorder;

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
	String gender = "";
	private JPasswordField passwordField;

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
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(220, 370, 194, 34);
		contentPane.add(btnNewButton);

		JCheckBox chckbxIAcceptAll = new JCheckBox("I accept all terms and condition.");

		chckbxIAcceptAll.setBounds(164, 167, 224, 23);
		contentPane.add(chckbxIAcceptAll);

		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				gender = "Male";
			}
		});
		rdbtnMale.setBounds(129, 218, 109, 23);
		contentPane.add(rdbtnMale);

		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				gender = "Female";
			}
		});
		rdbtnFemale.setBounds(252, 218, 109, 23);
		contentPane.add(rdbtnFemale);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnMale);
		bg.add(rdbtnFemale);

		passwordField = new JPasswordField();
		passwordField.setBounds(164, 36, 224, 20);
		contentPane.add(passwordField);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(27, 23, 115, 34);
		contentPane.add(lblPassword);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(
				new DefaultComboBoxModel(new String[] { "Select Name", "Deep Singh", "Ramesh Singh", "Ashok Singh" }));
		comboBox.setBounds(216, 260, 157, 22);
		contentPane.add(comboBox);

		JLabel lblNewLabel = new JLabel("");

		lblNewLabel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel.setBounds(10, 264, 169, 115);
		contentPane.add(lblNewLabel);

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				/*
				 * String first = tfirstnum.getText(); String second = tsecondnum.getText(); //
				 * convert int x = Integer.parseInt(first); int y = Integer.parseInt(second); //
				 * addition // System.out.println(x+y); // set result in User interface
				 * tresult.setText(String.valueOf(x + y));
				 */
				// System.out.println(chckbxIAcceptAll.getText());

				// System.out.println(gender);
				/*
				 * char c[]=passwordField.getPassword(); String pass=String.valueOf(c);
				 * System.out.println(pass);
				 */
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

		chckbxIAcceptAll.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				JCheckBox ck = (JCheckBox) e.getSource();
				if (ck.isSelected()) {
					btnNewButton.setEnabled(true);
				} else {
					btnNewButton.setEnabled(false);
				}
			}
		});

		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					String item = comboBox.getSelectedItem().toString();
					System.out.println(item);
				}
			}
		});

		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser f = new JFileChooser();
				int i = f.showOpenDialog(LoginFile.this);
				if (i == JFileChooser.APPROVE_OPTION) {
					File file = f.getSelectedFile();
					System.out.println(file.getAbsolutePath());
					ImageIcon ic = new ImageIcon(file.getAbsolutePath());
					lblNewLabel.setIcon(new ImageIcon(ic.getImage().getScaledInstance(169, 115, Image.SCALE_SMOOTH)));
				}
			}
		});

	}
}
