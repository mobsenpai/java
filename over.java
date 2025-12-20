class Example{
    public void add(int a, int b){

        System.out.println("INT " + (a+b));
    }

    public void add(float a, float b){
        System.out.println("FLOAT " + (a+b));
    }

    public void add(double a, double b){
        System.out.println("DOUBLE " + (a+b));
    }
    public static void main(String[] args){
        Example o1 = new Example();
        o1.add(2,4);
        o1.add(2.0f, 4.0f);
        o1.add(2.0, 4.0);
    }
}