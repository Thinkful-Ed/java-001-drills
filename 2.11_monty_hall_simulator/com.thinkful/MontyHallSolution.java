package com.thinkful;

public class MontyHallSolution {

  /**
   * Check out: http://mathworld.wolfram.com/MontyHallProblem.html
   */

  private static int hostChooses(int playerChoice, int grandPrize) {
    int hostChoice = (int) Math.floor(Math.random() * Math.floor(3));
    while (hostChoice == playerChoice || hostChoice == grandPrize) {
      hostChoice = (int) Math.floor(Math.random() * Math.floor(3));
    }
    return hostChoice;
  }

  private static int playerSwitches(int originalPlayerChoice, int hostChoice) {
    int playerChoice = (int) Math.floor(Math.random() * Math.floor(3));
    while (playerChoice == hostChoice || playerChoice == originalPlayerChoice) {
      playerChoice = (int) Math.floor(Math.random() * Math.floor(3));
    }
    return playerChoice;
  }

  private static void runTrial(int trials, boolean switched) {
    int playerCorrect = 0;
    int originalTrials = trials;

    do {
      int grandPrize = (int) Math.floor(Math.random() * Math.floor(3));
      int playerChoice = (int) Math.floor(Math.random() * Math.floor(3));
      int hostChoice = hostChooses(playerChoice, grandPrize);
      if (switched) playerChoice = playerSwitches(playerChoice, hostChoice);
      if (playerChoice == grandPrize) playerCorrect++;
      trials--;
    } while (trials > 0);

    System.out.printf("%d trials completed - the player got the answer correct %d many times %s \n",
        originalTrials, playerCorrect, (switched) ? "switching doors" : "not switching doors");
  }

  public static void main(String[] args) {
    runTrial(30, false);
    runTrial(30, true);
    runTrial(100, false);
    runTrial(100, true);
    runTrial(1000, false);
    runTrial(1000, true);
    runTrial(10000, false);
    runTrial(10000, true);
  }
}
