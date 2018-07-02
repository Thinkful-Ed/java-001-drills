# Drill 4.4 Word Counter

The program reads a text file and stores the content of the file in a variable named text. There is a method named **countWords**. The countWords method accepts the text and return a count of all the unique words found in the text. However, this method is not yet written. Complete this method and add some test cases to fully test it’s functionality.

## Instructions
Clone this repository then navigate to the *4.4_word_counter/scaffolding* directory:

```
cd 4.4_word_counter/scaffolding
```

To run the code:

```
gradle run
```

and to run the tests: 

```
gradle test
```

## Solution
Counting words can be a complex task because the definition of a word is complex. Naturally we assume that words are delimited by spaces, so the sentence "Mary had a little lamb" has 5 words. But sometimes the sentence has commas, apostrophes, quotes and other punctuation marks. For instance, how many words are in the sentence "O'Brien didn't live in a state-of-the-art off-campus apartment" ?

For our purposes we will assume words can consist of alphabetic letters, digits and apostrophes. All other characters will not be counted as a word. That means the above sentence has 12 words. We are not concerned about misspellings or illegal words. So "a'b'c'd" will be counted as one word. 

**Note that this definition is arbitrary. Feel free to make your own definition then write the program to satisfy your own definiton of a word.**