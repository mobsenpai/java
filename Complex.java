class Complex {
  int real, img;

  Complex() {
    real = 0;
    img = 0;
  }

  Complex(int x, int y) {
    real = x;
    img = y;
  }

  Complex(Complex c) {
    real = c.real;
    img = c.img;
  }

  void add(Complex c1, Complex c2) {
    real = c1.real + c2.real;
    img = c1.img + c2.img;
  }

  Complex add(Complex c) {
    Complex ct = new Complex();
    ct.real = real + c.real;
    ct.img = img + c.img;

    return ct;
  }

  void showData() {
    System.out.println("Number is " + real + " i" + img);
  }
}

class UseComplex {
  public static void main(String args[]) {
    Complex c1 = new Complex();
    Complex c2 = new Complex(4, 5);
    Complex c3 = new Complex(c2);
    c1.add(c2, c3);
    Complex c4 = c2.add(c3);

    c1.showData();
    c2.showData();
    c3.showData();
    c4.showData();
  }
}
