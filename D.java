class A {}

class B {}

class C {}

// can be only one
public class D {
  // only this class can be executed, having main function
  public static void main(String[] args) {
    // have to give one cmd argument
    System.out.println("Namaste " + args[0]);
  }
}
