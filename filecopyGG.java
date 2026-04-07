import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class FileCopy {
  public static void main(String[] args) {
    try {
      FileInputStream fis = new FileInputStream("photo.jpg");
      FileOutputStream fos = new FileOutputStream("photo_copy.jpg");

      int ch;
      while ((ch = fis.read()) != -1) {
        fos.write((char) ch);
      }

      fis.close();
      fos.close();
    } catch (IOException e) {
    }
  }
}
