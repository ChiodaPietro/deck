package utility;

public class Deck {
    private String[] numbers = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private String[] symbols = new String[]{"♥", "♦", "♣", "♠"};
    private Card[] deck;
    private String color;
    public Deck(String color){
        deck=createDeck();
        this.color=color;
    }
    public Card[] createDeck(){
        int pos=0;
        Card[] deck= new Card[52];
        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                deck[pos]=new Card(numbers[j],symbols[i]);
                pos++;
            }
        }
        return deck;
    }
    public Card[] shuffle(){
        for (int i = 0; i < deck.length; i++) {
            Card mem=deck[i];
            int n=(int)(Math.random()*51);
            deck[i]=deck[n];
            deck[n]=mem;
        }
        return deck;
    }
    public void outputDeck(){
        int pos=0;
        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(deck[pos].getNumber());
                System.out.println(deck[pos].getSymbol());
                pos++;
            }
        }
    }
    public Card[] getDeck(){
        return deck;
    }
}
