//Lets have a look at inner classes,anonymous object,anonymous inner classes

//inner class
//inner class means a class will present inside another class
//method over-riding is  possible and even inheritance also possible in innerclasses
//in java we cant declare top level outter class as static, but nested classes can be static


class Outterclass{
    //outterclass
    public static void os(){
        System.out.println("This is static in outter");
    }
    public void oshow(){
        System.out.println("Show - Outter class");
    }

    class Innerclass{
        //inner class
        public static void is(){
            System.out.println("This is static in Inner");
        }
        public void ishow(){
            System.out.println("Show - Inner class");
        }

        class InnerInnerclass{
            //inside Inner class
            public static void i2s(){
                System.out.println("This is static in 2nd Inner");
            }
            public void i2show(){
                System.out.println("Show - 2nd Inner class");
            }
        }

        static class Innerstaticclass{
            public static void sis(){
                System.out.println("This is static in Inner");
            }
            public void sishow(){
                System.out.println("Show - Inner class");
            }
        }
    }
}

class Classandobject2{
    public static void main(String a[]){
        //Inner classes

        //to use an variable of type innerclass we should mention full path to avoid ambiguity to the compiler
        //for example the to declare a variable of "Innerclass" we must specify the path as "Outterclass.Innerclass"
        //example
        //Outterclass.Innerclass obj;
        //to create a object of Innerclass we must require an object of outterclass,if innerclass is a static class we can directly create the object
        //first lets create a Outterclass object
        Outterclass OC  = new Outterclass();
        Outterclass.os();
        OC.oshow();
        //lets create inner class object
        Outterclass.Innerclass IC = OC.new Innerclass();
        IC.ishow();
        Outterclass.Innerclass.is(); //static method in inner class
        //lets create inner inner class object
        Outterclass.Innerclass.InnerInnerclass IIC = IC.new InnerInnerclass();
        IIC.i2show();
        Outterclass.Innerclass.InnerInnerclass.i2s(); //static method
        //inner static class
        //as we know that to access static method we dont need an instance/object
        //similarly in inner class also we dont need to have any instance to access
        //example
        Outterclass.Innerclass.Innerstaticclass.sis();
        Outterclass.Innerclass.Innerstaticclass OIISC = new Outterclass.Innerclass.Innerstaticclass();
        OIISC.sishow();
    }
}

//Anonymous objects
//Anonymous object means we dont declare any object to use it
//we can justuse the anonynous object only once

//Anonymous inner classes
//Inner classes nested inside another class which wont have any name
//they even dont have any constructors as they dont have name
//they are used to implement the abstract classes
//but it cant define new methods that are not present inside the parent class,just we can over ride the method
//lets take an example

class Calci{
    int n1,n2;
    Calci(){
        n1 = 0;
        n2 = 0;
    }
    Calci(int n1,int n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    public void add(){
        System.out.println(n1+n2);
    }
    public void sub(){
        System.out.println(n1-n2);
    }
}
abstract class Calci2 extends Calci{
    Calci2(int n1,int n2){
        super(n1,n2);
    }
    abstract public void multiply();
}
class Anonymous{
    public static void main(String a[]){
        //lets create an anonymous object of calci
        //using calci methods without creating its object
        new Calci(2,3).add();
        new Calci(3,4).sub();
        //lets over ride multiply method to calci by sub class but using anonymous class
        //lets deckare a variable of parent class type
        Calci2 c = new Calci2(3,14){
            public void multiply(){
                System.out.println(this.n1*this.n2);
            }
        };
        c.add();
        c.sub();
        c.multiply();
    }
}