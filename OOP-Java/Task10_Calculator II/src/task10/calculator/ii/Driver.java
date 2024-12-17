package task10.calculator.ii;

public class Driver {

		 public static void main(String[] args) {
			 
		        Calculator calculator = new Calculator();

		        calculator.performOperation(10.5);
		        calculator.performOperation("+");
		        calculator.performOperation(5.2);
		        calculator.performOperation("*");
		        calculator.performOperation(10);
		        calculator.performOperation("=");

		        System.out.println("Result: " + calculator.getResult());

		        calculator.performOperation(100);
		        calculator.performOperation("/");
		        calculator.performOperation(4);
		        calculator.performOperation("-");
		        calculator.performOperation(10);
		        calculator.performOperation("=");

		        System.out.println("Result: " + calculator.getResult());
		    }
		}
