class Occur {
  private String text, sub;

  Occur() {
    text = "Able was i ere I saw elba";
  }

  int count() {
    int f = text.indexOf("b");
    int l = text.lastIndexOf("b");
    sub = text.substring(f + 1, l);
    return sub.length();
  }

  void print() {
    count();
    System.out.println("The substring between first b and last b is: " + sub);
    System.out.println("Total chars: " + count());
  }

  public static void main(String[] args) {
    Occur o1 = new Occur();
    o1.print();
  }
}
