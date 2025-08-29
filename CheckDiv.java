class CheckDiv {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    if (n % 2 == 0) {
      System.out.println("Div by 2");
    } else {
      System.out.println("Not div by 2");
    }
    if (n % 3 == 0) {
      System.out.println("Div by 3");
    } else {
      System.out.println("Not div by 3");
    }
    if (n % 5 == 0) {
      System.out.println("Div by 5");
    } else {
      System.out.println("Not div by 5");
    }
  }
}
