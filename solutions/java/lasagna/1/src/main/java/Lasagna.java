public class Lasagna {
    private static final int EXPECTED_COOKING_TIME_IN_MINUTES = 40;
    
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven()
    {
        return EXPECTED_COOKING_TIME_IN_MINUTES;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutesSpentInOven)
    {
        // Has not cooked
        if(minutesSpentInOven < 0)
            return EXPECTED_COOKING_TIME_IN_MINUTES;

        // You overcooked it
        else if (minutesSpentInOven > EXPECTED_COOKING_TIME_IN_MINUTES)
            return 0;
    
        return EXPECTED_COOKING_TIME_IN_MINUTES - minutesSpentInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayers)
    {
        // We could have thrown illegal arg exception for <0 inputs
        return numberOfLayers*2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayers, int minutesSpentInOven)
    {
        return preparationTimeInMinutes(numberOfLayers) + minutesSpentInOven;
    }
}
