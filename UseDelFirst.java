class DelFirst {
  String str;

  DelFirst(String str) {
    this.str = str;
    System.out.println(del());
  }

  String del() {
    String res;
    res = str.replace(Character.toString(str.charAt(0)), "");

    return res;
  }
}

class UseDelFirst {
  public static void main(String[] args) {
    DelFirst d1 = new DelFirst("Yash Raj");
  }
}
