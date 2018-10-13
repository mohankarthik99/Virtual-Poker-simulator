package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;

public class Home extends JFrame {

	private JPanel contentPane;
	private static  Home hm;
	private static Playerinfo p1=new Playerinfo(hm);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hm = new Home();
					hm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(470,320);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK); 
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton button = new JButton("Play");
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				hm.setContentPane(new Playerinfo(hm).gradientPanel1);	
				hm.invalidate();
				hm.validate();
				}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 16));
		button.setFocusPainted(false);
		button.setBorder(new EmptyBorder(0, 0, 0, 0));
		button.setBackground(Color.WHITE);
		button.setBounds(284, 96, 118, 37);
		panel.add(button);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/ui/joker.jpg")));
		lblNewLabel.setBounds(10, 0, 224, 261);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Casino royale");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Poppins ExtraBold", Font.BOLD, 17));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(69, 11, 300, 26);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Kandavel-Kanishq-Mohan");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 15));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(105, 224, 239, 26);
		panel.add(lblNewLabel_2);
	}
}
