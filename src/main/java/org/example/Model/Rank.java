package org.example.Model;

public enum Rank {

    FIVE_OF_A_KIND,
    STRAIGHT_FLUSH,
    FOUR_OF_A_KIND,
    FULL_HOUSE,
    FLUSH;

    /**
            return "Flush";
    //5. Straight**
        if(isStraight(hand))
            return "Straight";
    // 6. Three of a kind
        if(isThreeOfAKind(hand))
            return "Three of a Kind";
    // 7. Two pair
        if(isTwoPair(hand))
            return "Two Pair";
    // 8. One pair
        if(isOnePair(hand))
            return "One Pair";
    // 9. High card
        return "High Card";

**/
}
