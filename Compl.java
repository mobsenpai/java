class Compl {
  int r1, r2, i1, i2;

  Compl() {
    r1 = 2;
    i1 = 4;
    r2 = 3;
    i2 = 5;

    print();
  }

  int addReal() {
    return r1 + r2;
  }

  int addImg() {
    return i1 + i2;
  }

  int subReal() {
    return r1 - r2;
  }

  int subImg() {
    return i1 - i2;
  }

  void print() {
    System.out.println("Addition: " + addReal() + " + " + addImg() + "i");
    System.out.println("Subtraction: " + subReal() + " + " + subImg() + "i");
  }

  public static void main(String[] args) {
    Compl o1 = new Compl();
  }
}
