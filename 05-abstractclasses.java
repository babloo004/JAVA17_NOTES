//Abstraction in Java is a fundamental concept in object-oriented programming (OOP) that involves representing the essential features of an object while hiding the implementation details.
//It allows developers to focus on what an object does rather than how it does it. 
//Abstraction is achieved through abstract classes and interfaces, which define a set of methods without providing the implementation.

//JAVA implements the abstraction through abstract classes and interfaces

//An abstract class in Java is a class that cannot be instantiated directly and may contain abstract methods (methods without a body) as well as concrete methods (methods with implementation).
//Abstract classes are used to define a common interface for a group of related classes. They provide a blueprint for subclasses to follow by defining abstract methods that must be implemented by the subclasses.
//Abstract classes may also contain concrete methods that provide default behavior or common functionality shared by all subclasses.
//To define an abstract class, you use the abstract keyword in the class declaration.
//if any there are any incomplete methods we use "Abstract" keyword to in front of that method so that the sub class of it must complete the method
//we can place abstract methods only in abstract classes, so to we have to place abstarct keywprd infront of class also
//but we cant create an object of abstract class
//just like when parents take loans by keeping their property as proof,Children must pay that debit
//in the "Parentsdebits" class is an abstract class. We cant make an object of that class. There is an abstract method "payloan"
// so in child class we must complete that method

abstract class Parent{
    String name;
    Parent(){
        System.out.println("I am parent class");
    }
    Parent(String name){
        this.name = name;
        System.out.println("Myself, "+name+"! I am Parent");
    }

    //method
    //takeloan
    public void takeloan(){
        System.out.println("Took loan!");
    }
    //payloan
    abstract public void payloan(); //abstract method
}

class Child extends Parent {
    String name;
    Child(){
        System.out.println("I am child class");
    }
    Child(String name){
        this.name = name;
        System.out.println("Myself, "+name+"! I am child");
    }

    //payloan
    public void payloan(){
        System.out.println("Loan payed!");
    }
}

class Abstractclasses{
    public static void main(String a[]){
        Child O1 = new Child();
        O1.takeloan();
        O1.payloan();
    }
}