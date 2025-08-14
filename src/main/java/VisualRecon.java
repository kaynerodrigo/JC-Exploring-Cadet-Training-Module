// Not a class, but a contract. It defines set of behaviors


public interface VisualRecon {
    // public static and final by default
    String SENSOR_STYPE = "High-Resolution Optical Camera";

    // abstract method: the core capability this interface guarantees.
    // any class implementing this must provide a body for this method
    void takePicture();

    // A default method provides a body.
    // This allows us to add methods to interfaces
    // without breaking existing classes that implement them
    default void record4kVideo() {
        System.out.println("Recording 4k video using default settings.");
    }

    // A static method belongs to the interface itself, not to any object
    // implementing class. It's a helper utility function related to concept of visual
    // Reconnaissance
    static String getStandardLensType() {
        return "50mm Standard lens";
    }
}
