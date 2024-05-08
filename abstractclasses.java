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