class MyThread extends Thread {
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(Thread.currentThread().getName() + ": " + i);
    }
  }

  public static void main(String[] args) throws InterruptedException {
    MyThread o1 = new MyThread();
    MyThread o2 = new MyThread();
    o1.start();
    o2.start();

    o1.join();
    // wont proceed further until o1 finishes executing
    o2.join();
    // wont proceed further until o2 finishes executing
    // o2.start();
    // after o1 finished, now o2 thread will start if placed after .join()

    // this will execute after o1 and o2 has finished executing
    System.out.println("reached end");
  }
}
