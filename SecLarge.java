public class SecLarge {
  public static void main(String args[]) {
    int a = Integer.parseInt(args[0]), b = Integer.parseInt(args[1]), c = Integer.parseInt(args[2]);
    int r = a; // assume

    if (a >= b && a >= c) {
      // a is largest
      // then find sec largest among remaining two
      if (b >= c) {
        r = b;
      } else {
        r = c;
      }
    } else if (b >= a && b >= c) {
      if (a >= c) {
        r = a;
      } else {
        r = c;
      }
    } else {
      if (a >= b) {
        r = a;
      } else {
        r = b;
      }
    }

    System.out.println("Second Largest: " + r);
  }
}
