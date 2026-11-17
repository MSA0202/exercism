public class Lasagna {
    private static final int EXPECTED_COOKING_TIME_IN_MINUTES = 40;
    
    public int expectedMinutesInOven()
    {
        return EXPECTED_COOKING_TIME_IN_MINUTES;
    }

    public int remainingMinutesInOven(int minutesSpentInOven)
    {
        // Has not cooked
        if(minutesSpentInOven < 0)
            return expectedMinutesInOven();

        // You overcooked it
        else if (minutesSpentInOven > expectedMinutesInOven())
            return 0;
    
        return expectedMinutesInOven() - minutesSpentInOven;
    }

    public int preparationTimeInMinutes(int numberOfLayers)
    {
        // We could have thrown illegal arg exception for <0 inputs
        return numberOfLayers*2;
    }

    public int totalTimeInMinutes(int numberOfLayers, int minutesSpentInOven)
    {
        return preparationTimeInMinutes(numberOfLayers) + minutesSpentInOven;
    }
}
