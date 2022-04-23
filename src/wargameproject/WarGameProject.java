/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wargameproject;

/**
 *
 * @author ramgu
 */
public class WarGameProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deck d = new Deck();
        for (Card card : d.Cards){
            System.out.println(card.toString());
            //System.out.println(card.getValue().getRank());
        }
    }
    
}
