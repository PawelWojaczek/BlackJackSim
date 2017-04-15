package com.blackjacksim;


public class Card extends Deck{
    String suit,rank;
    int weight;

    public Card(String suit, String rank,int weight) {
        this.suit = suit;
        this.rank = rank;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return rank+ " of " + suit;
    }
}
