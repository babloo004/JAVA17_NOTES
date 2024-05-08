//lets have a look at inheritance in this module
//Inheritance allows a class to inherit its properties and behaviour of parent class/ super class to child class/sub class
//if a parent class consists single child it is single level inheritance
//if a parent class consists multiple child classes it is known as multi level inheritance
//inheritance is implemented by using "extends" keyword

//Polymorphism, a fundamental concept in object-oriented programming (OOP), refers to the ability of objects to take on multiple forms or behaviors depending on the context in which they are used. 
//In Java, polymorphism is achieved through two mechanisms: method overriding and method overloading.
//When an overridden method is called on an object of the subclass, the JVM dynamically dispatches the call to the appropriate method based on the actual type of the object at runtime. 
//This is known as runtime polymorphism or dynamic method dispatch.
//When an overloaded method is called, the appropriate version of the method is selected based on the number and types of arguments passed to it.
// This is known as compile-time polymorphism or static method dispatch.
//lets create two classes Parent class and Child class

class Parent{ //parent class/superclass
    String name;

    //Constructors
    Parent(){
        System.out.println("I am parent!");
    }
    Parent(String name){
        this.name = name;
        System.out.println("Myself, "+name+"! I am a parent");
    }

    //methods
    //Assets
    public void assets(){
        System.out.println("These are my family assets");
    }
    //Childrens (Method Over riding)
    public void children(){
        System.out.println("I am having 2 children. One male,one female");
    }
}

class Child extends Parent{ //Child class/sub class
    String name;
    //Constructors
    Child(){
        System.out.println("I am Child class");
    }
    Child(String name){
        System.out.println("Mysel, "+name+"! I am Child class");
    }

    //methods
    //Children(Method over riding)
    public void children(){
        System.out.println("I am havining one male kid");
    }
    //assets(method over loading)
    public void assets(String property){
        System.out.println("My assets are "+property);
    }
    //extra assets
    public void extraassets(){
        System.out.println("These are my extra assets");
    }
}

//by above code we can observe that we have implemented inheritance

class Inheritance{
    public static void main(String a[]){
        //lets create a parent object
        Parent O1 = new Parent("Krishna");
        //lets create a child object
        Child O2 = new Child();
        //When we create a child object parent class constructor is automatically invoked

        //Properties of inheritance
        //inheritance allows method overloading and method over writing
        //we can access parent class methods using child class objects and vice versa cant be done
        //method over writing means means occurs when a subclass defines a method with the same signature (name, return type, and parameters) as a method in its superclass.
        // If the subclass wants to change the behavior of a method inherited from the superclass, it can redefine the method with the same signature in the subclass.
        O1.assets();
        O1.children();
        // O1.extraassets();
        O2.assets("Lands");
        O2.children();
    }
}