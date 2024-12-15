package task9.calculator.i;

public class Driver {

	public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setOperandOne(10.5);
        calculator.setOperation("+");
        calculator.setOperandTwo(5.2);

        calculator.performOperation();
        System.out.println("Result: " + calculator.getResult());

        calculator.setOperandOne(20.0);
        calculator.setOperation("-");
        calculator.setOperandTwo(8.5);
        calculator.performOperation();
        System.out.println("Result: " + calculator.getResult());
    }
}

