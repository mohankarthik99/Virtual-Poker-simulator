package card;

import java.util.ArrayList;

public class Shufler {
ArrayList<Integer> buffer;

	public Shufler(Model model) {
		// TODO Auto-generated constructor stub
		this.buffer=model.getBuffer();

	}
	public Card[] generateFiveCards() {
		int i=0,r;
		Card crd[]=new Card[5];
		String[] result=new String[2];
		while(i<5) {
           r = generateRandom();
           if(buffer.indexOf(r)==-1) {
        	      buffer.add(r);
                  result = generateSomething(r);
                  crd[i]=new Card(result);
                  i+=1;
           }
		}
		return crd;
	}
	
	public void generateTwoCards(Player p) {
		
	       int r;
	        String[] result;
	        int z = 0;
	        while (z < 2) {
	            r= generateRandom();
	            if (buffer.indexOf(r) == -1) {
	                buffer.add(r);
	                result = generateSomething(r);
	                p.cards[z]=new Card(result);
	                z+=1;
	            }
	        }
		
	}
	
	public int generateRandom(){
        java.util.Random c=new java.util.Random();
  int random=c.nextInt(52 ) + 1;
  return random;
}
	 public String[] generateSomething(int b){
	        String result[]=new String[2];
	        String suite="";int val;
	if(b>=1 && b<=13){suite="Spade";val=b;}
	else if(b>13 && b<27){suite="Club";val=b-13;}
	else if(b>26 && b<40){suite="Heart";val=b-26;}
	else{ suite="Diamond";val=b-39;}
	result[0]=suite;
	if(val==10){result[1]="J";}
	else if(val==11){result[1]="Q";}
	else if(val==12){result[1]="K";}
	else if(val==13){result[1]="A";}
	else{result[1]= String.valueOf(val+1);};
	        return result;
	    };
}
