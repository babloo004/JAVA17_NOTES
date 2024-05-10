import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

class Input{
    public static void main(String a[]){
        //Output
        System.out.println("Hello World!");
        //println() method belongs to the PrintStream class
        //out is an object of PrintStream class
        //out is an static instance of PrintStream in System class

        //taking input
        //System.in.read();
        int b = -1; //assigning value
        try{
            System.out.println("Enter a Single digit number : ");
            b = System.in.read();
            //read() method belongs to the InputStream classes
            //in is a static instance of InputStream, which is declared in System class
            //this method gives us the ascii values in return
            //if we enter multi digit number it can take only single digit
            //this method throws checked IOException,hence we must habdle it either by try and catch or throws
        }catch(IOException e){
            System.out.println("IOException");
        }
        System.out.println(b-48);

        //taking input through input buffers
        //InputStreamReader accepts Inputstream object as argument
        //BufferedReader accepts InputStreamReader object as argument
        //BufferedReader class contains a method called readLine();
        //this method give any form of data as String
        //later we must convert them into our required type
        //this method also thowrs exception

        //creating a InputStream instance is prohibited like below commented line

        //InputStream is = null;

        //we should use the "Sytem.in" instance as InputStream instance
        //there are some errors
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);
        System.out.println("Enter your Name : ");
        try{
            System.out.println();
            String name = bfr.readLine();
            System.out.println("Name : "+name);
            System.out.println("Enter age : ");
            int age = Integer.parseInt(bfr.readLine());
            System.out.println("Age : "+age);
        }catch(IOException e){
            System.out.println("IOException");
        }

        //taking input through Scanner class

        //it also takes InputStream object as argument
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter state : ");
        String state = sc.nextLine(); //takes input string
        System.out.println("Enter age : ");
        int ag = sc.nextInt(); //takes int
        System.out.println("State : "+state);
        System.out.println("Age : "+ag);

        //we must close the scanner after use
        sc.close();
    }
}