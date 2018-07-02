# Password generator

Write a program that generates a password using a combination of letters, digits and punctuations. A password must follow these rules:

1. Passwords must be at least 6 characters long and at most 70.
1. Passwords must have at least one upper case letter and at least one lower case letter.
3. Passwords must contain at least one digit and one punctuation.

## How the solution works

This program relies on random numbers and uses the *java.util.Random* class to generate random integers in a range where necessary.

It also relies on the ASCII table where valid characaters fall within 33 and 126. Within that range:

 - digits are from 48 to 57
 - upper case letters are from 65 to 90 and
 - lower case letters are from 97 to 122

All other values are punctuations.

To ensure that at least one uppercase letter, one lowercase letter, one punctuation and one digit is found one of each of those groups are randomly generated first. Next the rest of the password is randomly generated. Finally the first 4 characters are shuffled into the array to ensure randomness. That is, the first character of the password should not always be an uppercase letter.