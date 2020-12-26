/*
Liskov Substitution Principle states that any object of some class in an object-oriented program can be replaced by an object of a child class.
There is no problem when we implement the 'Car' class. We simply run the startEngine() method to start the vehicle, which in this case is a car.
But if we want to implement a 'Bicycle; class, Problem starts to occur. Because bicycle is a kind of vehicle, but it has no engine. 
Thus, it violates the Liskov Substitution Principle. 
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

class Engine{
    //Sample engine
}

class Car extends Vehicle{
    @Override
    void startEngine() {
        //super.startEngine();
        System.out.println("\n--> Car Starts!");
    }
}

class Bicycle extends Vehicle{
    @Override
    void startEngine() {
        //super.startEngine();
        //Problem, A bicycle doesn't have any engine.
        System.out.println("--> A bicycle doesn't have any engine, Unable to start!");
    }
}

public class Main{
    public static void main(String[] args) {

        Car car = new Car();
        car.startEngine();

        Bicycle bicycle= new Bicycle();
        bicycle.startEngine();

        System.out.println("--> Violation of The Liskov Substitution Principle!");


    }
}