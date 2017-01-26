package DSBot;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class GUI_Main extends JFrame {

	private JPanel contentPane;
	private JTextField txtBenutzername;
	private JTextField txtPasswort;
	private JTextField txtPunocchio;
	private JTextField txtotaner;
	private JButton btnfinish;
	private JButton btnLogin;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Main frame = new GUI_Main();
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
	public GUI_Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_AddAccount = new JPanel();
		panel_AddAccount.setBounds(10, 34, 237, 100);
		panel_AddAccount.setVisible(false);
		contentPane.add(panel_AddAccount);
		panel_AddAccount.setLayout(null);
		
		JButton btnAddAccount = new JButton("Add Account");
		btnAddAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_AddAccount.setVisible(true);
			}
		});
		btnAddAccount.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnAddAccount.setBounds(10, 11, 89, 23);
		contentPane.add(btnAddAccount);
		
		
		txtBenutzername = new JTextField();
		txtBenutzername.setBounds(10, 11, 86, 20);
		txtBenutzername.setText("Benutzername:");
		panel_AddAccount.add(txtBenutzername);
		txtBenutzername.setColumns(10);
		
		txtPasswort = new JTextField();
		txtPasswort.setText("Passwort:");
		txtPasswort.setBounds(10, 36, 86, 20);
		panel_AddAccount.add(txtPasswort);
		txtPasswort.setColumns(10);
		
		txtPunocchio = new JTextField();
		txtPunocchio.setText("Punocchio");
		txtPunocchio.setBounds(102, 11, 124, 20);
		panel_AddAccount.add(txtPunocchio);
		txtPunocchio.setColumns(10);
		
		txtotaner = new JTextField();
		txtotaner.setText("811Otaner");
		txtotaner.setBounds(102, 36, 124, 20);
		panel_AddAccount.add(txtotaner);
		txtotaner.setColumns(10);
		
		btnfinish = new JButton("finish");
		btnfinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_AddAccount.setVisible(false);
			}
		});
		btnfinish.setBounds(10, 67, 216, 23);
		panel_AddAccount.add(btnfinish);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("webdriver.gecko.driver", "C:/Users/Renato Farruggio/Documents/Java Stuff/geckodriver.exe");
				Website website = new Website();
				website.login();
				
			}
		});
		btnLogin.setBounds(109, 11, 89, 23);
		contentPane.add(btnLogin);
		
		table = new JTable();
		table.setBounds(10, 145, 414, 105);
		contentPane.add(table);
	}
}
