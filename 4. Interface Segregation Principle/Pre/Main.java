/*
The interface segregation principle states that no client/class should be forced to depend on methods it does not use.
In our case, the 'Athlete' interface is an interface with some actions of an athlete.
We have added the method 'compete()'', but also there some extra methods like swim(), highJump() , and race().
Suppose we have a swimming athlete. 
By implementing the Athlete interface, we have to implement methods like highJump() and race(), which the swimming athlete will never use.

*/


public class Main{
    public static void main(String[] args) {
        Swimmer swimmer= new Swimmer();

        System.out.println("\n");

        swimmer.compete();
        swimmer.swim();
        swimmer.race();
        swimmer.highJump();

        System.out.println("\n # Violation of Interface Segregation Principle!!\n");
    }
}