package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class RankFactory {

    public final static List<PokerRank> rules = new ArrayList<PokerRank>(){
        {
            add(new FiveOfAKind());
            add(new StraightFlush());

        }
    };



}
