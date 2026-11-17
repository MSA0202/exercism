class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    public static final int DRIVE_UNITS = 10;

    private int totalDistanceTravelled;
    private int numberOfVictories;
    
    public void drive() {
        this.totalDistanceTravelled += DRIVE_UNITS;
    }

    public int getDistanceTravelled() {
        return this.totalDistanceTravelled;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    public int compareTo(ProductionRemoteControlCar other)
    {
        if(other == null) throw new NullPointerException("Cannot compare with null");
        // other, this implies descending. this, other implies ascending
        return Integer.compare(other.getNumberOfVictories(), this.getNumberOfVictories());
    }
}
