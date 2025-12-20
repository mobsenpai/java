import java.util.Scanner;

class Space {
    private String str;
    Space(Scanner sc){
        System.out.print("Enter a string: ");
        str = sc.nextLine();
    }

    void count(){
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }

        System.out.println("No of spaces: " +count);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Space o1 = new Space(sc);
        o1.count();
    }
}