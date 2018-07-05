# Debug the odd summer

Consider the following program written by a novice programmer:

```java
public class Broken {
    public static void main(String[] args) {
        int[] keys = { 34, 12, 14, 17, 8, 3, 45, 56, 37, 27, 30, 19, 18, 53, 24 };
        int sum = 0;
        int count = 0;
        while (count < keys.length) {
            if (keys[count] % 2 == 0) {
            count++;
            } else {
            sum += keys[count];
            }
        }
        System.out.printf("The sum of odd numbers is %d", sum);
    }
}
```

This program compiles with no errors but behaves strangely when executed. Use the Java Debugger to identify and fix the bug in the program.
