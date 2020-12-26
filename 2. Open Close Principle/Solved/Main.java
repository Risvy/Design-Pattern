/*
To follow the Open Closed Principle, we need to delegate the responsibility of providing the calculation logic inside the operation itself. 
Each operation must have it’s own logic to get the result and operand. In this way, we can implement the Open Closed Principle.

*/


import java.security.InvalidParameterException;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n--> This is an Example of Open Closed Principle");
    }

    public void calculate(Operation operation){
        if(operation==null){
            throw new InvalidParameterException("Please Enter Two Valid Numbers");
        }
        operation.performCalculation();
    }

}

