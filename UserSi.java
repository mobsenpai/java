import java.util.*;

class UserSi {
  public static void main(String args[]) {
    Scanner console = new Scanner(System.in);
    System.out.println("Enter p, r and t: ");
    float p, r, t, si;
    p = console.nextFloat();
    r = console.nextFloat();
    t = console.nextFloat();

    si = (p * r * t) / 100;
    System.out.println("SI: " + si);
  }
}
