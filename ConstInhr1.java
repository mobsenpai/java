class ConstInhr {
  int a;

  ConstInhr(int a) {
    this.a = a;
  }
}

class Main extends ConstInhr {
  int b;

  Main(int a, int b) {
    super(a);
    this.b = b;
  }
}

class UseMain {
  public static void main(String[] args) {
    Main o1 = new Main(2, 3);
    System.out.println(o1.a + "\n" + o1.b);
  }
}
