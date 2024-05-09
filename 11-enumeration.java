//enumeration
//In Java, Enumerations or Java Enum serve the purpose of representing a group of named constants in a programming language
//enums are used to define constants in our code at a place
//enums cant extends or becomes superclass. It cant perform inhertitance 
//enums can implement interfaces
//in the first line of enum we should declare constants seperated by comas(,)
//the constants are considered as objects implicitly and we cant declare an object of enums explicitly
//enus can have constructors and methods
//enum constructors are private,sp we cant create explicitly objects of enum
//by default the constants in the enum are final and static,thats why we can access them as "enumname.constant"
//enums contains constants, they are instances of enum automatically created by the java at run time
//enum constructors are privates, so we cant declare enum instance just like new enum()
//as we have considered each enum constant as enum instance, each constant will have its own methods
//even we can declare abstract methods inside the enums and that should be implemented by each constant
//enum instances are equal to the nu,ber of enum constants
//enums can also implement interfaces
//enums contribute to the encapsultaion
//as enum constants act as instances, there is no need to create again object(even we cant)
//all the enum constants are static and final
//lets create a enum

interface Inter{
    public void introduce();
}

enum E1 implements Inter{
    //WALK,EAT,SLEEP,WORK,EARN are enum constant
    //they are instances of enum
    WALK{
        public void click(){
            System.out.println("Walking...!");
        }
    },EAT{
        public void click(){
            System.out.println("Eating...!");
        }
        static public void eatmore(){
            System.out.println("Eating maore...!");
        }
    },SLEEP{
        public void click(){
            System.out.println("Sleeping...!");
        }
        public void sleepless(){
            System.out.println("Sleeping reduced...!");
        }
    },WORK{
        public void click(){
            System.out.println("Working hard...!");
        }
    },EARN{
        public void click(){
            System.out.println("Earning Handfully...!");
        }
        public void earnmore(){
            System.out.println("Earnmore...");
        }
    };
    public void introduce(){ //interface method
        System.out.println("Hi");
    }
    abstract public void click(); //abstract method, must be implemented by all enum constants
    void sleepless() {
    }
    void earnmore(){
        System.out.println("Enum earning...!");
    }
    static void eatmore(){
        System.out.println("Enum eating...!");
    }
}

class Enums{
    public static void main(String a[]){
        //calling method on earn without creating object
        //according to my understanding, to create a method for individual enum constant, we should define method in the enum and later we should over ride
        //if a method is not defined for enum constant, but defined locally in enum,then we can use it for other enum constants also

        //dont confuse...remember these points
        //we declare abstract methods, to define a method by every constant in enum
        //if we locally define a method in enum, it can be used by every enum constant
        //we can even over ride a local method for particular constants
        //we cant define a method for particular constant without locally defining it in enum
        E1.EARN.click();
        E1.SLEEP.sleepless();
        E1.eatmore();
        E1.EAT.eatmore();
        E1.EAT.earnmore();;
        // E1.earnmore();
        E1.EARN.earnmore();
    }
}