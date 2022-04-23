/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wargameproject;

/**
 *
 * @author franc
 */
import java.util.ArrayList;
import java.util.Random;

public class Deck {
 
    static int curCard = 0;
    
    private static final int TOTAL_CARDS = 52;
    final ArrayList<Card> Cards;
    
    //initialize constructor
    public Deck() {
        this.Cards = new ArrayList<>(TOTAL_CARDS);

        for (Suit s : Suit.values()) {
            for (Value v : Value.values()) {
                Cards.add(new Card(s, v));
            }
        }
    }

    public ArrayList<Card> generatePlayerCards(int c){
        Random random = new Random();
        
        ArrayList<Card> playerCards = new ArrayList<>();
        for(int i=0; i<c; i++){
            
            int cardNum = random.nextInt(Cards.size()-1);
            
            playerCards.add(Cards.get(cardNum));
            Cards.remove(cardNum);
        }
        return playerCards;
    }
    
    /**
     *
     * @return 
     */
    public int nextCard(){
        Random random = new Random();
        int i = random.nextInt(Cards.size()-1);
        Cards.remove(i);
        return i;
        
    }
    
    public int cardsLeft(){
        return Cards.size();
    }
    

    
}
