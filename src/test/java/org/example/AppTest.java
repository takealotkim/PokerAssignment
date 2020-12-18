package org.example;

import static org.junit.Assert.assertTrue;

import org.example.Model.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerFiveOfAKind()
    {
        String input = "";
        List<Card> list = new ArrayList<Card>(){
        {
            //  String input = "AS,AC,AH,AD,J";
            add(new Card(VALUE.FIVE, SUITE.CLUB));
            add(new Card(VALUE.FIVE, SUITE.HEART));
            add(new Card(VALUE.FIVE, SUITE.SPADE));
            add(new Card(VALUE.FIVE, SUITE.DIAMOND));
            add(new Card(VALUE.JOKER, SUITE.DIAMOND));
        }
    };

        boolean isFiveOfAKind = false;
        try {
            Hand hand = new Hand(list);

            FiveOfAKind fiveOfAKind = new FiveOfAKind();
            if( fiveOfAKind.check(hand) )
                isFiveOfAKind = true;

        }catch (Exception E){
            // do nothing
        }

        assertTrue( isFiveOfAKind  );
    }
}
