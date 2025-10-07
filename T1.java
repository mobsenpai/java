class Table extends Thread {
  int n;
  String name;

  Table(String name, int n) {
    this.n = n;
    this.name = name;
  }

  void printTable() throws InterruptedException {
    // Use InterruptedException when using .sleep();
    for (int i = 1; i <= 10; i++) {
      System.out.println("Thread " + name + " is printing, " + n + " * " + i + " = " + n * i);
      Thread.sleep(3000);
    }
  }

  public void run() { // called implicitly by processor
    try {
      printTable();
    } catch (InterruptedException e) {

    }
  }
}

class UseTable {
  public static void main(String[] args) {
    Table t1 = new Table("T1", 2);
    Table t2 = new Table("T2", 4);
    t1.start(); // explicitily call
    t2.start();
  }
}
