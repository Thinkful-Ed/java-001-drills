# The collatz conjecture

Consider a sequence of numbers determined as follows: start with any positive integer `n`, if `n` is even then the next term is `n/2`, and if `n` is odd the next term is `3n + 1`.  

The Collatz conjecture states that if you repeat these steps a sufficient number of times, you will always reach the number 1. 

For instance, let us start the sequence with `n = 5`. Since 5 is odd, the next term is `3 * 5 + 1 = 16`. 16 is even so the next term is `16/2 = 8`, 8 is even so the next term is `8/2 = 4` and since 4 is even the next term is `4/2 = 2`, and finally since 2 is even and `2/2 = 1` that ends the sequence. So the sequence that starts with 5 is [5, 16, 8, 4, 2, 1].

Write a program that accepts a positive integer and prints the sequence as defined above.