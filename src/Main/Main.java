package Main;

import utility.Card;

public class Main {
    static String[] numbers =new String[]{"1","2","3","4","5","6","7","8","9","10","J","Q", "K"};
    static  String[] symbols = new String[]{"♥","♦","♣","♠"};
    public static void main(String[] args) {
        outputDeck(createDeck());
        outputDeck(shuffle(createDeck()));
    }
    public static Card[] shuffle(Card[] deck){
        for (int i = 0; i < deck.length; i++) {
            Card mem=deck[i];
            int n=(int)(Math.random()*51);
            deck[i]=deck[n];
            deck[n]=mem;
        }
        return deck;
    }
    public static Card[] createDeck(){
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
    public static void outputDeck(Card[] deck){
        int pos=0;
        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(deck[pos].getNumber());
                System.out.println(deck[pos].getSymbol());
                pos++;
            }
        }
    }
}
