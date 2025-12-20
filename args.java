class Example {
    private int num;
    private String lname, fname;
    public void input(String[] args) throws Exception{
        // NOTE: if dont want to use throws, then use runtime exceptions, because they are unchecked.
        // Exception is parent exception and is checked, means you need to handle it manually.
        if(args.length != 3){
            throw new Exception("3 Arguments required");
        }
        num = Integer.parseInt(args[0]);
        fname = args[1];
        lname = args[2]; 
    }
    public void print(){
        System.out.println("Num: "+num);
        System.out.println("Name: "+fname+ " "+lname);
    }

    public static void main(String[] args){
        Example o1 = new Example();
        try {
            o1.input(args);
            o1.print();
        } catch(Exception e){
            System.out.println("Enter 3 arguments - num - string - string");
        }
    }
}
