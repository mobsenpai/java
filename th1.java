class MyClass implements Runnable {
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(Thread.currentThread().getName() + ": " + i);
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
      }
    }
  }

  public static void main(String[] args) throws InterruptedException {
    MyClass o1 = new MyClass();
    // normal execution
    o1.run();

    // threaded execution
    Thread t1 = new Thread(o1);
    t1.start();

    Thread t2 = new Thread(o1);
    t2.start();

    t1.join();
    t2.join();
  }
}
