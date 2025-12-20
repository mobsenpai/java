class Occur {
    public static void main(String[] args){
        String str = "Able was i ere I saw elba";
        int first = str.indexOf('b');
        int last = str.lastIndexOf('b');
        String between = str.substring(first+1, last);
        System.out.println("No of chars between: " + between.length());
    }
}