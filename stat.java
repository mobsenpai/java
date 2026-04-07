class Example {
  private static int a;

  Example() {
    a = 5;
  }

  public static void print() {
    System.out.println(a);
  }

  public static void main(String[] args) {
    Example.print();
    Example o1 = new Example();
    Example.print();
  }
}
