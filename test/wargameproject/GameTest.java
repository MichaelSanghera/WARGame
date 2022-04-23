/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package wargameproject;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import org.junit.Test;


/**
 *
 * @author HP
 */
public class GameTest {
    
    public GameTest() {
    }
    

    /**
     * Test of gameLogic method, of class Game.
     */
    @Test
    public void testGameLogicGood() {
        System.out.println("gameLogic");
        Deck deck = new Deck();
        ArrayList<Card> cards = new ArrayList<>();
        int expResult = 1;
        int result = Game.gameLogic(cards);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGameLogicBad() {
        System.out.println("gameLogic");
        Deck deck = new Deck();
        ArrayList<Card> cards = new ArrayList<>();
        int expResult = -1;
        int result = Game.gameLogic(cards);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGameLogicBoundary() {
        System.out.println("gameLogic");
        Deck deck = new Deck();
        ArrayList<Card> cards = new ArrayList<>();
        int expResult = 1;
        int result = Game.gameLogic(cards);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of EmptyCards method, of class Game.
     */
    
    @Test
    public void testTotalPlayersGood() {
        System.out.println("Total Players");
        int totalPlayers = 4;
        String name1 = "Michael";
        String name2 = "Ram";
        String name3 = "Jasman";
        String name4 = "Mohamad";
        int Players = 4;
        boolean expResult = true;
        boolean result = Game.TotalPlayers(totalPlayers, Players);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testTotalPlayersBad() {
        System.out.println("Total Players");
        int totalPlayers = 4;
        String name1 = "Michael";
        String name2 = "Ram";
        String name3 = "Jasman";
        int Players = 3;
        boolean expResult = false;
        boolean result = Game.TotalPlayers(totalPlayers, Players);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testTotalPlayersBoundary() {
        System.out.println("Total Players");
        int totalPlayers = 4;
        String name1 = "Michael";
        String name2 = "Ram";
        String name3 = "Jasman";
        String name4 = "Mohamad";
        int Players = 4;
        boolean expResult = true;
        boolean result = Game.TotalPlayers(totalPlayers, Players);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

}
