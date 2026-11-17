
class BirdWatcher {
    private final int[] birdsPerDay;
    private static final int[] lastWeeksBirdsPerDay = {0, 2, 5, 3, 7, 8, 4};

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return lastWeeksBirdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[getNumberOfDaysCaptured() - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[getNumberOfDaysCaptured() - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int birds : birdsPerDay) {
            if(birds == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {

        if(numberOfDays > getNumberOfDaysCaptured()) numberOfDays = getNumberOfDaysCaptured();
        
        int totalCount = 0;
        
        for(int i = 0; i < numberOfDays; i++) {
            totalCount += this.birdsPerDay[i];
        }
        
        return totalCount;
    }

    public int getBusyDays() {
        int numberOfBusyDays = 0;

        for(int bird : this.birdsPerDay) {
            if(bird >= 5) numberOfBusyDays++;
        }

        return numberOfBusyDays;
    }

    // Private helpers
    private int getNumberOfDaysCaptured()
    {
        return this.birdsPerDay.length;
    }
}
