package org.example.Model;

import java.util.List;

public class StraightFlush implements PokerRank {
    @Override
    public Rank getRank() {
        return  Rank.STRAIGHT_FLUSH;
    }

    @Override
    public boolean check(Hand hand) {
        List<Card> list = hand.getCards();
        if (list.size() < 5)
            return false;
        // check cards are all the same suite:
        for (int i = 1; i < 5; i++) {
            if (list.get(i).getSuite() != list.get(i - 1).getSuite())
                return false;
            if (list.get(i).getValue().getIntegerValue() != list.get(i - 1).getValue().getIntegerValue() + 1)
                return false;
        }
        return true;
    }
}
