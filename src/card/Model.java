package card;

import java.util.ArrayList;

public class Model {
private ArrayList<Integer> buffer=new ArrayList<Integer>();
private Card[] p;
public ArrayList<Integer> getBuffer() {
	return buffer;
}
public void setFive(Card[] c) {
	this.p=c;
}
public Card[] getFive() {
	return this.p;
}


}
