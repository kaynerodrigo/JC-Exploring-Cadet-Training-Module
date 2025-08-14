public class FixedWingDrone extends Drone implements AdvancedRecon {
    public FixedWingDrone(String callsign) {
        super(callsign);
    }

    public void fly() {
        System.out.println(getCallsign() + " is cruising at high altitude");
    }

    public void takePicture() {
        System.out.println(getCallsign() + " captures high-resolution satellite imagery.");
    }

    public void interceptSignal() {
        System.out.println(getCallsign() + " intercepts and analyzes radio frequencies.");
    }

    @Override
    public void record4kVideo() {
        System.out.println("Engaging gimbal-stabilized 4K video recording.");
    }
}
