class Vel {
  float u, a, t;

  Vel() {
    u = 0.5f;
    a = 6.8f;
    t = 20.0f;
  }

  float calc() {
    return u + (a * t);
  }

  public static void main(String args[]) {
    Vel v1 = new Vel();
    float v = v1.calc();
    System.out.println("Final Velocity: " + v);
  }
}
