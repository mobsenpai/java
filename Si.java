public class Si {
  public static void main(String args[]) {
    double p = Double.parseDouble(args[0]);
    float r = Float.parseFloat(args[1]);
    int t = Integer.parseInt(args[2]);
    System.out.println("SI: " + ((p * r * t) / 100));
  }
}
