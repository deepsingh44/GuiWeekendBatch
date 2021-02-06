package com.deepsingh44.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JDesktopPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuExample extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuExample frame = new MenuExample();
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
	public MenuExample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 490);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 764, 22);
		contentPane.add(menuBar);

		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);

		JMenuItem mntmA = new JMenuItem("A");
		mntmA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("hello");
			}
		});
		mntmA.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		mnHome.add(mntmA);

		JMenu mnChannel = new JMenu("Channel");
		menuBar.add(mnChannel);

		JMenu mnAbout = new JMenu("About");
		menuBar.add(mnAbout);

		JMenu mnPlaylist = new JMenu("PlayList");
		menuBar.add(mnPlaylist);

		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(10, 33, 175, 407);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Home", JLabel.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(22, 11, 131, 27);
		panel.add(lblNewLabel_2);

		JLabel lblTrending = new JLabel("Trending", SwingConstants.CENTER);
		lblTrending.setForeground(Color.WHITE);
		lblTrending.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTrending.setBounds(22, 49, 131, 27);
		panel.add(lblTrending);

		JLabel lblSubscription = new JLabel("Subscription", SwingConstants.CENTER);
		lblSubscription.setForeground(Color.WHITE);
		lblSubscription.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSubscription.setBounds(22, 87, 131, 27);
		panel.add(lblSubscription);

		JLabel lblLibrary = new JLabel("Library", SwingConstants.CENTER);
		lblLibrary.setForeground(Color.WHITE);
		lblLibrary.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLibrary.setBounds(22, 125, 131, 27);
		panel.add(lblLibrary);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(195, 33, 559, 106);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setBounds(10, 11, 142, 84);
		panel_1.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Deep Singh");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 20));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(162, 11, 129, 40);
		panel_1.add(lblNewLabel_1);

		JButton btnSubscribe = new JButton("Subscribe");
		btnSubscribe.setForeground(Color.WHITE);
		btnSubscribe.setBackground(Color.RED);
		btnSubscribe.setBounds(417, 24, 121, 27);
		panel_1.add(btnSubscribe);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(195, 141, 559, 39);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		JLabel label = new JLabel("Home", SwingConstants.CENTER);

		label.setBackground(Color.BLACK);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(10, 0, 131, 27);
		panel_3.add(label);

		JLabel lblVideos = new JLabel("Videos", SwingConstants.CENTER);

		lblVideos.setForeground(Color.BLACK);
		lblVideos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVideos.setBackground(Color.BLACK);
		lblVideos.setBounds(151, 0, 131, 27);
		panel_3.add(lblVideos);

		JLabel lblPlaylist = new JLabel("Playlist", SwingConstants.CENTER);

		lblPlaylist.setForeground(Color.BLACK);
		lblPlaylist.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPlaylist.setBackground(Color.BLACK);
		lblPlaylist.setBounds(292, 0, 131, 27);
		panel_3.add(lblPlaylist);

		JLabel lblAbout = new JLabel("About", SwingConstants.CENTER);

		lblAbout.setForeground(Color.BLACK);
		lblAbout.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAbout.setBackground(Color.BLACK);
		lblAbout.setBounds(428, 0, 131, 27);
		panel_3.add(lblAbout);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(195, 170, 550, 290);
		contentPane.add(desktopPane);

		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home home = new Home();
				desktopPane.add(home);
				home.setVisible(true);
				System.out.println("home");
			}
		});

		lblVideos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Video video = new Video();
				desktopPane.add(video);
				video.setVisible(true);
				System.out.println("video");
			}
		});

		lblPlaylist.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Playlist playlist = new Playlist();
				desktopPane.add(playlist);
				playlist.setVisible(true);
				System.out.println("playlist");
			}
		});

		lblAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				About about = new About();
				desktopPane.add(about);
				about.setVisible(true);
				System.out.println("about");
			}
		});
	}
}
