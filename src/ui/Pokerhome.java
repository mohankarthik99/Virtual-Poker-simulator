package ui;

import javax.swing.JPanel;
import keeptoo.KGradientPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.TextField;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import javax.swing.border.LineBorder;

import card.Card;
import card.Model;
import card.Player;
import javax.swing.ImageIcon;

public class Pokerhome extends JPanel {
private Home hm;
int a;
public KGradientPanel gradientPanel;
private JSlider slider;
private JLabel lblNewLabel_1;
private JButton btnCall;
private JButton btnFold;
private JButton btnRaise;
private JButton btnCheck;
private JButton btnBet;
private Player[] obj;
private Model model;
private JLabel lblPlayer;
private JButton[] c;
private JButton button_1;
public JLabel fcard[]=new JLabel[5];


	/**
	 * Create the panel.
	 */
	public Pokerhome(Home hm,Model m,Player[] p) {
		setLayout(null);
		this.hm=hm;
		this.model=m;
		this.obj=p;
		int i=0;
		int j=0,k=0;
		
		while(i<4) {
			System.out.println(this.obj[i].getName());
			System.out.println("The two cards are"+obj[i].getCards()[0].getValue()+obj[i].getCards()[0].getSuite());
			System.out.println("The two cards are"+obj[i].getCards()[1].getValue()+obj[i].getCards()[1].getSuite());
i+=1;
		}
		i=0;
		while(i<5) {
			System.out.println(model.getFive()[i].getValue()+" "+model.getFive()[i].getSuite());
			i+=1;
		};
		
//		while(i<5) {
//while(k<4) {
//	System.out.println(this.obj[k].getName());
//	while(j<2) {
//System.out.println("Two cards are "+obj[k].getCards()[j].getValue()+" "+obj[k].getCards()[j].getSuite());
//j+=1;
//	}
//	j=0;
//	k+=1;
//}
//			System.out.print(" "+this.model.getFive()[i].getValue()+"  "+this.model.getFive()[i].getSuite()+"  ");
//			i+=1;
//		}
		
		gradientPanel = new KGradientPanel();
		gradientPanel.kStartColor = Color.BLUE;
		gradientPanel.kEndColor = Color.BLACK;
		gradientPanel.setkEndColor(Color.RED);
		gradientPanel.setkStartColor(Color.ORANGE);
		gradientPanel.setkGradientFocus(600);
		gradientPanel.setBounds(0, 0, 440, 300);
		add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Current Bet ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 17));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(27, 11, 194, 27);
		gradientPanel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("10");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(248, 12, 164, 25);
		gradientPanel.add(lblNewLabel_1);
		
		Panel panel = new Panel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 47, 451, 57);
		gradientPanel.add(panel);
		panel.setLayout(null);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 10, 68, 36);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel fcfive = new JLabel("");
		fcfive.setHorizontalAlignment(SwingConstants.CENTER);
		fcfive.setFont(new Font("Poppins SemiBold", Font.PLAIN, 11));
		fcfive.setBounds(0, 0, 68, 36);
		panel_1.add(fcfive);
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(84, 10, 84, 36);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel scfive = new JLabel("");
		scfive.setHorizontalAlignment(SwingConstants.CENTER);
		scfive.setFont(new Font("Poppins SemiBold", Font.PLAIN, 11));
		scfive.setBounds(0, 0, 84, 36);
		panel_2.add(scfive);
		
		Panel panel_3 = new Panel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(174, 10, 74, 36);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel tcfive = new JLabel("");
		tcfive.setHorizontalAlignment(SwingConstants.CENTER);
		tcfive.setFont(new Font("Poppins SemiBold", Font.PLAIN, 11));
		tcfive.setBounds(0, 0, 74, 36);
		panel_3.add(tcfive);
		
		Panel panel_4 = new Panel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(254, 10, 91, 36);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel flop = new JLabel("");
		flop.setHorizontalAlignment(SwingConstants.CENTER);
	  flop.setFont(new Font("Poppins SemiBold", Font.PLAIN, 11));
	flop.setBounds(0, 0, 91, 36);
		panel_4.add(flop);
		
		Panel panel_5 = new Panel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(351, 10, 74, 36);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel river = new JLabel("");
		river.setHorizontalAlignment(SwingConstants.CENTER);
		river.setFont(new Font("Poppins SemiBold", Font.PLAIN, 11));
		river.setBounds(0, 0, 74, 36);
		panel_5.add(river);
		
		fcard[0]=fcfive;
		fcard[1]=scfive;
		fcard[2]=tcfive;
		fcard[3]=flop;
		fcard[4]=river;


		
		
		
		JPanel changeable = new JPanel();
		changeable.setBackground(Color.WHITE);
		changeable.setBounds(0, 155, 451, 134);
		changeable.setLayout(null);
		gradientPanel.add(changeable);
		
		
		btnCall = new JButton("Call");
//		btnCall.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//		    hm.setContentPane(new ResultPane().panel);
//		    hm.invalidate();
//		    hm.validate();
//			}
//		});
		btnCall.setFocusPainted(false);
		btnCall.setForeground(Color.BLACK);
		btnCall.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 16));
		btnCall.setEnabled(true);
		btnCall.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnCall.setBackground(Color.WHITE);
		btnCall.setBounds(10, 46, 89, 23);
	changeable.add(btnCall);
	
	btnRaise = new JButton("Raise");

	btnRaise.setForeground(Color.BLACK);
	btnRaise.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 16));
	btnRaise.setFocusPainted(false);
	btnRaise.setEnabled(true);
	btnRaise.setBorder(new LineBorder(new Color(0, 0, 0)));
	btnRaise.setBackground(Color.WHITE);
	btnRaise.setBounds(119, 46, 89, 23);
	btnRaise.setEnabled(true);
	changeable.add(btnRaise);
	
	btnFold = new JButton("Fold");
	btnFold.setForeground(Color.BLACK);
	btnFold.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 16));
	btnFold.setFocusPainted(false);
	btnFold.setEnabled(true);
	btnFold.setBorder(new LineBorder(new Color(0, 0, 0)));
	btnFold.setBackground(Color.WHITE);
	btnFold.setBounds(218, 46, 89, 23);
	changeable.add(btnFold);
	
	 btnCheck = new JButton("Check");
	btnCheck.setForeground(Color.BLACK);
	btnCheck.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 16));
	btnCheck.setFocusPainted(false);
	btnCheck.setEnabled(true);
	btnCheck.setBorder(new LineBorder(new Color(0, 0, 0)));
	btnCheck.setBackground(Color.WHITE);
	btnCheck.setBounds(317, 46, 89, 23);
	changeable.add(btnCheck);
	
	 slider = new JSlider();
	slider.setBounds(0, 82, 441, 26);
	slider.setForeground(Color.WHITE);
	slider.setToolTipText("Select");
	slider.setMaximum(500);
	slider.setMinimum(100);
	slider.setBackground(new Color(0,0,0));
	slider.setPaintTrack(true);
	slider.addMouseMotionListener(new MouseMotionAdapter() {
		@Override
		public void mouseDragged(MouseEvent arg0) {
	
			String unit=" Rs ";
			lblNewLabel_1.setText(slider.getValue()+unit);
		}
	});
	changeable.add(slider);
	
	lblPlayer = new JLabel("Players turn");
	lblPlayer.setHorizontalAlignment(SwingConstants.CENTER);
	lblPlayer.setForeground(Color.BLACK);
	lblPlayer.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 17));
	lblPlayer.setBounds(113, 8, 194, 27);
	changeable.add(lblPlayer);
	
	btnBet = new JButton("Bet");
	
	btnBet.setForeground(Color.BLACK);
	btnBet.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 16));
	btnBet.setFocusPainted(false);
	btnBet.setEnabled(true);
	btnBet.setBorder(new LineBorder(new Color(0, 0, 0)));
	btnBet.setBackground(Color.WHITE);
	btnBet.setBounds(317, 12, 89, 23);
	changeable.add(btnBet);
	
 button_1 = new JButton("Reveal cards");
 button_1.addActionListener(new ActionListener() {
 	public void actionPerformed(ActionEvent e) {
 	}
 });
	

	button_1.setForeground(Color.WHITE);
	button_1.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 16));
	button_1.setFocusPainted(false);
	button_1.setEnabled(true);
	button_1.setBorder(new EmptyBorder(0, 0, 0, 0));
	button_1.setBackground(Color.BLACK);
	button_1.setBounds(0, 110, 451, 44);
	gradientPanel.add(button_1);
	
	
		

	}
	public void setSlider(int data,int bal) {
		slider.setMinimum(data);
		slider.setMaximum(bal);
	}
	public void setLabel(String data) {
		lblPlayer.setText(data);
	}
	
	public void setCall(ActionListener ac) {
		btnCall.addActionListener(ac);
	}
	public void setFold(ActionListener ac) {
		btnFold.addActionListener(ac);
	}
	public void setRaise(ActionListener ac) {
		btnRaise.addActionListener(ac);
	}
	public void setCheck(ActionListener ac) {
		btnCheck.addActionListener(ac);
	}
	public int getSlider() {
		return slider.getValue();
	}
	public void disSlider() {
		slider.setEnabled(false);
	}
	public void enSlider() {
		slider.setEnabled(true);
	}
	public JLabel[] getDispcard() {
		return fcard;
	}
	public void setSlider(int n) {
		slider.setValue(n);
	}
	public void setBet(ActionListener ac) {
		btnBet.addActionListener(ac);
	}
	public void disBet() {
		btnBet.setEnabled(false);
	}
	
	public int getMinSlider() {
		return slider.getMinimum();
	}
	public void setHold(MouseListener mc) {
		button_1.addMouseListener(mc);
	}
	public void setZero() {
		lblNewLabel_1.setText("0");
	}
	public void moveToResults(Player[] obj,Card[] crd,int pot) {
		ResultPane rs=new ResultPane(obj,crd,pot);
		hm.setContentPane(rs.panel);
		hm.invalidate();
		hm.validate();
	}
	
	
	public JButton[] getControls() {
c=new JButton[5];
		c[0]=btnCall;
		c[1]=btnRaise;
		c[2]=btnFold;
		c[3]=btnCheck;
		c[4]=button_1;
		return c;
	}
}
