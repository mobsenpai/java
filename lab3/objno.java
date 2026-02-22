class CountClass {
  static int count = 0;

  CountClass() {
    countOb();
  }

  static void countOb() {
    System.out.println(count++);
  }

  public static void main(String[] args) {
    CountClass o1 = new CountClass();
    CountClass o2 = new CountClass();
  }
}
