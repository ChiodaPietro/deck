package utility;

public class Deck {
    private String[] numbers;
    private String[] symbols;
    private Card[] deck;
    public Deck(){
        numbers=new String[]{"1","2","3","4","5","6","7","8","9","10","J","Q", "K"};
        symbols= new String[]{"♥","♦","♣","♠"};
    }
    public Deck[] createDeck(){
        int pos=0;
        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                deck[pos]=new Card(numbers[j],symbols[i]);
                pos++;

            }
        }
    }
}
