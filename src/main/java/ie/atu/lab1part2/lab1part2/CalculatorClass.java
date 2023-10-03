package ie.atu.lab1part2.lab1part2;

public class CalculatorClass {
    private int val1;
    private int val2;
    private int result;

    public int getVal1() {
        return val1;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public int getVal2() {
        return val2;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public CalculatorClass(int num1, int num2, String operation) {
        this.val1 = num1;
        this.val2 = num2;

        switch(operation) {
            case "multiply":
                this.result = num1 + num2;
                break;

            case "Multiply":
                this.result = num1 + num2;
                break;

            case "Divide":
                this.result = num1 / num2;
                break;

            case "divide":
                this.result = num1 + num2;
                break;
        }

    }

}
