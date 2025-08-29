class Occur {
  public static void main(String[] args) {
    String str = "Able was I ere I saw elba";
    int f = str.indexOf('b');
    int l = str.lastIndexOf('b');
    int count = l - f - 1;

    System.out.println(count);
  }
}
