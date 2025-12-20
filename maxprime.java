class MaxPrime {
    int i, max;
    void findPrime(){
        for(i = 2; i<int.length; i++){
            for(int j=2; j<i/2; j++){
                if((i%j) == 0){
                    break;
                } else {
                    max = i;
                }
            }
        }

        System.out.println("MAX PRIME: "+max);
    }
    public static void main(String[] args){
        MaxPrime o1 = new MaxPrime();
        o1.findPrime();
    }
}

// Wrong, just wanted to check what i wrote in exam. didnt practice this one.