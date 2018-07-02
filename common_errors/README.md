
# Common Errors

Consider the following program:
    
```java
import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.next();
        System.out.printf("Hello %s, very nice to meet you!", name);    
    }
}
```

Type up, compile and execute this program to see what it does. Now make the following changes one at a time and attempt to compile and run the program again.

For each edit, state which error occurred, determine if it is a compile time or runtime error, and explain why that change caused the error. If no error occurred, explain why the edit did not cause an error.

1. Change the word “String” on line 4 to “string”
1. Change the word “public” on line 3 to “Public”
1. Change the word “Hello” on line 8 to “hello”.
1. Change the ‘%s’ on line 8 to ‘%d’.
1. Move the open curly brace at the end of line 4 to the beginning of line 5.
1. Change the word “println” on line 6 to “print”.
1. Remove the square brackets on line 4.
