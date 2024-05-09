//The Java Collections framework contains a set of interfaces, along with their implementations, that provide various data structures and algorithms to work with collections of objects. 
//The core interfaces in the Java Collections framework are:
//Collection - interface - root interface for list,set,Queue
//List - interface - extends Collections interface
//Set - interface - extends Collections interface
//Queue - interface - extends Collections interace
//"Collection" interface is an interface which contains basic methods like add,update,remove
//"Collection" interface is extended by other interface like "List","Set"."Queue","Deque"  which contains other special methods depending on their data types
//ArrayList implements "List" interface
//Hashset implements "Set" interface etc...
//"Map" is another interface, which doesn't extends "Collection" class
//We should import the packages to use "Collection"
//              ____________________________________________________________
//              |               Collection (Interface)                      |
//              |                         |                                 |
//              |           ------------------------------------------      |
//              |           |           |              |             |      |
//              |         List         Set           Queue         Deque    |
//              |           |           |             |                     |
//              |      ArrayList      HashSet      PriorityQueue            |
//              |      LinkedList     TreeSet      ArrayDeque               |
//              |___________________________________________________________|

//Generics
//<Integer> these are Generics,these are used to refer which type of elements are we storing in Classes
//Integer is a wrapper class
//we use generics to avoid run time errors 


//Collections
//"Collections" is a class in java,which contains some predefined methods to work like "sort()"
//because the sort() method requires a List as its argument, not a Collection.
// The reason for this is that the sort() method needs to access elements in a specific order to perform the sorting operation.

//Comparable - Functional Interface - compareTo() - to define natural comparing
//Comparator - Functional Interface - compare() - to define custom compering

//Collections class is a class which contains predifined method to work with Collection interfaces
//for example sort() methods is method provided by Collections class
//if they aare integers or strings it will automatically sorts
//but if we want to sort our custom object, then the objectmust implement Comparable interface 
//the object should complete the compareTo method and provide logic to compare

//when we run Collections.sort(), the compiler will go to comparable interface and there after to the "compareTo()"
import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int age;
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    //overriding compareto() method
    public int compareTo(Student that){
        if(this.age>that.age){
            return 1;
        }else{
            return -1;
        }
    }
}

class JavaCollections{
    public static void main(String a[]){
        List<Integer> l1 = new LinkedList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        Collections.sort(l1);
        for(int n:l1){
            System.out.println(n);
        }
        //ok lets sort the elements present in l2 by their last digit
        //but bydefault we r not having any such methods
        //when the elements are numbers,strings it automatically sorts
        //but if we want to sort our own object,we must define the code in "compareTo()"  method,which lies inside "Comparable" interface
        //then if we apply "Collections.sort()" method, it will go to "compareTo()" method to check criteria for compsring two elements and sorting
        //so we must define our own logic in "compareTo()" method
        //for some wrapper classes like <Integer> the compareTo() method is default,we cant over write it
        //In such cases we must use "Comparator" interface which contains "compare()" method
        //so let us define logic to sort numbers on last digits
        List<Integer> l2 = new ArrayList<Integer> ();
        l2.add(34);
        l2.add(54);
        l2.add(541);
        l2.add(98);
        l2.add(99);
        Comparator<Integer> comparator = new Comparator<Integer>() {
            public int compare(Integer i,Integer j){
                if(i%10>j%10){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        //now lets sort the List
        //we must pass the comparator as parameter to sort()
        Collections.sort(l2,comparator);
        for(int n:l2) System.out.println(n);

        //lets define our custom object student
        List<Student> StudentList = new ArrayList<Student>();
        StudentList.add(new Student("Avinash",20));
        StudentList.add(new Student("Manu",18));
        StudentList.add(new Student("Tejaprakash",22));
        StudentList.add(new Student("Rajesh",21));

        Collections.sort(StudentList);
        for(Student s:StudentList) System.out.println(s.name+" - "+s.age);
    }
}

//comparable vs comparator

//comparable
//Comparable provides a single sorting sequence. In other words, we can sort the collection on the basis of a single element such as id, name, and price.
// Comparable affects the original class, i.e., the actual class is modified.
//Comparable provides compareTo() method to sort elements.

//comparator
//The Comparator provides multiple sorting sequences. In other words, we can sort the collection on the basis of multiple elements such as id, name, and price etc.
//Comparator doesn't affect the original class, i.e., the actual class is not modified.
//Comparator provides compare() method to sort elements.