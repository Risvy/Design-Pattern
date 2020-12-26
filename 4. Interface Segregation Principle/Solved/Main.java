/*
To solve the problem, We will follow the interface segregation principle and refactor the original interface.
Then we will create two or more other interfaces, as necessary — one for Swimming athletes, others for Racers, High Jumpers etc.
Thus, no client is forced to depend on methods it doesn't use. So our code will follow the Interface Segregation Principle.

*/


public class Main{
    public static void main(String[] args) {

        System.out.println("\n");

        Swimmer swimmer= new Swimmer();
        swimmer.compete();
        swimmer.swim();
        
        System.out.println("\n");

        Racer race = new Racer();
        race.compete();
        race.race();
        
        System.out.println("\n");

        HighJumper highJumper= new HighJumper();
        highJumper.compete();
        highJumper.highJump();



        System.out.println("\n # Example of Interface Segregation Principle!!\n");
    }
}