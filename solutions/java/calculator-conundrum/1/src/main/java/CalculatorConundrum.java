import java.util.*;

class CalculatorConundrum {

    private static final String PLUS_OPERATOR = "+";
    private static final String MULTIPLICATION_OPERATOR = "*";
    private static final String DIVISION_OPERATOR = "/";
    
    private static final List<String> allowedMathematicalOperators = List.of(PLUS_OPERATOR, MULTIPLICATION_OPERATOR, DIVISION_OPERATOR);
    
    public String calculate(int operand1, int operand2, String operation) {

        try {
            validateOperation(operation);
            
            if(operation.equals(PLUS_OPERATOR)) return printResult(operand1, operand2, operation, operand1 + operand2);
                
            else if(operation.equals(MULTIPLICATION_OPERATOR)) return printResult(operand1, operand2, operation,operand1 * operand2);
                
            else return printResult(operand1, operand2, operation, operand1 / operand2);
        }
        catch(ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
    }

    // Private Helpers
    
    private void validateOperation(String operation)
    {
        if(operation == null) throw new IllegalArgumentException("Operation cannot be null");
            
        else if(operation.isEmpty()) throw new IllegalArgumentException("Operation cannot be empty");
            
        else validateAllowedOperators(operation);
        
    }

    private void validateAllowedOperators(String operation)
    {
        boolean operatorIsValid = false;
        
        for(String allowedMathematicalOperator : allowedMathematicalOperators) {
            if(operation.equals(allowedMathematicalOperator))
            {
                operatorIsValid = true;
                break;
            }
        }

        if(!operatorIsValid) throw new IllegalOperationException("Operation "+"'"+operation+"'"+" does not exist");
    }

    private String printResult(int operand1, int operand2, String operand, int result)
    {
        return operand1 + " " + operand + " " + operand2 + " = " + result; 
    }
}
