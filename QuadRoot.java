import java.util.*;

public class QuadRoot {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter coefficient a, b and c: ");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    double root = ((-b) + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    System.out.println(root);

    sc.close();
  }
}
