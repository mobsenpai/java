class Example {
  private int a;
  private int b;

  public Example(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public Example(Example ob) {
    a = ob.a;
    b = ob.b;
  }

  public void print() {
    System.out.println("a= " + a);
    System.out.println("b= " + b);
  }

  public static void main(String[] args) {
    Example o1 = new Example(2, 3);
    o1.print();
    Example o2 = new Example(o1);
    o2.print();
  }
}
