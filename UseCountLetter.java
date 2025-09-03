class CountLetter {
  String str = "This is an example string";

  int count() {
    int c = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != ' ') {
        c++;
      }
    }
    return c;
  }
}

class UseCountLetter {
  public static void main(String args[]) {
    CountLetter ob = new CountLetter();
    System.out.println(ob.count());
  }
}
