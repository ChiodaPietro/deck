package Main;

import utility.Card;
import utility.Deck;

public class Main {

    public static void main(String[] args) {
        Deck deck=new Deck("yellow");
        deck.outputDeck();
        deck.shuffle();
        deck.outputDeck();
    }
}
