/*
The open/closed principle (OCP) states that a module should be open to extension but closed for modification.
We are creating a simple calculator module with only two operations addition and subtraction.
Now if a developer wants to add the capability of multiplication – he has to change the 'Main' class code and the method calculate(). 
Thus, this code does not follow the Open-closed Principle.

*/


import java.security.InvalidParameterException;

public class Main{
    public static void main(String[] args) {
        System.out.println("\n--> Violation of Open Close Principle");
    }

public void calculate (Operation operation)
{
    if(operation==null) throw new InvalidParameterException("Please Enter Two Valid Numbers");
    if(operation instanceof Addition )
    {
        Addition add = (Addition) operation;
        add.setResult(add.getFirstNumber()+ add.getSecondNumber());
    }
    else if (operation instanceof Subtraction)
    {
        Subtraction sub= (Subtraction) operation;
        sub.setResult(sub.getFirstNumber()- sub.getSecondNumber());
    }
}

}
