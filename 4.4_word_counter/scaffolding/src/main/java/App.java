import com.thinkful.drills.WordCounter;

public class App {

  /**
   * If command line arguments are provided take the first one
   * as the file name to be loaded. Otherwise default to *words.txt*.
   */
  public static void main(String[] args) {

    String filename = "words.txt";

    if (args.length > 0) {
      filename = args[0];
    }

    WordCounter counter = new WordCounter();
    counter.go(filename);
  }
}
