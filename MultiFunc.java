class MultiFunc {
  int add(int a, int b) {
    return a + b;
  }

  float add(float a, float b, float c) {
    return a + b + c;
  }

  double add(double a, double b, double c) {
    return a + b + c;
  }
}

class UseFunc {
  public static void main(String args[]) {
    MultiFunc o1 = new MultiFunc();
    System.out.println("int: " + o1.add(2, 5));
    System.out.println("float: " + o1.add(2.0f, 5.0f, 3.0f));
    System.out.println("double: " + o1.add(2.0, 5.0, 3.0));
  }
}
