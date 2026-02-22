import java.util.Scanner;

class ChCase {
  private String name, scase, ccase;

  ChCase() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    name = sc.nextLine();
    sc.close();
  }

  void toSentenceCase() {
    char fl = Character.toUpperCase(name.charAt(0));
    String sub = name.substring(1).toLowerCase();
    scase = fl + sub;
    System.out.println("To Sentence case: " + scase);
  }

  void toCamelCase() {
    String[] words = name.toLowerCase().split(" ");
    StringBuffer result = new StringBuffer();

    for (int i = 0; i < words.length; i++) {
      if (i == 0) {
        result.append(words[i]);
      } else {
        result.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1));
      }
    }

    ccase = result.toString();
    System.out.println("To camelCase: " + ccase);
  }

  public static void main(String[] args) {
    ChCase o1 = new ChCase();
    o1.toSentenceCase();
    o1.toCamelCase();
  }
}
