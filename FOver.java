class FOver {
  int add(int i1, int i2) {
    return i1 + i2;
  }

  float add(float f1, float f2, float f3) {
    return f1 + f2 + f3;
  }

  double add(double d1, double d2, double d3) {
    return d1 + d2 + d3;
  }

  public static void main(String[] args) {
    FOver o1 = new FOver();
    int i = o1.add(2, 3);
    float f = o1.add(2.0f, 3.0f, 0.0f);
    double d = o1.add(2.0, 3.0, 0.0);

    System.out.println("int add: " + i);
    System.out.println("float add: " + f);
    System.out.println("double add: " + d);
  }
}
