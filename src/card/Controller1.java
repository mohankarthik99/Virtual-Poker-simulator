package card;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import ui.Pokerhome;

public class Controller1 {
    private Model m;
    private Pokerhome v;
    Player[] obj;
    private int present = 0;
    private int pot = 0;
    private Card[] card;
    private JLabel[] disp;
    private int i = 0;
    private JButton[] controls;
    int rounds=0;


   
    public Controller1(Player[] obj, Pokerhome v,Card[] c) {
        this.v = v;
        this.obj=obj;
        this.card=c;
        this.disp=v.getDispcard();
        this.controls=this.v.getControls();
        this.v.setCall(new Calis());
        this.v.setRaise(new Raiselis());
        this.v.setCheck(new Checklis());
        this.v.setFold(new Foldlis());
        this.v.setBet(new betLis());
        this.v.setHold(new Mouser());
        System.out.println("Controllers fine");
    }
    public void resetPresent() {
        this.present = 0;
    }

    public int getPresent() {
        return present;
    }

    public void updatePot(int n) {
        this.pot = this.pot + n;
    }

    public void resetPot() {
        this.pot = 0;
    }
    public void setImage(JLabel lab,String a,String val) {
    	String paths[]= {"/ui/spade.png","/ui/like.png","/ui/diamond.png","/ui/clubs.png"};
    	if(a.equals("Spade")) {
    		lab.setIcon(new ImageIcon(Pokerhome.class.getResource(paths[0])));
    		lab.setText(val);
    	}else if(a.equals("Diamond")) {
    		lab.setIcon(new ImageIcon(Pokerhome.class.getResource(paths[2])));
    		lab.setText(val);

    	}else if(a.equals("Club")) {
    		lab.setIcon(new ImageIcon(Pokerhome.class.getResource(paths[3])));
    		lab.setText(val);

    	}else if(a.equals("Heart")) {
    		lab.setIcon(new ImageIcon(Pokerhome.class.getResource(paths[1])));
    		lab.setText(val);

    	}
    }

    //v.setLabel(data)  -- for setting current bet amount
    
//v.setSlider(min,max)  -- for accessing slider
    //v.getSlider();
    class Calis implements ActionListener {
    	int slideVal;
        @Override
        public void actionPerformed(ActionEvent arg0) {
            // TODO Auto-generated method stub
            if ((obj[present].isIngame()) && (obj[present].isInround())) {
                slideVal = v.getSlider();
                if (slideVal >= obj[present].getBal())
                    obj[present].setInround(false);
                if (slideVal <= obj[present].getBal()) {
                    if (!obj[present].isPotVisited()) {
                        obj[present].setBal((-slideVal));
                        obj[present].setContribution(slideVal);
                        updatePot(slideVal);
                        obj[present].setPotVisited(true);
                    } else {
                        int val = slideVal - obj[present].getContribution();
                        obj[present].setBal(val);
                        obj[present].setContribution(slideVal);
                        updatePot(val);
                    }
                }
                do {
              	  if (present == 3)
                        present = 0;
                    else
                   
                        present++;
              }while(!obj[present].isIngame());
                v.setLabel(obj[present].getName());
                v.setSlider(slideVal, obj[present].getBal());
                if (obj[present].isHeadElement()) {             //this signifies end of round
                    v.setSlider(0, obj[present].getBal());
                    for (int i = 0; i < 4; i++) {
                        obj[i].setContribution(0);
                        obj[i].setPotVisited(false);
                        obj[i].setHeadElement(false);
                        
                    }
                    rounds+=1;
                    revealCard();
                }
            } else {
                do {
              	  if (present == 3)
                        present = 0;
                    else
                   
                        present++;
              }while(!obj[present].isIngame());
                if (obj[present].isHeadElement()) {             //this signifies end of round
                    v.setSlider(0, obj[present].getBal());
                    for (int i = 0; i < 4; i++) {
                        obj[i].setContribution(0);
                        obj[i].setPotVisited(false);
                        obj[i].setHeadElement(false);
                        
                    }
                    rounds+=1;
                    revealCard();
                }
                else {
                v.setLabel(obj[present].getName());
                v.setSlider(slideVal, obj[present].getBal());
                }
            }

        }
    }

        class Raiselis implements ActionListener {
        	 int slideVal;
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if ((obj[present].isIngame()) && (obj[present].isInround())) {
                    slideVal = v.getSlider();
                    if (slideVal == obj[present].getBal())
                        obj[present].setInround(false);
                    obj[present].setHeadElement(true);
                    int i = 0;
                    while (i < 4) {
                        if (i != present)
                            obj[i].setHeadElement(false);
                        i++;
                    }
                    if (!obj[present].isPotVisited()) {
                        obj[present].setBal((-slideVal));
                        obj[present].setContribution(slideVal);
                        updatePot(slideVal);
                        obj[present].setPotVisited(true);

                    } else {
                        int val = slideVal - obj[present].getContribution();
                        obj[present].setBal(val);
                        obj[present].setContribution(slideVal);
                        updatePot(val);

                    }
                    do {
                  	  if (present == 3)
                            present = 0;
                        else
                       
                            present++;
                  }while(!obj[present].isIngame());
                    v.setLabel(obj[present].getName());
                    v.setSlider(slideVal, obj[present].getBal());

                } else {
                    do {
                  	  if (present == 3)
                            present = 0;
                        else
                       
                            present++;
                  }while(!obj[present].isIngame());
                    v.setLabel(obj[present].getName());
                    v.setSlider(slideVal, obj[present].getBal());
                }


            }

        }

        class Checklis implements ActionListener {
int slideVal;
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if ((obj[present].isIngame()) && (obj[present].isInround())) {
                    slideVal = v.getSlider();
                    if (slideVal == 0) {
                        obj[present].setHeadElement(true);
                        do {
                      	  if (present == 3)
                                present = 0;
                            else
                           
                                present++;
                      }while(!obj[present].isIngame());
                        v.setLabel(obj[present].getName());
                        v.setSlider(slideVal, obj[present].getBal());
                        if (obj[present].isHeadElement())           //this signifies end of round
                        {
                            v.setSlider(0, obj[present].getBal());
                            for (int i = 0; i < 4; i++) {
                                obj[i].setContribution(0);
                                obj[i].setPotVisited(false);
                                obj[i].setHeadElement(false);
                            }
                   rounds+=1;
                   revealCard();
                        }
                    }
                }
                else {
                    do {
                  	  if (present == 3)
                            present = 0;
                        else
                       
                            present++;
                  }while(!obj[present].isIngame());
                     if (obj[present].isHeadElement()) {             //this signifies end of round
                         v.setSlider(0, obj[present].getBal());
                         for (int i = 0; i < 4; i++) {
                             obj[i].setContribution(0);
                             obj[i].setPotVisited(false);
                             obj[i].setHeadElement(false);
                             
                         }
                         rounds+=1;
                         revealCard();
                     v.setLabel(obj[present].getName());
                     v.setSlider(slideVal, obj[present].getBal());
                    }
                }

            }

        }

        class Foldlis implements ActionListener {
int slideVal;
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
            	
                if ((obj[present].isIngame()) && (obj[present].isInround())) {
                	System.out.println("hit");
 
                    obj[present].setIngame(false);
                    obj[present].setInround(false);
                    System.out.println(obj[present].isIngame());
                    System.out.println(obj[present].isInround());
                    obj[present].setContribution(0);
                    obj[present].setPotVisited(false);
                    obj[present].setHeadElement(false);

                    do {
                    	  if (present == 3)
                              present = 0;
                          else
                         
                              present++;
                    }while(!obj[present].isIngame());
                  
                    v.setLabel(obj[present].getName());
                    
                    v.setSlider(slideVal, obj[present].getBal());
                    if (obj[present].isHeadElement()) {        
                    	
                    	//this signifies end of round
                        v.setSlider(0, obj[present].getBal());            //
                        for (int i = 0; i < 4; i++) {
                            obj[i].setContribution(0);
                            obj[i].setPotVisited(false);
                            obj[i].setHeadElement(false);                  //
                        }
                        rounds+=1;
                   
                        revealCard();                    }
                }
                else {
                	System.out.println("hitter");
                    do {
                  	  if (present == 3)
                            present = 0;
                        else
                       
                            present++;
                  }while(!obj[present].isIngame());
                    System.out.println(obj[present].getName()+" djhfjd");
                    v.setLabel(obj[present].getName());
                    v.setSlider(slideVal, obj[present].getBal());
                    if (obj[present].isHeadElement())          //this signifies end of round
                    {
                        v.setSlider(0, obj[present].getBal());
                        for (int i = 0; i < 4; i++) {
                            obj[i].setContribution(0);
                            obj[i].setPotVisited(false);
                            obj[i].setHeadElement(false);
                        }
                        rounds+=1;
                        revealCard();
                    }
                }

            }
        }
        public void startFirstRound() {
        	v.setLabel(obj[present].getName());
        	for(int i=0;i<4;i++) {
        		controls[i].setEnabled(false);
        	}
        	v.setSlider(10);
        	v.disSlider();        }
        
        public void revealCard() {
        	this.v.setZero();
        	this.v.setSlider(0);
        	System.out.println("Called reveal"+rounds);

        	if(rounds==2) {
           	 setImage(disp[3],card[3].getSuite(),card[3].getValue());
        	}else if(rounds==3) {
              	 setImage(disp[4],card[4].getSuite(),card[4].getValue());

        	}else {
        		v.moveToResults(obj, card,pot);
        	}
        }
        
        public void reveal3cards() {
        	this.v.setSlider(0);
        	this.v.setZero();
        	System.out.println("Called reveal 3");
         int i=0;
         while(i<3) {
        	 setImage(disp[i],card[i].getSuite(),card[i].getValue());
        	 i+=1;
         }
        }
        
        class betLis implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				obj[present].setBal(-10);
				updatePot(10);
				if(present==3) {
					present=0;
				 	for(int i=0;i<4;i++) {
		        		controls[i].setEnabled(true);
		        	}
		        	v.enSlider();	
                    v.setSlider(0, obj[present].getBal());  
                    v.setSlider(0);
		        	v.disBet();
		        	rounds+=1;
					v.setLabel(obj[present].getName());
		        	reveal3cards();
				}else {
					v.setLabel(obj[present+1].getName());
					present++;

				}
				
			}
        	
        }
        class Mouser implements MouseListener{

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				controls[4].setBackground(new Color(255,255,255));
				controls[4].setIcon(new ImageIcon(Pokerhome.class.getResource("/ui/spade.png")));
				controls[4].setText(obj[present].cards[0].getValue()+" "+obj[present].cards[0].getSuite()+"  "+obj[present].cards[1].getValue()+" "+obj[present].cards[1].getSuite());
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				controls[4].setBackground(new Color(0,0,0));
				controls[4].setText("Reveal Player cards");
			}
        	
        }
    }
 

    

