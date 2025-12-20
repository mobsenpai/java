class Test {
    int a=5;
    int b; // Class members get initialized with default values, by the default constructor automatically created.
    public static void main(String[] args){
        Test ob = new Test();
        System.out.println(ob.a);
        System.out.println(ob.b);

    }
}