// extends Drone It must provide a body for the abstract fly method()
// extends VisualRecon: QuadCopter signs the contract to provide the VisualRecon capabilities.
// It must provide a body for the abstract takePicture() method.
// It can, but is not required to,
// override the record4kVideo() default method.
public class QuadCopter extends Drone implements VisualRecon {
    public QuadCopter(String callsign) {
       super(callsign);
    }

    public void fly() {
        System.out.println(getCallsign() + " is hovering with four rotors.");
    }

    public void takePicture() {
        System.out.println(getCallsign() + " takes a picture with its " + SENSOR_STYPE);
    }


 }