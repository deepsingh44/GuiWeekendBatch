package com.deepsingh44.ui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Video extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Video frame = new Video();
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
	public Video() {
		setTitle("Video Page");
		setIconifiable(true);
		setClosable(true);
		setBounds(10, 10, 450, 300);

	}

}
