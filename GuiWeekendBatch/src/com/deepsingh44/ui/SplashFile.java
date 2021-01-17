package com.deepsingh44.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class SplashFile extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SplashFile frame = new SplashFile();
	}

	/**
	 * Create the frame.
	 */
	public SplashFile() {
		LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
		/*
		 * for(int i=0;i<looks.length;i++) {
		 * System.out.println(looks[i].getClassName()); }
		 */
		try {
			UIManager.setLookAndFeel(looks[1].getClassName());
		} catch (Exception e) {
			// TODO: handle exception
		}

		setUndecorated(true);
		setTitle("SplashFile");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 102));
		contentPane.setBorder(new EmptyBorder(2, 2, 2, 2));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(SplashFile.class.getResource("/com/deepsingh44/images/layer.jpg")));
		contentPane.add(lblNewLabel, BorderLayout.CENTER);

		JProgressBar progressBar = new JProgressBar();
		progressBar.setIndeterminate(true);
		progressBar.setStringPainted(true);
		progressBar.setVisible(false);
		contentPane.add(progressBar, BorderLayout.SOUTH);
		setVisible(true);
		try {
			Thread.sleep(2000);
			progressBar.setVisible(true);
		} catch (Exception e) {
			System.out.println("Error " + e);
		}

		for (int i = 0; i <= 100; i++) {
			progressBar.setValue(i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println("Error " + e);
			}
		}

		if (progressBar.getValue() == 100) {
			new LoginFile().setVisible(true);
			dispose();
		}
	}
}
