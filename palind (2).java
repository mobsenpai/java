class Palind {
    String str;
    Palind(String[] args){
        str = args[0];
    }

    void check(){
        StringBuffer rev = new StringBuffer(str);
        rev.reverse();
        System.out.println(rev);

        if(str.equals(rev.toString())){ // Note, StringBuffer and String are different classes, so need to .toString() method
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    public static void main(String[] args){
        Palind o1 = new Palind(args);
        o1.check();
    }
}