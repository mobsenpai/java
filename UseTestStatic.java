class TestStatic {
  int rollno;
  String name;
  static int rn = 0;

  static {
    System.out.println("value of rn is" + rn++); // first rn = 0 got printed then it became 1
  }

  TestStatic(String str) {
    name = str;
    rollno = rn++;
  }

  void showInfo() {
    System.out.println("name: " + name + " rollno: " + rollno);
  }
}

class UseTestStatic {
  public static void main(String args[]) {
    TestStatic o1 = new TestStatic("yash");
    TestStatic o2 = new TestStatic("preetam");
    o1.showInfo();
    o2.showInfo();
  }
}
