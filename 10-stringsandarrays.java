//strings
//strings are of two types in java
//strings are mutable and immutable
//immutable strings are the string constant pool and string object
//once the immutable strings are created we cant modify them,instead a new copy will be created and assigned to the variable
//muttable strings can be modified. examples are string buffers and string builders
//strings - string constant pool
//string is a not a primitive data like int,float,double..etc
//we declare string as "String" with capital "S" which represents string is a class
//so string being a class we must declare a object to use properties

class Strings{
    public static void main(String a[]){
        String b = new String("Avinash");
        String c = new String("Avinash");
        System.out.println(b==c); //false
        //because each object will store each value in different memory locations
        String d = "Avinash";
        String e = "Avinash";
        System.out.println(d==e);//true
        //string constant pool is a memory for storing the unique strings
        //if a same string values is found, then the memory address will be stored by the variable
        //if we modify the strings like concatination, a new value with modification will be formed and old value will be still in memory
        //so String objects and string constant pool are immutable
        //mutable strings
        StringBuffer f = new StringBuffer("Avinash");
        StringBuffer h = new StringBuffer("Avinash");
        System.out.println(f==h);//false
        StringBuilder g = new StringBuilder("Avinash");
        System.out.println(g);
        //we should select among the categories depending upon on use
        //if we want to modify the string repeatedly, then we should choose mutables,otherwise can select immutables for memory saving
    }
}

//Arrays
class Arrays{
    public static void main(String a[]){
        //creating an array
        System.out.println("This is 1D array!");
        System.out.println();
        int arr1[] = {1,2,3,4,5};//same as c++ we cant change the number of elements in an array
        int arr2[] = new int[7];// we can declare array of our custom size, if you dont know the elements
        for(int o = 0;o<5;o++){
            System.out.println(arr1[o]);
        };
        for(int o=0;o<7;o++){
            System.out.println(arr2[o]);
        };
        System.out.println();
        //multi-dimensional array
        //2d array
        //it is normal array. All the rows contains equal amount of elements
        System.out.println("This is 2D normal array!");
        System.out.println();
        int arr3[][] = new int[5][4];
        for(int ar[] : arr3){
            for(int o=0;o<ar.length;o++){
                ar[o] = (int)(Math.random()*100);
            }
        }

        for(int ar[] : arr3){
            for(int ele : ar){
                System.out.print(ele + " ");
            }
            System.out.println();
        };
        System.out.println();
        //if the rows contains unequal elements, then they are called jagged arrays
        //jagged array
        System.out.println("This is 2D Jagged array!");
        System.out.println();
        int arr4[][] = new int[4][]; //row size is not declared
        arr4[0] = new int[5]; //declaring each row size individually
        arr4[1] = new int[2];
        arr4[2] = new int[3];
        arr4[3] = new int[6];

        for(int ar[] : arr4){
            for(int o=0;o<ar.length;o++){
                ar[o] = (int)(Math.random()*100);
            }
        }

        for(int ar[] : arr4){
            for(int ele : ar){
                System.out.print(ele + " ");
            }
            System.out.println();
        };
        System.out.println();
    }
}