interface Camera {
    default void diagnostics() { System.out.println("Running camera diagnostics."); }
}
interface Radio {
    default void diagnostics() { System.out.println("Running radio diagnostics."); }
}
// ERROR: Which diagnostics() should be used?
class SensorPod implements Camera, Radio {
    @Override
    public void diagnostics() {
        // Choose one, or do both!
        Camera.super.diagnostics();
        Radio.super.diagnostics();
    }
}