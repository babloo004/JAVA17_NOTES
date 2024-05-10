//Execeptions
//in java there are three types of errors 1.compiletime errors 2.runtime errors 3.logical errors
//compile time errors are shown during compiling of code by compiler, so no need to worry
//in logical errors , code will run without any fault but the output will differ with the expected output
// but incase of run time errors, the execution will stop in middle, so we should handle the run time erros

//exceptions
//exceptions are of two types, checked exceptions and unchecked exceptions
//checked exceptions are must, we should handle the execptions,even compiler will show us. examples are IO exceptions, SQLexceptions
//unchecked exceptions are occured because of critical statements
//exceptions are handled by try and catch block

class Exceptions{
    public static void main(String a[]) throws Exception{
        int i = 0;

        //see the comment line below 

        //int j = 18/i; //critical statement, because if i=0, then division by zero will lead to error

        // as the above statement is crtical, we should surround it with try and catch block
        //try and catch means we are telling java to try to execute the code in try block, if any error occurs the catch block will handle it
        //advantage of try and catch block is, even if there is any error the further code execution wont stop
        //catch() method will takes "Exception" object as input
        //"Exception" is class, ir=t contains different exception classes 

        //case 1
        int j;
        try{
            j = 18/i;
        }
        catch(Exception e) {
            j = 18;
            System.out.println("Cant divide with zero");
        }
        //we can use multiple try and catch() blocks
        //lets create an array and if we try to print element greater than its index, it will give exception "ArrayIndexOutOfBoundsException"

        //case 2
        int arr[] = new int[5];
        //so lets handle that case
        try{
            System.out.println(arr[5]);
        }
        catch(Exception e){
            System.out.println("Compiler throws ArrayIndexOutOfBoundsException");
        }

        //we can have a single try and multiple catch() methods
        //for that lets combine bothe cases
        //we dont know which case will throw exception, I want seperate exception for each cases

        int k = 0;
        int arr2[] = new int[5];
        int l;
        try{
            l = 20/k;
            System.out.println(arr2[6]);
        }
        catch(ArithmeticException e){ //throws when divided by zero
            l = 20;
            System.out.println("Because of exception default value has set");
        }
        catch(ArrayIndexOutOfBoundsException e){ //throws when we access array out of limit
            System.out.println("Array accesed beyond its limit");
        }
        catch(Exception e){ //for general case
            System.out.println("Something went wrong...!");
        }

        //throw keyword
        //it is used inside try block to throw a exception if the condition declared is met
        //if there are multiple catch block, then it will be more usefull
        //lets use the above example by using throw keyword;

        int m,n,o;
        int arr3[] = new int[5];
        try{
            m = 0;
            n = 14/m;
            o = 9;
            System.out.println(n);
            if(m==0){
                throw new ArithmeticException();
            }
            System.out.println(arr3[o]);
            if(o>4){
                throw new ArrayIndexOutOfBoundsException();
            }
        }
        catch(ArithmeticException e){
            System.out.println("Arithematic exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of index");
        }
        catch(Exception e){
            System.out.println("Exception...!");
        }

        System.out.println("j : "+j);
        System.out.println("Execution completed!");
    }
}

//now lets have a look at "thorws" keyword
//remember "throws" is different from "throw"
//in simple terms throws keyword is used to escape from habdling exception
//n=but it is a bad practise
//throws is used beside defining method

//Exception hirearchy

//Throwble - class
//exception - class