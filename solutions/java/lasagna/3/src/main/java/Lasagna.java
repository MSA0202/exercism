public class Lasagna {
    private static final int EXPECTED_COOKING_TIME_IN_MINUTES = 40;
    private static final int PREPARATION_TIME_PER_LAYER_IN_MINUTES = 2;
    
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
        // We could have thrown illegal argument exception for <0 inputs
        return numberOfLayers*PREPARATION_TIME_PER_LAYER_IN_MINUTES;
    }

    public int totalTimeInMinutes(int numberOfLayers, int minutesSpentInOven)
    {
        return preparationTimeInMinutes(numberOfLayers) + minutesSpentInOven;
    }
}
