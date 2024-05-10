//threads
//Threads in java are used for multi tasking
//Threads share the same memory
//to understand more about threads understand the concept of event scheduler and time slicing
//let us consider your cpu is having 12 cores, so your cpu can handle just 12 threads at a time
//When you run the code with two threads (A and B) concurrently, the operating system assigns time slices to each thread on the available CPU cores. 
//These time slices are small intervals during which a thread is allowed to execute its instructions. The operating system rapidly switches between threads, allowing each one to make progress.
//in single core CPUs threads wont run simultaneously,they appear to run at same time

//We can create threads in java by two methods 1. by extending the Thread class 2. by implementing Runnable interface
//Runnable interface contains run() method, in that method we should write our code
//Thread class implements the Runnable interface
//Thread class contains 3 methods 1.start() 2.sleep() 3.join()
//start() method is a non static method, which is applied on instance and when it is applied, it triggers the run() method
//sleep(millisec) method is a static method, it is used to pause the execution of thread for definite milli seconds of time. 
//sleep() method should be surronded in try catch method
//join() method is a non static method, it is used to pause the execution of main thread untill our thread finishes its execution
//join() method throws execption
//main thread means it starts executing the code in main() method

//if we create threads using Thread class, we cant extend another class,as java wont support multiple inheritance

class A extends Thread{
    String name;
    A(String name){
        this.name= name;
    }
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(this.name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends A{
    String name;
    B(String name){
        super(name);
        this.name = name;
    }
}

class C extends Thread implements Runnable {
    String name;
    C(String name){
        this.name = name;
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(this.name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Threads{
    public static void main(String a[]) throws InterruptedException{ //throws execption
        A T1 = new A("T1");
        A T2 = new A("T2");
        B T3 = new B("T3");
        C T4 = new C("T4");
        T1.start();
        T2.start();
        T3.start();
        T4.start();
        //main thread
        //using join method to wait until t1,t2,t3,t4 threads
        T1.join();
        T2.join();
        T3.join();
        T4.join();
        System.out.println("Execution Completed!");
    }
}