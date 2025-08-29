import java.util.Scanner;

class ComplexNumber {
  public static void add(double r1, double i1, double r2, double i2) {
    double realSum = r1 + r2;
    double imgSum = i1 + i2;
    System.out.print("Sum: " + realSum);

    if (imgSum >= 0) {
      System.out.print(" + " + imgSum + "i");
    } else {
      System.out.print(" - " + imgSum + "i");
    }
  }

  public static void sub(double r1, double i1, double r2, double i2) {
    double realDiff = r1 - r2;
    double imgDiff = i1 - i2;
    System.out.print("Diff: " + realDiff);

    if (imgDiff >= 0) {
      System.out.print(" + " + imgDiff + "i");
    } else {
      System.out.print(" - " + imgDiff + "i");
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter r1: ");
    double r1 = sc.nextDouble();
    System.out.println("Enter i1: ");
    double i1 = sc.nextDouble();
    System.out.println("Enter r2: ");
    double r2 = sc.nextDouble();
    System.out.println("Enter i2: ");
    double i2 = sc.nextDouble();

    add(r1, i1, r2, i2);
    sub(r1, i1, r2, i2);
  }
}
