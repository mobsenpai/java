class StaticTest {
  int a;
  static int c = 3;

  StaticTest() {
    a = 1;
  }

  static void show() {
    System.out.println("static value or c is" + c);
  }

  static class Inner {
    int d;

    Inner() {
      d = 4;
    }

    void showInner() {
      System.out.println("value of d" + d);
    }
  }

  public static void main(String args[]) {
    StaticTest o1 = new StaticTest();
    // Inner i1 = o1.new Inner();
    Inner i1 =
        new Inner(); // accessing static class, without outer class reference, as it became top
    // level
    // o1.show();
    StaticTest.show(); // accessing static method using class name and not object name
    i1.showInner();
  }
}
