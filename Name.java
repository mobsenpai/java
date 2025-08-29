class Name {
  public static void main(String[] args) {
    String name = "yash raj";
    String result = "";
    result += Character.toUpperCase(name.charAt(0));
    int space = name.indexOf(' ');
    result += name.substring(1, space);
    result += Character.toUpperCase(name.charAt(space + 1));
    result += name.substring(space + 2, name.length());

    System.out.println(result);
  }
}
