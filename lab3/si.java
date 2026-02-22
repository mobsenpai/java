import java.util.Scanner;

class Si {
  private float p, r, t;

  void input(Scanner sc) {
    System.out.print("Enter principal amount: ");
    p = sc.nextFloat();
    System.out.print("Enter rate of interest: ");
    r = sc.nextFloat();
    System.out.print("Enter time period: ");
    t = sc.nextFloat();
  }

  float calc() {
    float si = (p * r * t) / 100;
    return si;
  }

  public void print() {
    System.out.println(
        "You entered -\nPrincipal amount = "
            + p
            + "\nRate of interest = "
            + r
            + "\nTime period = "
            + t);
    System.out.println("SI = " + calc());
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Si o1 = new Si();
    o1.input(sc);
    o1.print();
  }
}
