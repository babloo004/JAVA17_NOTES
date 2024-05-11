//multitasking
//in java multitasking can be achieved by two ways 1. Process-Based Multitasking 2. Thread-Based Multitasking
//In process based multitasking, proccess are heavy weight and communication between each process is very costly
//in process based multitasking, each process takes different memory loacation
//where as threads are light weight,and the cost of communication is also very low compared to the process based multitasking
//so we opt for threads based multi tasking


//threads
//Threads in java are used for multi tasking
//Threads share the same memory
//to understand more about threads understand the concept of event scheduler and time slicing
//let us consider your cpu is having 12 cores, so your cpu can handle just 12 threads at a time
//When you run the code with two threads (A and B) concurrently, the operating system assigns time slices to each thread on the available CPU cores. 
//These time slices are small intervals during which a thread is allowed to execute its instructions. The operating system rapidly switches between threads, allowing each one to make progress.
//in single core CPUs threads wont run simultaneously,they appear to run at same time

//states of thread

//new state - the code is just defined in the run method but not executed

//active state - the thread will convert into active state, by intiating the start() method
//active state consists two staes, they are runnable state and running state
//in runnable state the thread is ready to execute at any given time, its the job of thread scheduler to allot time for thread to run
//running state the thread will get cpu to get execute and the thread will execute, but it will again goes to the runnable state after expiry of given time slice

//. Waiting/Blocked State 
//If a Thread is inactive but on a temporary time, then either it is a waiting or blocked state.
//For example, if there are two threads, T1 and T2 where T1 needs to communicate to the camera and the other thread T2 already using a camera to scan then T1 waits until T2 Thread completes its work, at this state T1 is parked in waiting for the state

//Timed Waiting State
//Sometimes the longer duration of waiting for threads causes starvation
// if we take an example like there are two threads T1, T2 waiting for CPU and T1 is undergoing a Critical Coding operation and if it does not exist the CPU until its operation gets executed then T2 will be exposed to longer waiting with undetermined certainty, In order to avoid this starvation situation, we had Timed Waiting for the state to avoid that kind of scenario as in Timed Waiting, each thread has a time period for which sleep() method is invoked and after the time expires the Threads starts executing its task. 
//. When there are multiple threads parked in a Blocked/Waiting state Thread Scheduler clears Queue by rejecting unwanted Threads and allocating CPU on a priority basis. 

//Terminated State
//A thread will be in Terminated State, due to the below reasons: 
// Termination is achieved by a Thread when it finishes its task Normally.
// Sometimes Threads may be terminated due to unusual events like segmentation faults, exceptions…etc. and such kind of Termination can be called Abnormal Termination.
// A terminated Thread means it is dead and no longer available.

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
