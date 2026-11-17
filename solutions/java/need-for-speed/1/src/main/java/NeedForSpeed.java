class NeedForSpeed {

    private int speed;
    private int batteryDrain;

    private int totalDistanceDriven;
    private int totalBatteryLife = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return totalBatteryLife < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.totalDistanceDriven;
    }

    public void drive() {
        if(!this.batteryDrained()) {
            this.totalDistanceDriven += this.speed;
            this.totalBatteryLife -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getBatteryDrain() {
        return this.batteryDrain;
    }
}

class RaceTrack {

    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    /**
    * Time = Distance / Speed
    * The time required for the car to complete the race must be less than
    * or equal to the time its battery takes to drain completely.
    * If this condition is met, the car can finish the race.
    */
    public boolean canFinishRace(NeedForSpeed car) {
        return ((double) distance / (double) car.getSpeed()) <= (100.00 / (double) car.getBatteryDrain());  
    }
}
