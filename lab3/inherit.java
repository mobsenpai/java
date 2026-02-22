class Parent {
  protected int a;

  Parent(int a) {
    this.a = a;
  }

  void print() {
    System.out.println(a);
  }
}

class Child extends Parent {
  protected int b;

  Child(int a, int b) {
    super(a);
    this.b = b;
  }

  public void print() {
    super.print();
    System.out.println(a);
    System.out.println(b);
  }

  public static void main(String[] args) {
    Child o1 = new Child(2, 3);
    o1.print();
  }
}
