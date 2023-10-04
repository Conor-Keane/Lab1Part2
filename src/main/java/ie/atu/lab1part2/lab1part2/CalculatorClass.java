package ie.atu.lab1part2.lab1part2;

public class CalculatorClass {
    private int val1;
    private int val2;
    private int result;

    public void setResult(int result) {
        this.result = result;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }

    public CalculatorClass(int num1, int num2, String operation) {
        setVal1(num1);
        setVal2(num2);

        switch(operation) {

            case "Multiply":
                setResult(num1 * num2);
                break;

            case "divide":
                setResult(num1 / num2);
                break;

            case "add":
                setResult(num1 + num2);
                break;

            case "Subtract":
                setResult(num1 - num2);
                break;
        }

    }

}
