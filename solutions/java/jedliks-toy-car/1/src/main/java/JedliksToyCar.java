public class JedliksToyCar {
    private static final int singleDriveCoverageInMeters = 20;

    private int totalDistanceDrivenInMeters = 0;
    private int totalRemainingBatteryAsPercentage = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + totalDistanceDrivenInMeters + " meters";
    }

    public String batteryDisplay() {
        if(totalRemainingBatteryAsPercentage !=  0) return "Battery at " + totalRemainingBatteryAsPercentage + "%";
        return "Battery empty";
    }

    public void drive() {
        if(totalRemainingBatteryAsPercentage !=  0) {
            this.totalDistanceDrivenInMeters += singleDriveCoverageInMeters;
            this.totalRemainingBatteryAsPercentage--;
        }
    }
}
