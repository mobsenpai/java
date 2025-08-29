class CountOb {
  static int count = 0;

  CountOb() {
    System.out.println("ob" + ++count + "is created");
  }

  public static void main(String[] args) {
    CountOb ob1 = new CountOb();
    CountOb ob2 = new CountOb();
    CountOb ob3 = new CountOb();
    CountOb ob4 = new CountOb();
    CountOb ob5 = new CountOb();
    CountOb ob6 = new CountOb();
  }
}
