class Outer {
  int a;

  Outer(int a) {
    this.a = a;
  }

  void showOuter() {
    System.out.println("value of a " + a);
  }

  class Inner {
    int b;

    Inner(int b) {
      this.b = b;
    }

    void showInner() {
      System.out.println("value of b " + b);
    }

    // Inside inner
    public static void main(String args[]) {
      Outer o1 = new Outer(2); // 1st way
      Inner i1 = o1.new Inner(3); // 2nd way
      Outer.Inner i2 = o1.new Inner(4);
      o1.showOuter();
      i1.showInner();
      i2.showInner();
    }
  }
}

// In a new class
// class UseOuter {
//   public static void main(String args[]) {
//     Outer o1 = new Outer(2);
//     // Inner i1 = new Inner(3); can't be accessed like this
//      Outer.Inner is used not just Inner
//     Outer.Inner i1 = o1.new Inner(3);
//     o1.showOuter();
//     i1.showInner();
//   }
// }
