//Java17
//JVK contains JVM and JVE
//JVM is responsible for running our code 
//JVM is capable of running the byte code
//1st of all we should compile the java code into byte by giving the command javac (filename)
//2nd we shold run the java code by running command java (byte code filename)


//first we should keep our code inside a class of our desired name
//class names should  start with capital name


class Basic{
    public static void main(String a[]){//this line is mandatory
        System.out.println("Hello World");
        int b = 5;
        int c = 10;
        float d = 5.66f;
        double e = 54.34433;
        System.out.println(b+c+d+e);

        //conversions are of two types they are implict and explict
        // implicit connversions are safe
        // in implicit conversions we are converting the small range objectx to large range objects
        // no casting is required. automatically cast the variable
        int intValue = 5;
        double doubleValue =  intValue;
        System.out.println(doubleValue);

        //explicit conversions are unsafe. we may loose the data
        //in explicit conversions we are converting the large range object to small range object
        //for this we should to casting manually
        double dV = 10.55;
        int iV = (int) dV;
        System.out.println(iV);

        //logical operators
        //and operator - &
        //or operator - |
        //not operator - !

        //short circuit operators
        // && - double ampersand 
        // || - double pipe

        //comparision operators
        // > - greater than
        // < - less than
        // >= - greater than or equal to
        // <= - less than or equal to
        // == - equal to
        // != - not equal to

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //if-else conditions
        int age = 20;
        if(age<=19 && age>=13){
            System.out.println("You are Teenager!");
        }else if(age>19 && age<=30){
            System.out.println("You are youngster!");
        }else if(age>30 && age <=59){
            System.out.println("You are middle ager!");
        }else if(age >59){
            System.out.println("You are Old!");
        }

        //Tenary
        // a simpilified version of if else statements
        //It allows for only two conditions
        //condition ? valueIfTrue : valueIfFalse; -> basic syntax
        //even we can do neested tenarys
        int voteeligibility = (age>18)?1:0;
        String ans = (voteeligibility==1)?"Eligile":"Not Eligible";
        System.out.println(ans);

        //Nested Teneray
        String nationality = "Indian";
        String result = (age>18)?((nationality=="Indian")?"Eligible" : "Not Eligible") : "Not Eligible";
        System.out.println(result);

        //switch
        //if you miss the break statement the case wont terminate even after becoming true
        // it eventually executes all the next cases also
        int income = 2;
        switch (income){
            case 1 :
                System.out.println("You are earning 1 crpa");
            case 2:
                System.out.println("You are earning 2 crpa");
                break;
            case 3:
                System.out.println("Your are earning 3crpa");
            default:
                System.out.println("You are your boss!");
        }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        //Loops
        //While loop
        int o = 10;
        while(o>=0){
            System.out.println(o);
            o--;
        }

        //for loop
        for(int p=0;p<=10;p++){
            System.out.println(p);
        }
    }
}
