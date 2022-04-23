/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wargameproject;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ramgu
 */
public class Game {

    public static void main(String[] args) {

        ArrayList<Player> players = new ArrayList<>();
        int totalPlayers;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total players: ");
        totalPlayers = sc.nextInt();
        sc.nextLine();
        Deck deck = new Deck();

        for (int i = 0; i < totalPlayers; i++) {
            String name;
            System.out.println("Enter player name: ");
            name = sc.nextLine();
            Player p = new Player(name);
            p.handCards = deck.generatePlayerCards(12); // change it later and see for bound error
            players.add(p);
            //System.out.println(p.handCards.size());
        }
        sc.close();

        //for(Card card: roundCards){
        //   System.out.println(card.toString());
        //}
        //System.out.println("Hi");
        //System.out.println(players.get(winner-1).getName());
        while (players.size() != 1) {
            
            if (EmptyCards(players) == true) {
                exit(players);
                continue;
            }
            
            ArrayList<Card> roundCards = revealCards(players);
            int winner = gameLogic(roundCards);
            Player RoundWinner = players.get(winner - 1);
            RoundWinner.handCards.addAll(roundCards);

        }
        System.out.println("Winner: "+ players.get(0).getName());
        
    }

    public static ArrayList<Card> revealCards(ArrayList<Player> players) {
        ArrayList<Card> roundCard = new ArrayList<>();
        for (Player player : players) {
            roundCard.add(player.revealCard());
        }
        return roundCard;
    }

    public static int gameLogic(ArrayList<Card> cards) {
        int playerNo = 1;
        int count = 1;
        Card demo = cards.get(0);
        cards.remove(0);

        for (Card card : cards) {
            if (card.getValue().getRank() > demo.getValue().getRank()) {
                demo = card;
                count++;
                playerNo = count;
            } else {
                count++;
            }

            System.out.println("Player " + playerNo);

        }

        return playerNo;
    }

    public static boolean EmptyCards(ArrayList<Player> players) {
        for (Player player : players) {
            if (player.cardsLeft() == 0) {
                return true;
            }
        }
        return false;
    }
    
    public static void exit(ArrayList<Player> players){
        for(int i=0; i<players.size(); i++){
            if (players.get(i).cardsLeft() == 0){
                players.remove(i);
                System.out.println("Removed " + i);
        }
    }
}
    public static boolean TotalPlayers(int totalPlayers, int Players){
    if (totalPlayers == Players){ 
        return true;
    }
    else{
        return false;
    }
}
}



