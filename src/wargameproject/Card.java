/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package wargameproject;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the
 * code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public class Card {
    //default modifier for child classes

    private final Value value;
    private final Suit suit;
    

    Card(Suit suit, Value value) {
        this.value = value;
        this.suit  = suit;
   
    }
    
    public Card(String suit, String rank) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Value getValue() {
        return this.value;
    }

    public Suit getSuit() {
        return this.suit;
    }



    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a
     * regular playing card etc.
     */
    @Override
    public String toString() {
        return this.value + " of " + this.suit;
    }

    String getRank() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int isGreater(Card get) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
