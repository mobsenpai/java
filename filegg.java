import java.io.FileReader;
import java.io.FileWriter;
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
  }

  public void write() throws IOException {
    FileWriter fw = new FileWriter(fname);
    fw.write("Name: " + name + "\n");
    fw.write("Marks: " + marks);
    fw.close();
  }

  public void read() throws IOException {
    FileReader fr = new FileReader(fname);
    int data;
    while ((data = fr.read()) != -1) {
      System.out.print((char) data);
    }
    fr.close();
  }

  public static void main(String[] args) {
    StudentRecord o1 = new StudentRecord("Yash Raj", 90);
    try {
      o1.getFileName();
      o1.write();
      o1.read();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
