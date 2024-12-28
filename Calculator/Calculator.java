package Calculator;

//Define the class
public class Calculator
{


    //Create a constructor method
    public Calculator()
    {

    }

    //Add method
    public int add(int a, int b)
    {
        return a + b;
    }


    //Subtract method
    public int subtract(int a, int b)
    {
        return a - b;
    }


    //Multiply method
    public int multiply(int a, int b)
    {
        return a * b;
    }


    //Divide method
    public int divide(int a, int b)
    {
        return a / b;
    }


    //Remainder method
    public int modulo(int a, int b)
    {
        return a % b;
    }


    //Modify the return value of the memory location of the myCalculator
    public String toString()
    {
        System.out.println();
        System.out.println();
        return "Why do you need to know where a Calculator is? Did you lose yours? It's probably in your back pocket.";

    }


    //Initialize the main method
    public static void main(String[] args)
    {

        //Create a Calculator object
        Calculator  myCalculator = new Calculator();

        //Add 5 and 7
        System.out.println(myCalculator.add(5,7));

        //Subtract 45 and 11
        System.out.println(myCalculator.subtract(45, 11));

        //Multiply 33 and 10
        System.out.println(myCalculator.multiply(33, 10));

        //Divide 400 and 4
        System.out.println(myCalculator.divide(400, 4));

        //Find the remainder of 14 and 6
        System.out.println(myCalculator.modulo(14, 6));

        /**
         * Print the memory location
         */

        System.out.println(myCalculator.toString());

    }



}