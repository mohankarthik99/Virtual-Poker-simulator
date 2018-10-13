package ui;

import javax.swing.JPanel;
import keeptoo.KGradientPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;

import card.Launchgame;
import card.Model;
import card.Player;
import card.Shufler;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Playerinfo extends JPanel {
	private Pokerhome obj;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
public JPanel panel;
public KGradientPanel gradientPanel1;
private JLabel lblNewLabel_1;
private Home hm;
	public int a=10;
	private Player[] plobj=new Player[4];

public Model model;
private Shufler shuf;
private Launchgame gamer;


	/**
	 * Create the panel.
	 */
	public Playerinfo(Home ha) {
		setLayout(null);
		this.hm=ha;
		model=new Model();
		gradientPanel1 = new KGradientPanel();
		gradientPanel1.setkEndColor(new Color(255, 0, 0));
		gradientPanel1.kStartColor = new Color(0, 153, 255);
		gradientPanel1.setkStartColor(new Color(255, 51, 153));
		gradientPanel1.setBounds(0, 0, 450, 300);
		add(gradientPanel1);
		gradientPanel1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Player Information");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(74, 11, 312, 37);
		gradientPanel1.add(lblNewLabel);
		
	
		textField = new JTextField("Player 1");
		textField.setBorder(new LineBorder(new Color(0, 0, 0)));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		textField.setBounds(57, 92, 345, 34);
		gradientPanel1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField("Player 2");
		textField_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		textField_1.setBounds(57, 124, 345, 36);
		gradientPanel1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField("Player 3");
		textField_2.setBorder(new LineBorder(Color.BLACK));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		textField_2.setBounds(57, 159, 345, 36);
		gradientPanel1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField("Player 4");
		textField_3.setBorder(new LineBorder(Color.BLACK));
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		textField_3.setBounds(57, 194, 345, 34);
		gradientPanel1.add(textField_3);
		textField_3.setColumns(10);
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int i=0;
				String data;
				while(i<4) {
					shuf=new Shufler(model);
					if(i==0) {
						plobj[i]=new Player(500,textField.getText());
					}else if(i==1) {
						plobj[i]=new Player(500,textField_1.getText());

					}else if(i==2) {
						plobj[i]=new Player(500,textField_2.getText());

					}else {
						plobj[i]=new Player(500,textField_3.getText());

					}
					shuf.generateTwoCards(plobj[i]);
					i+=1;
				}
				
				model.setFive(shuf.generateFiveCards());
				
				gamer=new Launchgame(hm, model, plobj);
				
				gamer.start();
				
		

			}
		});
		btnSubmit.setEnabled(true);
		btnSubmit.setForeground(Color.BLACK);
		btnSubmit.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 16));
		btnSubmit.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnSubmit.setBackground(Color.WHITE);
		btnSubmit.setBounds(165, 239, 118, 37);
		gradientPanel1.add(btnSubmit);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 50, 450, 31);
		gradientPanel1.add(panel);
		panel.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Enter Player names");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(79, 0, 280, 31);
		panel.add(lblNewLabel_1);

	}
}
