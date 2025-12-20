class Example {
    float a,b;
    Example(String[] args) {
        if(args.length != 2){
            // no need for try catch, unchecked exception
            // can use throws to let function handle the exception
            throw new IndexOutOfBoundsException("Need 2 arguments");
        }
            a=Float.parseFloat(args[0]);
            b=Float.parseFloat(args[1]);
    }

    void div() throws Exception {
        // need to handle in try catch, checked exception
        if(b==0){
            throw new Exception("Cannot divide by zero");
        }
        System.out.println(a/b);
    }
    public static void main(String[] args){
        try{
            Example o1 = new Example(args);
            o1.div();
        } catch(Exception e){
            // System.out.println("Cant divide by zero");
            System.out.println("message: " +e.getMessage());
        } finally {
            System.out.println("Finally !");
        }        
    }
}