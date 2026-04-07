class Outer {
  static class InnerStatic {
    public void print() {
      System.out.println("Inner static class");
    }
  }

  class Inner {
    void print() {
      System.out.println("Inner class");
    }
  }

  public static void main(String[] args) {
    Outer.InnerStatic o1 = new Outer.InnerStatic();
    o1.print();

    Outer o2 = new Outer();
    Outer.Inner o3 = o2.new Inner();
    o3.print();
  }
}
