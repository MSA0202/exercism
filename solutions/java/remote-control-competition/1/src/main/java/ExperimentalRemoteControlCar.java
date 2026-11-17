public class ExperimentalRemoteControlCar implements RemoteControlCar {

    public static final int DRIVE_UNITS = 20;

    private int totalDistanceTravelled;

    public void drive() {
        this.totalDistanceTravelled += DRIVE_UNITS;
    }

    public int getDistanceTravelled() {
        return this.totalDistanceTravelled;
    }
}
