package card;
public class Player implements Cloneable{
    Card cards[]=new Card[2];
    public Card[] getCards() {
        return cards;
    }

    public String getName() {
        return name;
    }

 

    private String name;
    private int bal;
    private boolean Ingame = true;
    private boolean Inround = true;
    

    public int getContribution() {
        return contribution;
    }

    public void setContribution(int contribution) {
        this.contribution = contribution;
    }
    public void setBal(int balance) {
    	this.bal+=balance;
    }

    private int contribution;

    public boolean isPotVisited() {
        return potVisited;
    }

    public void setPotVisited(boolean potVisited) {
        this.potVisited = potVisited;
    }

    private boolean potVisited = false;

    public boolean isHeadElement() {
        return headElment;
    }

    public void setHeadElement(boolean headElment) {
        this.headElment = headElment;
    }

    private boolean headElment = false;

    public boolean isInround() {
        return Inround;
    }

    public void setInround(boolean inround) {
        Inround = inround;
    }


    public boolean isIngame() {
        return Ingame;
    }

    public void setIngame(boolean ingame) {
        Ingame = ingame;
    }


    public Player(int bal,String name) {
        this.bal = bal;
        this.name=name;
        this.Ingame = true;
        this.Inround = true;
    }

    public int getBal() {
        return bal;
    }

    Player cloneIt()
    {
        try
        {
            return (Player)super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            System.out.println("Unable to clone.");
            return this;
        }
    }
}

