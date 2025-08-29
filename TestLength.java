public class TestLength {
  public static void main(String args[]) {
    if (args.length < 2) {
      System.out.println("Please enter 2 arguments");
    } else if (Integer.parseInt(args[0]) > Integer.parseInt(args[1])) {
      System.out.println("Num 1 > Num 2");
    } else if (Integer.parseInt(args[0]) < Integer.parseInt(args[1])) {
      System.out.println("Num 1 < Num 2");
    } else if (Integer.parseInt(args[0]) == Integer.parseInt(args[1])) {
      System.out.println("Num 1 == Num 2");
    }
  }
}
