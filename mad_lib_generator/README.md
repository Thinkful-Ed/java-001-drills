# 1.6 Mad lib generator

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

Using this program as a starting point, write a program to prompt the user for the following values:

- A person’s name or title
- 5 adjectives
- a workplace type
- a personal characteristic
- a personality trait
- a verb
- the third person pronoun to refer to the person (i.e., he, she, them).

Use the values provided to complete and print the following sentence:

> {Name} is a person of an {adjective1} disposition and is {adjective2} in the {Workplace_Type} for his {adjective3} and the {adjective4} of his {Personal_Characteristic}. This circumstance, added to his well-known {Personality_trait} and {adjective5} courage, made me very desirous to {verb} {pronoun}.

