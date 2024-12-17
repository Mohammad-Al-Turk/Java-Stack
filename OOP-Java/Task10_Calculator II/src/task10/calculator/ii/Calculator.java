package task10.calculator.ii;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Double> operands = new ArrayList<>();
    private List<String> operations = new ArrayList<>();
    private double result = 0;
    
    
    public Calculator() {}

    
    public void performOperation(double operand) {
        operands.add(operand);
    }

    public void performOperation(String operation) {
        if (operation.equals("=")) {
            calculateResult();
        } 
        else {
            operations.add(operation);
        }
    }
    
    

    private void calculateResult() {
        for (int i = 0; i < operations.size(); i++) {
            if (operations.get(i).equals("*") || operations.get(i).equals("/")) {
                double operand1 = operands.get(i);
                double operand2 = operands.get(i + 1);
                double intermediateResult = 0;

                if (operations.get(i).equals("*")) {
                    intermediateResult = operand1 * operand2;
                } 
                else if (operations.get(i).equals("/")) {
                    intermediateResult = operand1 / operand2;
                }

                operands.set(i, intermediateResult);
                operands.remove(i + 1);
                operations.remove(i);
                i--;
            }
        }

        result = operands.get(0);
        for (int i = 0; i < operations.size(); i++) {
            if (operations.get(i).equals("+")) {
                result += operands.get(i + 1);
            } else if (operations.get(i).equals("-")) {
                result -= operands.get(i + 1);
            }
        }

        operands.clear();
        operations.clear();
    }

    public double getResult() {
        return result;
    }
}