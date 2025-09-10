class RemA {
  String str;

  RemA(String str) {
    this.str = str;
    System.out.println(logicA());
  }

  String logicA() {
    String res;
    res = str.replaceAll("[Aa]", "");

    return res;
  }
}

class UseRemA {
  public static void main(String[] args) {
    RemA r1 = new RemA("PrakAsh");
  }
}
