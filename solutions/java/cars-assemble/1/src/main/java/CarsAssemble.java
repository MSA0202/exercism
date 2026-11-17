public class CarsAssemble {

    public static final int CARS_PRODUCED_PER_HOUR_AT_MIN_LINE_SPEED = 221;

    public double productionRatePerHour(int speed) {
        if(speed >=1 && speed <= 4) return calculateCarsProducedPerHour(speed) * 1;
        else if(speed >=5 && speed <= 8) return calculateCarsProducedPerHour(speed) * 0.9;
        else if(speed == 9) return calculateCarsProducedPerHour(speed) * 0.8;
        else return calculateCarsProducedPerHour(speed) * 0.77;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (this.productionRatePerHour(speed) / 60);
    }

    private int calculateCarsProducedPerHour(int speed)
    {
       return speed * CARS_PRODUCED_PER_HOUR_AT_MIN_LINE_SPEED;
    }
}
