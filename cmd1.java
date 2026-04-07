class Cmd {
  private int a;

  public Cmd() {
    a = 5;
  }

  public Cmd(int a) {
    this.a = a;
  }

  public void print() {
    System.out.println("a=" + a);
  }

  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    Cmd o1 = new Cmd();
    Cmd o2 = new Cmd(a);

    o1.print();
    o2.print();
  }
}
