//Class is like a blue print. 
//class includes all the details like variables,methods. But we cant access the variables and methods directly
//we need an object to access those variables and methods
//naming convention for making class is to captaliase the first letter of the class name

//lets create a class named "Car"

//A class contains a  constructor. 
//A constructor is used to consrtruct class/object
//we shouldnt mention return type in front of constructor
//we should name constructor as same as our class
//constructors are of two types 1.Default constructor(no arguments) 2.Parametered constructor (with arguments)

class Car{

    //Constructors
    //Default Constructor
    Car(){
        System.out.println("Welcome!!!");
    }
    //Parametered Constructor
    Car(String name){
        System.out.println("Welcome to "+name+"`s car!");
    }

    //variables inside a class and outside a method is named as "Instance variable"
    //instance variables are stored inside heap memory
    int price = 100000; //instance variable

    //methods

    //start
    public void start(){
        System.out.println("Car has started!");
    }

    //stop
    public void stop(){
        System.out.println("Car has stopped!");
    }

    //method overloding
    //suppose we are having two methods with same name but each method accepts different type of arguments
    //it is called method overloading
    //consider an example
    public void playmusic(){
        System.out.println("random song playing");
    }
    public void playmusic(String songname){
        System.out.println(songname + " song started playing");
    }
    public void playmusic(int songnumber){
        System.out.println(songnumber+"th song playing");
    }
}

//successfully we have created a car class 
//now lets create an object to access the variables and methods

class CO{
    public static void main(String a[]){
        Car ford = new Car("Avinash");
        //above line indicates that ford is the name of the object and it is Car type variable
        // new keyword is used to create  an object
        ford.start();
        ford.stop();
        //method overloading examples
        ford.playmusic();
        ford.playmusic(69);
        ford.playmusic("anuvanuvu");
    }
}
