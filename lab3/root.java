import java.util.Scanner;

class Root {
  private float x1, x2, d, a, b, c;

  void input(Scanner sc) {
    System.out.print("Enter coefficient a: ");
    a = sc.nextFloat();
    System.out.print("Enter coefficient b: ");
    b = sc.nextFloat();
    System.out.print("Enter coefficient c: ");
    c = sc.nextFloat();
  }

  void calcD() {
    d = ((b * b) - (4 * a * c));
  }

  void calcRoot() {
    calcD();

    if (d == 0) {
      x1 = x2 = (float) (-b + Math.sqrt(d)) / (2 * a);
      System.out.println("Roots are real and equal: " + x1 + " , " + x2);
    } else if (d > 0) {
      x1 = (float) (-b + Math.sqrt(d)) / (2 * a);
      x2 = (float) (-b - Math.sqrt(d)) / (2 * a);
      System.out.println("Roots are real" + x1 + ", " + x2);
    } else {
      x1 = -b / (2 * a);
      x2 = ((float) Math.sqrt(-d)) / (2 * a);
      System.out.println("Roots are imaginary: ");
      System.out.print(x1 + "+" + x2 + "i" + " , " + x1 + "-" + x2 + "i");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Root o1 = new Root();
    o1.input(sc);
    o1.calcRoot();
  }
}
