import java.util.Scanner;

class Quad{
    private double a,b,c,x1,x2,d, real, img;
    Quad(Scanner sc){
        System.out.println("Enter 1st coefficient: ");
        a=sc.nextDouble();
        System.out.println("Enter 2nd coefficient: ");
        b=sc.nextDouble();
        System.out.println("Enter 3rd coefficient: ");
        c=sc.nextDouble();
    }

    public void findRoot(){
        d = (b*b) - (4*a*c);
        if(d>0){
            x1 = (-b + Math.sqrt(d))/(2*a);
            x2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("Roots: "+x1+" , "+x2);
        } else if(d==0){
            x1 = -b /(2*a);
            System.out.println("Repeated roots: "+x1);
        } else {
            System.out.println("No real roots");
            real = -b/(2*a);
            img = Math.sqrt(-d)/(2*a);
            System.out.println("Roots: " +real +" + " +img +"i" +" , " +real +" - " +img +"i");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Quad o1 = new Quad(sc);
        o1.findRoot();
    }
}