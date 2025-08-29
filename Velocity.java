class Velocity {
  float v, u, a, t;

  float calVel(float x, float y, float z) {
    u = x;
    a = y;
    t = z;
    return u + (a * t);
  }

  public static void main(String args[]) {
    Velocity v1 = new Velocity();
    System.out.println("Final velocity: " + v1.calVel(0.5f, 6.8f, 20f));
  }
}
