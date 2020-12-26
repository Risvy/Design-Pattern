/*
The solution to these problems is a correct inheritance hierarchy. 
In our case we would solve the problem by differentiating classes of vehicles with and without engines.
So, we now we have two classes called 'VehicleWithEngine' and 'VehicleWithoutEngine'. Both extend 'Vehicle' class. 

*/





class Vehicle{
    String vehicleName;
    String getName(){
        return vehicleName;
    }
    void setName(String vehicleName){
        this.vehicleName= vehicleName;
    }

    double speed;
    double getSpeed()
    {
        return speed;
    }
    void setSpeed(Double speed){
        this.speed= speed;
    }
   
}
class Engine{
    //Sample engine
}

class VehicleWithEngine extends Vehicle{
    
    Engine engine;
    Engine getEngine(){
        return engine;
    }
    void setEngine(Engine engine){
        this.engine= engine;
    }

    void startEngine(){
        //Engine of a vehicle starts.
    }
}

class VehicleWithoutEngine extends Vehicle{
    void startMoving(){
    }
    
}

class Bicycle extends VehicleWithoutEngine{

    @Override
    void startMoving() {
        System.out.println("--> Bicycle Starts Moving!");
    }
}

class Car extends VehicleWithEngine{

    @Override
    void startEngine() {
        System.out.println("\n--> Car Starts!");
    }
}

public class Main{
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();

        Bicycle bicycle= new Bicycle();
        bicycle.startMoving();

        System.out.println("--> Example of Liskov Substitution Principle!");
    }
}
