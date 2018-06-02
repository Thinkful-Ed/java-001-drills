package com.thinkful.drill;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

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

  public ArrayList<PlayingCard> shuffle(ArrayList<PlayingCard> deck) {
    int swapCount = 100;

    do {
      int firstRandomCardIndex = (int) (Math.random() * deck.size());
      int secondRandomCardIndex = (int) (Math.random() * deck.size());

      do {
        secondRandomCardIndex = (int) (Math.random() * deck.size());
      } while (firstRandomCardIndex == secondRandomCardIndex);

      PlayingCard firstPlayingCard = deck.get(firstRandomCardIndex);
      PlayingCard secondPlayingCard = deck.get(secondRandomCardIndex);
      deck.set(secondRandomCardIndex, firstPlayingCard);
      deck.set(firstRandomCardIndex, secondPlayingCard);

      swapCount--;
    } while (swapCount > 0);

    return deck;
  }

  public ArrayList<PlayingCard> getDeck() {
    return deck;
  }

  public void setDeck(ArrayList<PlayingCard> deck) {
    this.deck = deck;
  }


}