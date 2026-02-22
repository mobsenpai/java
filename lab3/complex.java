import java.util.Scanner;

class Complex {
  private int real, img;

  Complex() {}

  Complex(Scanner sc) {
    System.out.print("Enter real part: ");
    real = sc.nextInt();
    System.out.print("Enter imaginary part: ");
    img = sc.nextInt();
  }

  Complex add(Complex c1) {
    Complex test = new Complex();
    test.real = real + c1.real;
    test.img = img + c1.img;
    return test;
  }

  void print() {
    System.out.println("Real part: " + real);
    System.out.println("Imaginary part: " + img);
    if (img > 0) {
      System.out.println("Complex number: " + real + "+" + img + "i");
    } else {
      System.out.println("Complex number: " + real + "-" + img + "i");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Complex o1 = new Complex(sc);
    Complex o2 = new Complex(sc);
    Complex sum = o1.add(o2);
    o1.print();
    o2.print();
    System.out.println("Sum of o1 and o2");
    sum.print();
  }
}
