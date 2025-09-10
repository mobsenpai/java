class Palind {
  String str;

  Palind(String str) {
    this.str = str;
    if (isPalind()) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not Palindrome");
    }
  }

  boolean isPalind() {
    StringBuffer revstr = new StringBuffer(str);
    return str.equals(revstr.reverse().toString());
  }
}

class UsePalind {
  public static void main(String[] args) {
    Palind p1 = new Palind("able was i ere i saw elba");
    Palind p2 = new Palind("madam");
    Palind p3 = new Palind("check");
  }
}
