import java.util.Scanner;

class Roots {
  float x1, x2, a, b, c, d, real, img;

  Roots() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st coefficient(a): ");
    a = sc.nextFloat();
    System.out.print("Enter 2nd coefficient(b): ");
    b = sc.nextFloat();
    System.out.print("Enter 3rd coefficient(c): ");
    c = sc.nextFloat();

    d = (b * b) - (4 * a * c);

    calc();
    print();

    sc.close();
  }

  void calc() {
    if (d > 0) {
      // 2 distinct roots
      x1 = ((-b) + (float) Math.sqrt(d)) / (2 * a);
      x2 = ((-b) - (float) Math.sqrt(d)) / (2 * a);
    } else if (d == 0) {
      // both roots equal
      x1 = x2 = ((-b) + (float) Math.sqrt(d)) / (2 * a);
    } else if (d < 0) {
      // imaginary roots
      real = (-b) / (2 * a);
      img = (float) (Math.sqrt(-d)) / (2 * a);
    }
  }

  void print() {
    if (d > 0) {
      System.out.println("2 distinct roots:\nx1 = " + x1 + "\nx2 = " + x2);
    } else if (d == 0) {
      System.out.println("Equal roots:\nx1 = x2 = " + x1);
    } else if (d < 0) {
      System.out.println("Imaginary roots:");
      System.out.println("x1 = " + real + "+" + img + "i");
      System.out.println("x2 = " + real + "-" + img + "i");
    } else {
      System.out.println("Error");
    }
  }

  public static void main(String[] args) {
    Roots q1 = new Roots();
  }
}
