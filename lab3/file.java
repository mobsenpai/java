import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class File {
  private String fname;
  private byte[] data;
  private char ch;

  void getFileName() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter file name: ");
    fname = sc.nextLine();
  }

  void write() {
    Scanner sc = new Scanner(System.in);
    try {
      FileOutputStream fos = new FileOutputStream(fname);
      do {

        System.out.println("Enter the content below -");
        data = (sc.nextLine() + "\n").getBytes();
        fos.write(data);

        System.out.println("Continue? (y/n)");
        ch = sc.nextLine().charAt(0);
      } while (ch != 'n');

    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  void read() {
    try {
      FileInputStream fis = new FileInputStream(fname);
      int byteData;
      while ((byteData = fis.read()) != -1) {
        System.out.print((char) byteData);
      }

    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  public static void main(String[] args) {
    File o1 = new File();
    o1.getFileName();
    o1.write();
    o1.read();
  }
}
