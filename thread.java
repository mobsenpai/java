class Example extends Thread {
    public void run() {
        for(int i = 0; i<10;i++){
            System.out.println(Thread.currentThread().getName() + ": "+i);
            try{
                Thread.sleep(3000);
            } catch(InterruptedException e){
                System.out.println("message: " +e.getMessage());
            }
        }
    }

    public static void main(String[] args){
        Example o1 = new Example();
        Example o2 = new Example();
        o1.start();
        o2.start();

        try{
            o1.join();
            o2.join();
        } catch (InterruptedException e){}

        System.out.println("All threads completed!"); // will print immediately without waiting for previous threads to finish, use join to fix this
    }
}

//NOTE: cannot add exception to a function which is being overriden, can only write the exception as is if it is written in the original function