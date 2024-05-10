//The Stream API in Java is a powerful feature introduced in Java 8 to perform aggregate operations on collections of data in a declarative and functional style.
//It allows developers to process data efficiently, leverage parallel processing, and write concise and expressive code.
//Stream is an interface,which contains methods like "filter()","reduce","forEach()"
//Advantages of Streams  1.Memory Usage 2.Performance 3.Performance 4.Convenience
//Stream follows the concept of "immutable data processing"
//Immutable data processing refers to the practice of working with data in a way that ensures the original data remains unchanged during the processing operations.
//we can just apply operations or methods on streams only once,after the completion the data will disappear and wont exisit in memory
//after the using the stream ,the Stream is closed and we cant use
//varaiable of Stream type stores the memory loction just like the Strings
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
class StreamAPI{
    public static void main(String a[]){
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);

        //to apply stream methods like foreach(),reduce(),filter() the data must be in the streams form
        //so lets convert the data into streams  by stream() method
        //stream()  ethod returns the stream
        Stream<Integer> s1 = l.stream();

        //foreach()
        //foreach() method takes "Consumer" object as argument
        //Consumer is a functional interface, which contains method "accept()"
        //when we apply foreach(), every element will be passed into the accept() and run our defined code in accept() method
        //so lets create Consumer object and define accept() to distinguish between odd and even numbers
        //foreach() applies the given code to every element through accept() method
        //it modifies the original value
        Consumer<Integer> consumer = new Consumer<Integer>(){
            public void accept(Integer i){
                if(i%2==0){
                    System.out.println(i+" is an even number");
                }else{
                    System.out.println(i+" is an odd number");
                }
            }
        };
        s1.forEach(consumer);

        //filter()
        //filter() returns stream which passes our code
        //it accepts "Predicate" object as argument
        //Predicate is a functional argument, which contains "test()" method and return boolean values
        //lets create Predicate object and define test() method
        //lets write code to filter the numbers divisible by 3
        Predicate<Integer> predicate = new Predicate<Integer>(){
            public boolean test(Integer i){
                if(i%3==0){
                    return true;
                }else{
                    return false;
                }
            }
        };

        //as filter() method needs stream,lets create a stream
        Stream<Integer> s2 = l.stream();
        //as filter() returns stream, lets create a stream object
        Stream<Integer> s3 = s2.filter(predicate);
        s3.forEach(n->System.out.println(n));

        //In stream there are any methods like map(),reduce()...etc all of them follow the same method of implementation
        //s.map();
        //s.reduce();
    }
}