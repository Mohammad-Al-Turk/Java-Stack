package task9.calculator.i;

public class Calculator {
	

    private double operandOne;
    private double operandTwo;
    private String operation;
    private double result;
    
    public Calculator() {}
    public Calculator(double operandOne,double operandTwo, String operation, double result) {
    	this.operandOne=operandOne;
    	this.operandTwo=operandTwo;
    	this.operation=operation;
    	this.result=result;
	}


    
    public void performOperation() {
        if (operation.equals("+")) {
            this.result = this.getOperandOne() + this.getOperandTwo();
        } else if (operation.equals("-")) {
            this.result = this.getOperandOne() - this.getOperandTwo();
        } else {
            System.out.println("Invalid operation. Please use '+' or '-'.");
        }
    }
    
    
    
    
	public double getOperandOne() {
		return operandOne;
	}


	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}


	public double getOperandTwo() {
		return operandTwo;
	}


	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}


	public String getOperation() {
		return operation;
	}


	public void setOperation(String operation) {
		this.operation = operation;
	}


	public double getResult() {
		return result;
	}


	public void setResult(double result) {
		this.result = result;
	}

    }