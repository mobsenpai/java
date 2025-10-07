interface Add {
  // no constructors, as cannot be instantiated
  int add(int x, int y);
}

interface Sub {
  int sub(int x, int y);
}

abstract class MultDiv {
  int x, y;

  MultDiv(int x, int y) {
    this.x = x;
    this.y = y;
  }

  abstract int mul(); // default access mod is package

  int div() {
    return x / y;
  }
}

class Main extends MultDiv implements Add, Sub {
  Main(int x, int y) {
    super(x, y);
  }

  public int add(int x, int y) { // interface's default acesss mod is 'public'
    return x + y;
  }

  public int sub(int x, int y) {
    return x - y;
  }

  int mul() {
    return x * y;
  }
}

class UseMain {
  public static void main(String[] args) {
    Main o1 = new Main(4, 2);
    System.out.println(o1.add(4, 2));
    System.out.println(o1.sub(4, 2));
    System.out.println(o1.mul());
    System.out.println(o1.div());
  }
}
