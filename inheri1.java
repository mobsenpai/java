class Super {
  protected int a;

  Super() {
    a = 5;
  }

  public void print() {
    System.out.println("super");
  }
}

class Sub extends Super {
  private int b;

  Sub() {
    b = 2;
  }

  public void print() {
    System.out.println(a);
  }

  public static void main(String[] args) {
    Sub o1 = new Sub();
    o1.print();
  }
}
