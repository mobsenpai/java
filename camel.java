import java.util.Scanner;

class Case {
    String name;
    Case(Scanner sc){
        System.out.print("Enter name: ");
        name = sc.nextLine();
    }

    void toCamel(){
        String result = "";
        String temp[] = name.split(" ");
        result += temp[0].toLowerCase();
        for(int i = 1; i<temp.length; i++){
            String word = temp[i];
            result += Character.toUpperCase(word.charAt(0)); // java compiler implicitly converts result to string builder, when we do +=
            result += word.substring(1, word.length()).toLowerCase();
        }

        System.out.println("Camel case: " +result);
    }

    void toSentence(){
        String result = "";
        String temp[] = name.split(" ");
        result += Character.toUpperCase(temp[0].charAt(0));
        result += temp[0].substring(1, temp[0].length()).toLowerCase();
        for(int i = 1; i<temp.length; i++){
            String word = temp[i];
            result += " ";
            result += word.toLowerCase();
        }

        System.out.println("Sentence case: " +result);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Case o1 = new Case(sc);
        o1.toCamel();
        o1.toSentence();
    }
}