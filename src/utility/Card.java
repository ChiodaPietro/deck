package utility;

public class Card {
    private String number;
    private String symbol;
    public Card(String number, String symbol){
        this.number=number;
        this.symbol=symbol;
    }

    public String getNumber() {
        return number;
    }

    public String getSymbol() {
        return symbol;
    }
}
