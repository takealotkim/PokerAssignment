package org.example.Model;

import java.util.List;

public class Hand {

    private List<Card> cardList;

    public Hand(List<Card> cardList) throws Exception{
        if(cardList.size()<5){
            throw new Exception("less than 5 cards");
        }
        this.cardList = cardList;
    }

    public List<Card> getCards(){
        return cardList;
    }

    public Rank evaluate() throws Exception {

        for( PokerRank rank : RankFactory.rules){
            if(rank.check(this))
            return rank.getRank();
        }
        throw new Exception("no poker rule matches");
    }
}
