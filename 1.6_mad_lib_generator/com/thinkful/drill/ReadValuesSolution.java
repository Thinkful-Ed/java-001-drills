package com.thinkful.drill;

import java.util.Scanner;

public class ReadValuesSolution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a name: ");
    String name = scanner.next();

    System.out.println("Please enter a first adjective: ");
    String adjectiveOne = scanner.next();

    System.out.println("Please enter a second adjective: ");
    String adjectiveTwo = scanner.next();

    System.out.println("Please enter a workplace type: ");
    String workplaceType = scanner.next();

    System.out.println("Please enter a third adjective: ");
    String adjectiveThree = scanner.next();

    System.out.println("Please enter a fourth adjective: ");
    String adjectiveFour = scanner.next();

    System.out.println("Please enter a personality characteristic: ");
    String personalityCharacteristic = scanner.next();

    System.out.println("Please enter a personality trait: ");
    String personalityTrait = scanner.next();

    System.out.println("Please enter a fifth adjective: ");
    String adjectiveFive = scanner.next();

    System.out.println("Please enter a verb: ");
    String verb = scanner.next();

    System.out.println("Please enter a pronoun: ");
    String pronoun = scanner.next();

    System.out.printf(
        "%s is a person of an %s disposition and is %s in the %s for his %s  and the %s  of his %s. "
            + "This circumstance, added to his well-known %s and %s  courage, made me very desirous to %s  %s.",
        name, adjectiveOne, adjectiveTwo, workplaceType,
        adjectiveThree, adjectiveFour, personalityCharacteristic,
        personalityTrait, adjectiveFive, verb, pronoun);
  }
}