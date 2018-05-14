package com.thinkful.drill;

import java.util.ArrayList;
import java.util.Comparator;

public class Deck {

  private ArrayList<PlayingCard> deck;

  private Comparator<PlayingCard> bySuite = (PlayingCard a, PlayingCard b) -> a.getSuite()
      .compareTo(b.getSuite());
  private Comparator<PlayingCard> byValue = (PlayingCard a, PlayingCard b) -> a.getNumber()
      .compareTo(b.getNumber());

  public void sortByNumber() {
    this.deck.sort(byValue);
  }

  public void sortBySuite() {
    this.deck.sort(bySuite);
  }

  public ArrayList<PlayingCard> getDeck() {
    return deck;
  }

  public void setDeck(ArrayList<PlayingCard> deck) {
    this.deck = deck;
  }


}