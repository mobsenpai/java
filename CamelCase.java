import java.util.Scanner;

class CamelCase {
  String str;

  CamelCase() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    str = sc.nextLine().toLowerCase(); // toLowerCase used to show correctly

    sc.close();
  }

  public String convert() {
    String result = "";
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        int next = i + 1;
        result += Character.toUpperCase(str.charAt(next));
        i++;
      } else {
        result += str.charAt(i);
      }
    }

    return result;
  }

  public static void main(String args[]) {
    CamelCase o1 = new CamelCase();
    System.out.println(o1.convert());
  }
}
