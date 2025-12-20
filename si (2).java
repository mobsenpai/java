import java.util.Scanner;

class Si {
    private float p,r,t, si;
    public void input(Scanner sc){
        System.out.print("Enter Principal amount: ");
        p = sc.nextFloat();
        System.out.print("Enter rate of interest: ");
        r = sc.nextFloat();
        System.out.print("Enter time period: ");
        t = sc.nextFloat();
    }

    public void calc(){
        si = (p*t*t)/100;
        System.out.println("SI: "+si);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Si o1 = new Si();
        o1.input(sc);
        o1.calc();
    }
}