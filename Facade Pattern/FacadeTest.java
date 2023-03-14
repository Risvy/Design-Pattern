/*
Facade Pattern
--------- ---------
# Facade pattern violates the Open Closed principle, which we can solve by using Command pattern.
---------- ---------- --------
Lights on
Fan starts
PC on
Projector show

Lights off
Fan stops
PC off
Projector stop


*/



import java.util.ArrayList;

/**
 * Light
 */
class Light {
    String name;
    Light(String name){
        this.name= name;
    }

    void on(){
        System.out.println(name + "is on");
    }

    void off(){
        System.out.println(name + "is off");
    }

}


class Fan {
    String name;
    Fan(String name){
        this.name= name;
    }

    void start(){
        System.out.println(name + "is now starting");
    }

    void stop(){
        System.out.println(name + "is now starting");
    }

}

class Projector {
    String name;
    Projector(String name){
        this.name= name;
    }

    void show(){
        System.out.println(name + "screen is now visible");
    }

    void stop(){
        System.out.println(name + "screen has stopped");
    }

}

class PC {
    String name;
    PC(String name){
        this.name= name;
    }

    void on(){
        System.out.println(name + "is now turned on");
    }

    void off(){
        System.out.println(name + "is turned off");
    }

}


class Facade{
    ArrayList <Light> light_arr = new ArrayList<>();
    ArrayList <Fan> fan_arr = new ArrayList<>();
    ArrayList <PC> pc_arr = new ArrayList<>();
    Projector projector;

    void addLight(Light light){
        light_arr.add(light);
    }

    void addFan(Fan fan){
        fan_arr.add(fan);
    }
    void addPC(PC pc){
        pc_arr.add(pc);
    }

    void setProjector (Projector projector){
        this.projector = projector;
    }


    void start_class(){
        for(Light light : light_arr)
            light.on();

        for(Fan fan : fan_arr)
            fan.start();

        for(PC pc : pc_arr)
            pc.on();

        projector.show();


    }

    void stop_class(){
        for(Light light : light_arr)
            light.off();
    
    for(Fan fan : fan_arr)
            fan.stop();

        for(PC pc : pc_arr)
            pc.off();

        projector.stop();
    }

}

public class FacadeTest {
    public static void main(String[] args) {
        System.out.println("Code Chole!");

        Facade facade = new Facade();
        
        facade.addLight(new Light ("Light 1 "));
        facade.addLight(new Light ("Light 2 "));

        facade.addFan(new Fan("Fan 1 "));
        facade.addFan(new Fan("Fan 2 "));

        facade.addPC(new PC("PC 1 "));

        facade.setProjector(new Projector("Projector X "));

        facade.start_class();
        System.out.println("\n");
        facade.stop_class();



    }
}
