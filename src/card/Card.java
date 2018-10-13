package card;
public class Card {
    private String[] arr;


    public Card(String[] arr) {
        this.arr = arr;
    }

    public String getSuite() {
        return arr[0];
    }
    public int getValue(boolean swm){
        if(arr[1]=="J"){return 11;}
        else if(arr[1]=="Q"){return  12;}
        else if(arr[1]=="K"){return 13;}
        else if(arr[1]=="A"){
            return 14;
        }
        else{
            return Integer.parseInt(arr[1]);
        }
    }
    public String getValue(){
        return (arr[1]);
    }
}
