package org.example.Model;

import java.util.List;

public class FiveOfAKind  implements PokerRank {


    public Rank getRank(){
        return Rank.FIVE_OF_A_KIND;
    }

    @Override
    public boolean check(Hand hand) {
        List<Card> list = hand.getCards();
        boolean isJoker = list.stream().map(Card::getValue).anyMatch(VALUE.JOKER::equals);
        if(isJoker) {
            Card temp = list.get(0);
            for (Card card : list) {
                VALUE value = card.getValue();
                if((value.compare(temp.getValue())!=0) && !value.equals(VALUE.JOKER)){
                    return false;
                    }
                    return true;
                }
            }
            return false;
        }
}
