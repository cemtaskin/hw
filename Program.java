public class Program {
    
    public static void main (String[] args){

        //This is a comment

        System.out.println("Hello World");
        System.out.println("I am learning Java.");
        System.out.println("It is awesome!");
        /* 
        System.out.print("Hello World");
        System.out.print("I am learning Java.");
        System.out.print("It is awesome!");
        
        
        System.out.println(3);
        System.out.println(358);
        System.out.println(50000);
        */

        System.out.println(3+3);
        System.out.println(2*5);
        System.out.println(add(4,10));

        String name = "Ali Duru"; //Declare a variable with the type of string and assing Jonh value for storing
        System.out.println(name); //print outs the value of the variable
        System.out.println(name.length()); //print outs the lenght of the stored value in variable
    
        int firstNumber = 20; //Declara a variablw with the type of interger and assing 20 value for storing
        System.out.println(firstNumber);


        firstNumber = 40; //we assing a new value to store in fistNumber variable

        int secondNumber = 35;
        System.out.println(secondNumber);

        System.out.println("Addition of two numbers : " + add(firstNumber,secondNumber));
        System.out.println("Addition of two numbers : " + (firstNumber + secondNumber));

        final int myNumber=15; //final means that we can assing value to a final variable only once 

        System.out.println(myNumber);


    }

    /**
     * Add two numbers and returns the result
     * @param a first number to add
     * @param b second number to add
     * @return addition result
     */
    public static int add (int a, int b){
        return a+b;
    }

    

}

