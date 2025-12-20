class Outer {
    void info(){
        System.out.println("Outer class");
    }
    static class Nested {
        void info(){
            System.out.println("Nested static class");
        }
    }
    class Inner{
        void info(){
            System.out.println("Non static inner class");
        }
    }

    public static void main(String[] args){
        // static nested class,, no need of outer class object
        Outer.Nested nested = new Outer.Nested();
        nested.info();

        // non static inner class,, need outer class object first
        Outer o1 = new Outer();
        Outer.Inner i1 = o1.new Inner(); // note the syntax
        i1.info();
        // or
        Inner i2 = new Outer().new Inner();
        i2.info();
    }
}