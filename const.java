class Base {
    Base(){
        System.out.println("Base - Default constructor");
    }

    Base(int a){
        System.out.println("Base - a: " +a);
    }
    void print(){
        System.out.println("Base");
    }
}

class Derived extends Base {
    Derived(){
        System.out.println("Derived - Default constructor");
    }

    Derived(int b){
        super(b);
        System.out.println("Derived - b: " +b);
    }
    void print(){
        System.out.println("Derived");
    }

    public static void main(String[] args){
        Derived o1 = new Derived(2);
        o1.print();
    }
}