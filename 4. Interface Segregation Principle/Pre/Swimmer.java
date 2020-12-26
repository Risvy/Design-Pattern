public class Swimmer implements Athlete {

    @Override
    public void compete() {
        System.out.println("--> Swimmer Started Competing!");

    }

    @Override
    public void swim() {
        System.out.println("--> Swimmer Started Swimming!");

    }

    @Override
    public void race() {
        System.out.println("--> Swimmer Is Unable To Race!");

    }

    

    @Override
    public void highJump() {
        System.out.println("--> Swimmer Is Unable To High Jump!");

    }
    
}
