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

