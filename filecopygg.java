import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileCopy {
  public static void main(String[] args) {
    try {
      FileReader fr = new FileReader("text.txt");
      FileWriter fw = new FileWriter("text_copy.txt");

      int ch;
      while ((ch = fr.read()) != -1) {
        fw.write((char) ch);
      }

      fr.close();
      fw.close();

    } catch (IOException e) {
    }
  }
}
