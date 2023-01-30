package netbeans.adder;
import java.util.Scanner;

/**
 *
 * @author halfrikan
 */
public class Adder {

    public static void main(String[] args) {
        //declare sum and initialize it to 0
        int sum = 0;
        //declare and initialize our operands
        int operand1 = 0;
        int operand2 = 0;
        
        //add a scanner object
        Scanner myScanner = new Scanner(System.in);
        
        //initialize the string inputs to be recieved 
        String stringOperand1 = "";
        String stringOperand2 = "";
        
        //ask for an input from the user for the first string
        //then collect that string with scanner object
        System.out.println("Please enter the first number to be added: ");
        stringOperand1 = myScanner.nextLine();
        
        //ask for an input from the user for the second string
        //then collect that string with scanner object
        System.out.println("Please enter the second number to be added: ");
        stringOperand2 = myScanner.nextLine();
        
        //convert the string objects into integers by passing the data 
        //through the Integer class
        operand1 = Integer.parseInt(stringOperand1);
        operand2 = Integer.parseInt(stringOperand2);
        
        //assign the sum of operand1 and operand2 to sum
        sum = operand1 + operand2;
        
        //NOTE: in thr output below, the plus (+) operator
        //is acting as the string concantenation operator
        //instead of the addition operator. In java, we use 
        //the plus operator to concantenate (or glue together)
        //string values.
        
        System.out.println("Sum is: " + sum);
    }
}
