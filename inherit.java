interface Add{
    void sum(int a, int b);
}

interface Sub{
    void diff(int a, int b);
}

abstract class MultDiv{
    abstract void mult(int a, int b);
    abstract void div(int a, int b);
}

class Calc extends MultDiv implements Add,Sub{
    public void sum(int a, int b){
        System.out.println(a+b);
    }

    public void diff(int a, int b){
        System.out.println(a-b);
    }

    void mult(int a, int b){
        System.out.println(a*b);
    }

    void div(int a, int b){
        System.out.println(a/b);
    }

    public static void main(String[] args){
        Calc o1 = new Calc();
        o1.sum(2,3);
        o1.diff(2,3);
        o1.mult(2,3);
        o1.div(2,3);
    }
}