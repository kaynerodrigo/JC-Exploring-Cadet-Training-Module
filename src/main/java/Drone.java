
// This is a class blueprint, you cannot create an object of this type
abstract public class Drone {

    // a standard inherited property
    private String callsign;

    // private String callsign - a standard inherited property
    public Drone(String callsign) {
        this.callsign = callsign;
    }

    // Concrete method: All drones take of the same way
    public void takeOff() {
        System.out.println(callsign + " is taking off.");
    }

    public void land() {
        System.out.println(callsign + " is landing.");
    }

    // Abstract method: the flight pattern is specific to the drone model.
    // We force subclasses to define how they fly
    public abstract void fly();

    public String getCallsign() {
        return this.callsign;
    }
}
