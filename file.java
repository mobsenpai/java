import java.util.Scanner;
// import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class Example {
    private String fname;
    private byte[] data;
    private char ch;
    void getFileName(Scanner sc){
        System.out.print("Enter file name: ");
        fname = sc.nextLine();
    }

    void write(Scanner sc){
        try{
            FileOutputStream fos = new FileOutputStream(fname);
            do {
                System.out.println("Enter the line below - ");
                data = (sc.nextLine() +"\n").getBytes();
                fos.write(data);

                System.out.print("Enter line (y/n)");
                ch = sc.nextLine().charAt(0);
            } while(ch != 'n');

        } catch (Exception e){}
    }

    void read(){
        try{
            FileInputStream fis = new FileInputStream(fname);
            int byteData;
            while((byteData = fis.read()) != -1){
                System.out.print((char) byteData);
            }
        } catch(Exception e){}
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Example o1 = new Example();
        o1.getFileName(sc);
        o1.write(sc);
        o1.read();
    }
}