# As the crow flies

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

Using this program as a starting point, write a program that uses the [Haversine Algorithm](https://www.movable-type.co.uk/scripts/latlong.html) to calculate the distance between two points on the surface of the Earth. The algorithm takes as inputs the GPS coordinates of the two points and uses the following formula to calculate distance:

<a href="https://www.codecogs.com/eqnedit.php?latex=a&space;=&space;sin(\frac{\Delta\phi}{2})^2&space;&plus;&space;cos(\phi_1)&space;*&space;cos(\phi_2)&space;*&space;sin(\frac{\Delta\lambda}{2})^2" target="_blank"><img src="https://latex.codecogs.com/gif.latex?a&space;=&space;sin(\frac{\Delta\phi}{2})^2&space;&plus;&space;cos(\phi_1)&space;*&space;cos(\phi_2)&space;*&space;sin(\frac{\Delta\lambda}{2})^2" title="a = sin(\frac{\Delta\phi}{2})^2 + cos(\phi_1) * cos(\phi_2) * sin(\frac{\Delta\lambda}{2})^2" /></a> 

<a href="https://www.codecogs.com/eqnedit.php?latex=c&space;=&space;2&space;*&space;atan2(\sqrt{a},&space;\sqrt{(1&space;-&space;a)})" target="_blank"><img src="https://latex.codecogs.com/gif.latex?c&space;=&space;2&space;*&space;atan2(\sqrt{a},&space;\sqrt{(1&space;-&space;a)})" title="c = 2 * atan2(\sqrt{a}, \sqrt{(1 - a)})" /></a>

<a href="https://www.codecogs.com/eqnedit.php?latex=d&space;=&space;R&space;*&space;c" target="_blank"><img src="https://latex.codecogs.com/gif.latex?d&space;=&space;R&space;*&space;c" title="d = R * c" /></a>

where <a href="https://www.codecogs.com/eqnedit.php?latex=\phi" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\phi" title="\phi" /></a> is latitude, <a href="https://www.codecogs.com/eqnedit.php?latex=\lambda" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\lambda" title="\lambda" /></a> is longitude, R is the earth’s radius (mean radius = 6,371km), <a href="https://www.codecogs.com/eqnedit.php?latex=\Delta\phi" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\Delta\phi" title="\Delta\phi" /></a> is the difference between the latitudes of the two points and <a href="https://www.codecogs.com/eqnedit.php?latex=\Delta\lambda" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\Delta\lambda" title="\Delta\lambda" /></a> is the difference between the  longitudes of the two points.

You can use Google maps to find the coordinates of any point on the surface of the earth to test your program. For instance Thinkful HQ in New York is located approximately at 40.725156, -73.996813  and The Gathering Spot in Atlanta is located approximately at 33.767696, -84.400956. The distance as the crow flies between these two places is 1201 km. Remember that these coordinates are given in degrees so you need to convert them to radians for the trigonometric formulas in Java to work.

Hint: Use the Java docs to look up java.lang.Math.