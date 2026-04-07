import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class StudentRecord {
  private String fname;
  private String name;
  private int marks;

  public StudentRecord(String name, int marks) {
    this.name = name;
    this.marks = marks;
  }

  public void getFileName() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter file name: ");
    fname = sc.nextLine();
    sc.close();
  }

  public void write() throws IOException {
    FileOutputStream fos = new FileOutputStream(fname);
    fos.write(("Name: " + name + "\n").getBytes());
    fos.write(("Marks: " + marks).getBytes());
    fos.close();
  }

  public void read() throws IOException {
    FileInputStream fis = new FileInputStream(fname);
    int data;
    while ((data = fis.read()) != -1) {
      System.out.print((char) data);
    }
    fis.close();
  }

  public static void main(String[] args) throws IOException {
    StudentRecord o1 = new StudentRecord("Yash raj2", 90);
    o1.getFileName();
    o1.write();
    o1.read();
  }
}
