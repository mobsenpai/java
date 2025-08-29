import java.util.Scanner;

class RootQ {
  private double a, b, c, d, r1, r2;

  void input(double x, double y, double z) {
    a = x;
    b = y;
    c = z;
  }

  void calD() {
    d = b * b - 4 * a * c;
  }

  void calRoot() {
    double d1 = d;
    if (d1 < 0) {
      d1 = d1 * -1;
    }

    d1 = Math.sqrt(d1);

    if (d > 0) {
      r1 = (-b + d1) / (2 * a);
      r2 = (-b - d1) / (2 * a);
    } else if (d == 0) {
      r1 = r2 = (-b) / (2 * a);
    } else {
      r1 = -b / (2 * a);
      r2 = d1 / (2 * a);
    }
  }

  void showRoot() {
    if (d > 0) {
      System.out.println("Roots are real and unequal\nr1= " + r1 + "\nr2= " + r2);
    } else if (d == 0) {
      System.out.println("Roots are real and equal r1 = r2 = " + r1);
    } else {
      System.out.println("Roots are imaginary");
      System.out.println("First root is " + r1 + " +i " + r2);
      System.out.println("Second root is " + r1 + "-i" + r2);
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of a, b and c");
    double a1 = sc.nextDouble();
    double b1 = sc.nextDouble();
    double c1 = sc.nextDouble();

    RootQ rq = new RootQ();
    rq.input(a1, b1, c1);
    rq.calD();
    rq.calRoot();
    rq.showRoot();

    sc.close();
  }
}
