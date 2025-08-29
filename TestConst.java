import java.util.Scanner;

public class TestConst {
  int a, b;
  Scanner sc = new Scanner(System.in);

  TestConst() {} // no arguments

  TestConst(int x, int y) {
    a = x;
    b = y;
  }

  void input() {
    System.out.println("Enter length and breadth: ");
    a = sc.nextInt();
    b = sc.nextInt();
  }

  int area() {
    return 2 * (a + b);
  }

  void print() {
    System.out.println("AREA: " + area());
  }

  public static void main(String args[]) {
    TestConst o1 = new TestConst();
    o1.input();
    o1.print();

    TestConst o2 = new TestConst(4, 2);
    o2.print();
  }
}
