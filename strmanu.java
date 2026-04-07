class StringManipulation {
  private String str;

  public StringManipulation(String str) {
    this.str = str;
  }

  public String toCamelCase() {
    StringBuffer word = new StringBuffer();
    String[] temp = str.toLowerCase().split(" ");
    for (int i = 0; i < temp.length; i++) {
      if (i == 0) {
        word.append(temp[i]);
      } else {
        char fl = Character.toUpperCase(temp[i].charAt(0));
        String rest = temp[i].substring(1);
        word.append(fl);
        word.append(rest);
      }
    }

    return word.toString();
  }

  public String toSentenceCase() {
    StringBuffer word = new StringBuffer();
    String[] temp = str.toLowerCase().split(" ");
    for (int i = 0; i < temp.length; i++) {
      char fl = Character.toUpperCase(temp[i].charAt(0));
      String rest = temp[i].substring(1);
      word.append(fl);
      word.append(rest);
      word.append(" ");
    }

    return word.toString();
  }

  public void print() {
    System.out.println("Camel Case: " + toCamelCase());
    System.out.println("Sentence Case: " + toSentenceCase());
  }

  public static void main(String[] args) {
    StringManipulation o1 = new StringManipulation("yash rAj SinghaniA");
    o1.print();
  }
}
