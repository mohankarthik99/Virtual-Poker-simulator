package card;

import ui.Home;
import ui.Pokerhome;

public class Launchgame {
public  Home home;
public  Model m;
public  Player[] pl;

public Launchgame(Home h,Model m,Player[] pl){
	this.home=h;
	this.m=m;
	this.pl=pl;
}


public void start() {
	Pokerhome obj=new Pokerhome(home, m, pl);
	Controller1 c=new Controller1(pl,obj,m.getFive());
	home.setContentPane(obj.gradientPanel);
	home.invalidate();
	home.validate();
	c.startFirstRound();
}
	

}
