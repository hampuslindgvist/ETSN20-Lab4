import java.io.File;
import java.util.Scanner;
import java.util.List;

public class StringSearch {

  public static void main(String[] args) {
    StringSearch stringSearch = new StringSearch();
    stringSearch.run();

  }

  public void run() {
    try (Scanner s = new Scanner(System.in)) {
      String[] input = s.nextLine().split(" ");
      String command = input[0];
      String pattern = input[1];
      String file = input[2];
      findLine(file, pattern);
    }
  }

  public void findLine(String filename, String word) {
    try {
      File file = new File(filename);
      try (Scanner reader = new Scanner(file)) {
        while (reader.hasNextLine()) {
          String data = reader.nextLine();
          if (data.contains(word)) {
            System.out.println("data " + data);
          }
        }
      }
    } catch (Exception e) {
      System.err.println("Cannot find file " + e);
    }
  }

}
