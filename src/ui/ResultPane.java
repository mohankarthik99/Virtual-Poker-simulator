package ui;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import card.Card;
import card.Player;

import java.awt.Panel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ResultPane extends JPanel {
	
public JPanel panel;
private Player[] pl;
private Card[] crd;
public int pot=0;
public JLabel player1;
public JLabel player2;
public JLabel player3;
public JLabel player4;
	/**
	 * Create the panel.
	 */
	public ResultPane(Player[] obj,Card[] crd,int pot) {
		setBackground(Color.RED);
		setLayout(null);
		this.pl=obj;
		this.crd=crd;
		this.pot=pot;
		 panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 11, 451, 278);
		add(panel);
		panel.setLayout(null);
		
		JRadioButton pl1 = new JRadioButton("mohanskaaa");
		pl1.setFont(new Font("Poppins SemiBold", Font.PLAIN, 12));
		pl1.setBackground(new Color(255,255,255));

		pl1.setBounds(6, 83, 109, 23);
		panel.add(pl1);
		
		JLabel p1label = new JLabel("Jspade,Q hearts");
		p1label.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 11));
		p1label.setBounds(6, 113, 131, 28);
		panel.add(p1label);
		
		JLabel pl2label = new JLabel("Jspade,Q hearts");
		pl2label.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 11));
		pl2label.setBounds(156, 113, 131, 28);
		panel.add(pl2label);
		
		JLabel pl3label = new JLabel("Jspade,Q hearts");
		pl3label.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 11));
		pl3label.setBounds(297, 113, 131, 28);
		panel.add(pl3label);
		
		JLabel pl4label = new JLabel("Jspade,Q hearts");
		pl4label.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 11));
		pl4label.setBounds(156, 151, 131, 28);
		panel.add(pl4label);
		
	
		
		JRadioButton pl2 = new JRadioButton("fnkdfj");
		pl2.setFont(new Font("Poppins SemiBold", Font.PLAIN, 12));
		pl2.setBounds(117, 83, 109, 23);
		pl2.setBackground(new Color(255,255,255));
		panel.add(pl2);
		
		JRadioButton pl3 = new JRadioButton("mohanskaaa");
		pl3.setFont(new Font("Poppins SemiBold", Font.PLAIN, 12));
		pl3.setBackground(new Color(255,255,255));


		pl3.setBounds(228, 83, 109, 23);
		panel.add(pl3);
		
		JRadioButton pl4 = new JRadioButton("mohanskaaa");
		pl4.setFont(new Font("Poppins SemiBold", Font.PLAIN, 12));
		pl4.setBackground(new Color(255,255,255));

		pl4.setBounds(339, 83, 109, 23);
		panel.add(pl4);
		
		Panel panel_1 = new Panel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 20, 451, 57);
		panel.add(panel_1);
		
		Panel panel_2 = new Panel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.RED);
		panel_2.setBounds(10, 10, 68, 36);
		panel_1.add(panel_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Poppins SemiBold", Font.PLAIN, 11));
		label_3.setBounds(0, 11, 68, 14);
		panel_2.add(label_3);
		
		Panel panel_3 = new Panel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.RED);
		panel_3.setBounds(84, 10, 84, 36);
		panel_1.add(panel_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Poppins SemiBold", Font.PLAIN, 11));
		label_4.setBounds(0, 11, 84, 14);
		panel_3.add(label_4);
		
		Panel panel_4 = new Panel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.RED);
		panel_4.setBounds(174, 10, 74, 36);
		panel_1.add(panel_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Poppins SemiBold", Font.PLAIN, 11));
		label_5.setBounds(0, 11, 74, 14);
		panel_4.add(label_5);
		
		Panel panel_5 = new Panel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.RED);
		panel_5.setBounds(254, 10, 91, 36);
		panel_1.add(panel_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Poppins SemiBold", Font.PLAIN, 11));
		label_6.setBounds(0, 11, 91, 14);
		panel_5.add(label_6);
		
		Panel panel_6 = new Panel();
		panel_6.setLayout(null);
		panel_6.setBackground(Color.RED);
		panel_6.setBounds(351, 10, 74, 36);
		panel_1.add(panel_6);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Poppins SemiBold", Font.PLAIN, 11));
		label_7.setBounds(0, 11, 74, 14);
		panel_6.add(label_7);
		
		 player1 = new JLabel("");
		player1.setBounds(16, 238, 56, 29);
		panel.add(player1);
		
		 player2=new JLabel("");
		player2.setBounds(114, 238, 98, 31);
		panel.add(player2);
		
	 player3 = new JLabel("");
		player3.setBounds(228, 238, 81, 29);
		panel.add(player3);
		
		player4 = new JLabel("");
		player4.setBounds(351, 238, 77, 29);
		panel.add(player4);
		p1label.setText(obj[0].getCards()[0].getValue()+"  "+obj[0].getCards()[0].getSuite()+" , "+obj[0].getCards()[1].getValue()+"  "+obj[0].getCards()[1].getSuite());
		pl2label.setText(obj[1].getCards()[0].getValue()+"  "+obj[1].getCards()[0].getSuite()+" , "+obj[1].getCards()[1].getValue()+"  "+obj[1].getCards()[1].getSuite());
		pl3label.setText(obj[2].getCards()[0].getValue()+"  "+obj[2].getCards()[0].getSuite()+" , "+obj[2].getCards()[1].getValue()+"  "+obj[2].getCards()[1].getSuite());
		pl4label.setText(obj[3].getCards()[0].getValue()+"  "+obj[3].getCards()[0].getSuite()+" , "+obj[3].getCards()[1].getValue()+"  "+obj[3].getCards()[1].getSuite());
		
		
		label_3.setText(crd[0].getValue()+" "+crd[0].getSuite());
		label_4.setText(crd[1].getValue()+" "+crd[1].getSuite());
		label_5.setText(crd[2].getValue()+" "+crd[2].getSuite());
		label_6.setText(crd[3].getValue()+" "+crd[3].getSuite());
		label_7.setText(crd[4].getValue()+" "+crd[4].getSuite());

		
		pl1.setText(obj[0].getName());			
		pl2.setText(obj[1].getName());
		pl3.setText(obj[2].getName());
		pl4.setText(obj[3].getName());
		
		for(int i=0;i<obj.length;i++) {
			if(obj[i].isIngame()==false) {
				if(i==0) {
					pl1.setEnabled(false);
					p1label.setText(" ");
				}else if(i==1) {
					pl2.setEnabled(false);
					pl2label.setText("");
				}else if(i==2) {
					pl3.setEnabled(false);
					pl3label.setText("");
				}else {
					pl4.setEnabled(false);
					pl4label.setText("");
				}
			}

		}
		int subpot=pot;
		JButton btnDeclareWinners = new JButton("Declare Winners !");
		btnDeclareWinners.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int pot=subpot;
				int k=1;
ArrayList<Player> result=new ArrayList<Player>();
				
					if(obj[0].isIngame()==true && (pl1.isSelected())) {
						result.add(obj[0]);
						k+=1;
					}else if(obj[1].isIngame()==true && (pl2.isSelected())) {
						result.add(obj[1]);
						k+=1;
					}else if(obj[2].isIngame()==true && (pl2.isSelected())) {
						result.add(obj[2]);
						k+=1;
					}else if(obj[3].isIngame()==true && (pl3.isSelected())) {
						result.add(obj[3]);
						k+=1;
					}
			       pot=pot/k;
			       for(int i=0;i<result.size();i++) {
			    	   result.get(i).setBal(pot);
			       }
			    	   player1.setText(obj[0].getBal()+"");
			    	   player2.setText(obj[1].getBal()+"");
			    	   player3.setText(obj[2].getBal()+"");
			    	   player4.setText(obj[3].getBal()+"");

			       
					
				
			}
		});
		btnDeclareWinners.setForeground(Color.BLACK);
		btnDeclareWinners.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 16));
		btnDeclareWinners.setFocusPainted(false);
		btnDeclareWinners.setEnabled(true);
		btnDeclareWinners.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnDeclareWinners.setBackground(Color.WHITE);
		btnDeclareWinners.setBounds(6, 190, 448, 37);
		panel.add(btnDeclareWinners);
		
		
			
			


       

	}
}
