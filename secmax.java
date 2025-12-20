import java.util.Scanner;

class SecMax {
    private int a,b,c,num;
    SecMax(){
        a=0;
        b=0;
        c=0;
        num=0;
    }

    SecMax(Scanner sc){
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        System.out.println("Enter c: ");
        c = sc.nextInt();
    }

    public void findSecMax(){
        if(a>=b && b>=c){
            num = b;
        } else if(a>=c && c>=b){
            num = c;
        } else if(b>=a && a>=c){
            num = a;
        } else if(b>=c && c>=a){
            num = c;
        } else if(c>=a && a>=b){
            num = a;
        } else if(c>=b && b>=a){
            num = b;
        }
    }

    void print(){
        System.out.println("Second Max Num: " + num);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SecMax o1 = new SecMax(sc);
        o1.findSecMax();
        o1.print();
    }
}

//could store the nums in array 'nums' and do Arrays.sort(nums) and use nums[1] for second max