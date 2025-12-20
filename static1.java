class Example {
    static int count=0;
    Example(){
        System.out.println("Object "+count+" created");
        count++;
    }

    static {
        System.out.println("Static block executed");
    }

    static void info(){
        System.out.println("Total objects created: " +count);
    }

    public static void main(String[] args){
        Example.info();
        Example[] o1 = new Example[5];
        for(int i = 0; i<5; i++){
            o1[i] = new Example();
        }

        Example.info();
    }
}