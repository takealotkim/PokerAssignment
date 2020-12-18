package org.example.Model;

public enum VALUE {


    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE(14),
    JOKER(20);

    private Integer value;
    VALUE(int value) {
        this.value = value;
    }

    public int getIntegerValue(){
        return this.value;
    }

    public int compare(VALUE other) {
        if(this.value > other.value)
            return  1;
        if(this.value < other.value)
            return  -1;
        return 0;
    }
}
