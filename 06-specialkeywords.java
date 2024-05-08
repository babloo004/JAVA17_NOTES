//in java there are some special keywords like abstract,super,final and static
//as we have already discussed about abstract keyword in abstract classes module
//noow lets have a look at remaining three keywords

//super
//super keyword is mainly used in the subclasses to call the methods and variables of super classes
//super keyword is used to call constructor of super class in the sub class
//super keyword is used to call the method of super class in the subclass
//super keyword is used to call the variables of super class in the sub class
//We cant directly modify the super class field values

class Super{
    String name = "default";
    private int age = 0;
    //constructor
    Super(){
        System.out.println("name and age are set to default values");
    }
    Super(String name,int age){
        this.name = name;
        this.age = age;
    }
    //methods
    public void introduce(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //setter for age
    public void setage(int age){
        this.age = age;
    }
    //getters for age and name
    public int getage(){
        return this.age;
    }
}

class Sub extends Super{
    int salary = 0;
    Sub(){
        System.out.println("Salary is set to 0");
    }
    Sub(int salary){
        this.salary = salary;
    }
    Sub(String name,int age,int salary){
        super(name,age);
        this.salary = salary;
    }
    //methods
    //introduce
    public void introduce(){
        int x = super.getage();
        System.out.println("My name is "+super.name);
        System.out.println("My age is "+x);
        System.out.println("My salary is "+this.salary);
    }
}

class SupKeyword{
    public static void main(String a[]){
        Sub O1 = new Sub("Avinash",20,250000);
        O1.introduce();
    }
}

//Final keyword
//final keyword is used at three places
//if we use before class we can stop the inheritance for that class
//if we use before method we can stop method over riding
//if we use before variable we can stop modifying the value of that variable

//static keyword
//generally if we want to access a variable or method of a class we need to create an object
//but if we declare static in front of variables or methods we acess them directly without creating object
//if we declare static keyword, the variables and methods are bounded to the class not to the instance(object)
//we cant use access the instance variables inside static method directly, we need to create a instance of class inside the method

class Parent{
    static String name = "default" ;
    static int age = 0;
    final int roll = 69;
    Parent(String name,int age){
        this.name = name;
        this.age = age;
    }
    //static and final mthod
    final static public void introduce(){
        System.out.println(Parent.name);
        System.out.println(Parent.age);
    }
}

final class Child extends Parent{
    Child(String name, int age) {
        super(name, age);
    }
    public void introduce2(){
        System.out.println("I am a child class");
    }
}

class FinandStatKeyword{
    public static void main(String b[]){
        //calling Parent class variables directly without creating object
        System.out.println(Parent.name);
        System.out.println(Parent.age);
        Parent.introduce();
        Child O = new Child("Avinash",20);
        O.introduce();
    }
}