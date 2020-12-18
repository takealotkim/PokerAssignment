package org.example.Model;

public class Card {

    private final VALUE value;
    private final SUITE suite;

    public Card(VALUE value, SUITE suite){
        this.suite = suite;
        this.value = value;
    }

    public VALUE getValue(){
        return this.value;
    }

    public SUITE getSuite(){
        return this.suite;
    }


}
