package com.deepsingh44.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TableExmple extends JFrame {

	private JPanel contentPane;
	private JTextField tname;
	private JTextField troll;
	private JTextField tmarks;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableExmple frame = new TableExmple();
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
	public TableExmple() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 102));
		panel.setBounds(10, 11, 296, 336);
		contentPane.add(panel);
		panel.setLayout(null);

		tname = new JTextField();
		tname.setColumns(10);
		tname.setBounds(44, 72, 224, 34);
		panel.add(tname);

		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(44, 49, 115, 24);
		panel.add(lblName);

		JLabel lblRoll = new JLabel("Roll");
		lblRoll.setForeground(Color.WHITE);
		lblRoll.setBounds(44, 117, 115, 24);
		panel.add(lblRoll);

		troll = new JTextField();
		troll.setColumns(10);
		troll.setBounds(44, 140, 224, 34);
		panel.add(troll);

		JLabel lblMarks = new JLabel("Marks");
		lblMarks.setForeground(Color.WHITE);
		lblMarks.setBounds(44, 191, 115, 24);
		panel.add(lblMarks);

		tmarks = new JTextField();
		tmarks.setColumns(10);
		tmarks.setBounds(44, 214, 224, 34);
		panel.add(tmarks);

		JButton btnAdd = new JButton("Add");

		btnAdd.setBounds(45, 274, 89, 34);
		panel.add(btnAdd);

		JButton btnUpdate = new JButton("Update");

		btnUpdate.setBounds(168, 274, 89, 34);
		panel.add(btnUpdate);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 102));
		panel_1.setBounds(316, 11, 351, 336);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		String[] cols = { "NAME", "ROLL", "MARKS" };
		DefaultTableModel dt = new DefaultTableModel(cols, 0);
		table = new JTable(dt);

		JScrollPane jp = new JScrollPane(table);
		jp.setBounds(10, 88, 331, 237);
		panel_1.add(jp);

		// add row in table
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dd = (DefaultTableModel) table.getModel();
				String name = tname.getText();
				String roll = troll.getText();
				String marks = tmarks.getText();
				dd.addRow(new String[] { name, roll, marks });
				reset();
			}
		});

		// remove row from table
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPopupMenu pm = new JPopupMenu();
				JMenuItem mi1 = new JMenuItem("Update");
				JMenuItem mi2 = new JMenuItem("Delete");
				pm.add(mi1);
				pm.add(mi2);
				pm.show(table, e.getX(), e.getY());

				mi1.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// set data in textField
						tname.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
						troll.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
						tmarks.setText(table.getValueAt(table.getSelectedRow(), 2).toString());

					}
				});

				mi2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// delete task here
						DefaultTableModel dd = (DefaultTableModel) table.getModel();
						dd.removeRow(table.getSelectedRow());
					}
				});

			}
		});

		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// finally update code here
				DefaultTableModel dd = (DefaultTableModel) table.getModel();
				String name = tname.getText();
				String roll = troll.getText();
				String marks = tmarks.getText();
				dd.setValueAt(name, table.getSelectedRow(), 0);
				dd.setValueAt(roll, table.getSelectedRow(), 1);
				dd.setValueAt(marks, table.getSelectedRow(), 2);
			}
		});
	}

	private void reset() {
		tname.setText("");
		troll.setText("");
		tmarks.setText("");
	}
}
