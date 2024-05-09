//Interfaces
//even interfaces also implements the abstraction in java
//interfaces are used for abstraction,which means we just reveal the behaviour,but not the inner mechanisim
//interfaces sholud contain only undefined methods and variables
//interfaces exhibit inheritances by extends keyword
//interfaces are inintiated by using keyword "interface"
//the below classes should implement them using "implements" keyword

//lets create a interface

interface I1{
    public void introduce();
    public void wish();
}

interface I2 extends I1{
    public void walk();
    public void eat();
}

interface I3 extends I2{
    public void sleep();
}

class A implements I3{
    public void introduce(){
        System.out.println("Hi!");
    }
    public void wish(){
        System.out.println("Good Morning!");
    }
    public void walk(){
        System.out.println("I am walking");
    }
    public void eat(){
        System.out.println("I am eatimg!");
    }
    public void sleep(){
        System.out.println("I am sleeping");
    }
}

//in the above example the interface I3 extends I2, and I2 extends I1
//class A implemented I3, so it have defined all the methods in I1,I2,I3 

//now lets talk about functional interface
//functional interface contains just one undfined method
//those are very usefull in writing lambda functions

//lets create a functional interface
interface Functional{
    public void drive(String vehicle);
}

//lambda functions
//Lambda expressions, introduced in Java 8, provide a concise way to represent anonymous functions (also known as lambda functions or closures) using a compact syntax. 
//Lambda expressions enable you to treat functionality as a method argument, or to create instances of functional interfaces more easily. 
//They are particularly useful when working with Java's functional interfaces, which have a single abstract method.

//Syntax:
// Lambda expressions have a simple syntax, consisting of parameter list, arrow token (->), and body.
// If the body of the lambda expression contains only one statement, curly braces {} are optional.
// If there is only one parameter, you can omit the parentheses around the parameter list.
// If there are no parameters, you still need to include empty parentheses ().

class Interfaces{
    public static void main(String a[]){
        A O1 = new A();
        O1.eat();
        O1.wish();
        O1.sleep();
        Functional j = (String vehicle)->{
            System.out.println("I am driving "+vehicle+"!");
        };
        j.drive("Car"); 
    }
}