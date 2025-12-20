class Complex {
    private int r1,i1,r2,i2;
    Complex(int r1, int i1, int r2, int i2){
        this.r1 = r1;
        this.i1 = i1;
        this.r2 = r2;
        this.i2 = i2;
    }

    public void add(){
        System.out.println(r1+r2 +"+" +(i1+i2) +"i");
    }

    public void sub(){
        System.out.println(r1-r2 +"+" +(i1-i2) +"i");
    }

    public static void main(String[] args){
        Complex o1 = new Complex(2,1, 3,5);
        o1.add();
        o1.sub();
    }
}