// IMP

class Division {
  private float a, b, div;

  Division(String[] args) {
    try {
      if (args.length != 2) {
        throw new Exception("Require 2 numbers for this program");
      } else {
        this.a = Float.parseFloat(args[0]);
        this.b = Float.parseFloat(args[1]);
      }
    } catch (Exception e) {
      System.out.println("message" + e.getMessage());
    }
  }

  void calc() {
    // Scenario 1:
    // No manual check for b == 0
    // No need to handle, still we did
    try {
      div = a / b;
      System.out.println(div);
    } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero" + e.getMessage());
    }
  }

  void calc2() {
    // Scenario 2:
    // Manually checking b == 0 at compile time
    // Need to handle - try-catch
    try {
      if (b == 0) {
        throw new Exception("Denominator cannot be zero");
      } else {
        div = a / b;
        System.out.println(div);
      }
    } catch (Exception e) {
      System.out.println("message: " + e.getMessage());
    }
  }

  void calc3() throws Exception {
    // Scenario 3:
    // Manually checking b == 0 at compile time
    // Need to handle - throws
    // Note: will have to use try catch when calling this function
    if (b == 0) {
      throw new Exception("Denominator cannot be zero");
    } else {
      div = a / b;
      System.out.println(div);
    }
  }

  void calc4() throws Exception {
    // Scenario 4:
    // Manually checking b == 0 at compile time
    // Need to handle - try-catch & finally both
    if (b == 0) {
      throw new Exception("Denominator cannot be zero");
    } else {
      div = a / b;
      System.out.println(div);
    }
  }

  public static void main(String[] args) {
    // If not handling the IndexOutOfBounds runtime exception
    Division o1 = new Division(args);
    o1.calc();
    o1.calc2();

    // For scenario 3
    try {
      o1.calc3();
    } catch (Exception e) {
      System.out.println("message: " + e.getMessage());
    }

    // For scenario 4
    try {
      o1.calc4();
    } catch (Exception e) {
      System.out.println("message: " + e.getMessage());
    }
  }
}
