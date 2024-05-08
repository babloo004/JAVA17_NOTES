//Lets have a look at encapsulation in this module.
//encapsulation is one of the four pillars in OOPs
//Encapsulation aims to hide the internal state of an object from the outside world and only expose the necessary functionalities through well-defined interfaces
//This helps in achieving data hiding and abstraction, which are essential for building robust and maintainable software systems.
//we can achieve encapsulation through "private" keyword before variables and methods
//these variables and methods are accessable through outside
//we will use setters and getters help to gain access on them
//if a method is encapsulated we can only use that method inside same class

class Person{
    //instance variables
    private String name;
    private int age;
    private boolean adult;

    //Constructuor
    Person(String name,int age){
        this.name = name;
        this.age = age;
        this.adult = isadult(age);
    }

    //setters
    //name
    public void setname(String name){
        this.name = name;
    }

    public void setage(int age){
        this.age = age;
    }

    //getters
    public String getname(){
        System.out.println(name);
        return name;
    }

    public int getage(){
        System.out.println(age);
        return age;
    }

    public boolean getadult(){
        System.out.println(adult);
        return adult;
    }

    //private method
    private boolean isadult(int age){
        if (age>18){
            return true;
        }else{
            return false;
        }
    }
}

class Encapsulation{
    public static void main(String a[]){
        Person p1 = new Person("Avinash",17);
        p1.getname();
        p1.getage();
        p1.getadult();
    }
}