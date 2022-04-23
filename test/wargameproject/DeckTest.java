/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package wargameproject;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class DeckTest {
    
    public DeckTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of generatePlayerCards method, of class Deck.
     */
    @Test
    public void testGeneratePlayerCardsGood() {
        System.out.println("generatePlayerCards");
        Deck instance = new Deck();
        int c = 52;
         ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.generatePlayerCards(c);
        assertEquals(expResult, result);
      
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGeneratePlayerCardsBad() {
        System.out.println("generatePlayerCards");
        int c=0;
        Deck instance = new Deck();
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.generatePlayerCards(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
