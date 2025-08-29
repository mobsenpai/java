class Sec {
  public static void main(String[] args) {
    int a = 4, b = 5, c = 23;
    int max = a;
    int min = a;
    int sec = a;
    if ((a >= b) && a >= c) {
      max = a;
    } else if ((b >= a && b >= c)) {
      max = b;
    } else {
      max = c;
    }

    if ((a <= b) && a <= c) {
      min = a;
    } else if ((b <= a) && (b <= c)) {
      min = b;
    } else {
      min = c;
    }

    if (a != max && a != min) {
      sec = a;
    } else if (b != max && b != min) {
      sec = b;
    } else {
      sec = c;
    }

    System.out.println("Second largest element is: " + sec);
  }
}
