# Smallest change maker

Consider the following program. It demonstrates how the user may be prompted for a value and how that value may be read into a variable.

  
```java
import java.util.Scanner;
/**
    * Prompts the user for a value and reads the value
    * from the command line.
    * 
    * More information about the Scanner may be found
    * here: https://docs.oracle.com/javase/10/docs/api/java/util/Scanner.html
    */
public class ReadValues {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Ask user for a String value
        System.out.println("Please enter your name: ");
        //read the String value into a variable
        String name = scanner.next();
        //print out the value
        System.out.printf("Hello %s\n", name);
        //Ask for a numeric value
        System.out.println("Please tell us your age:");
        // read the age
        int age = scanner.nextInt();
        //print the age
        System.out.printf("Holy Moly! %d is old!\n", age);
    }
}
```

Using this program as a starting point, write a program that asks the user for an amount of money in dollars and cents then print out the smallest number of bills and coins to make that amount.

## Solution

The solution uses the integer arithmetic operators of modulus (%) and division (/). Given 37 cents for instance, you can calculate the number of quarters using 37 / 25 = 1. Note that with integer division the fractional part of the answer is truncated. To find the amount of cents left after you take out the quarters use 37 % 25 = 12. That is, 37 divided by 25 leaves a remainder of 12.