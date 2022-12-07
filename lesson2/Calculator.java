public class Calculator {
    private int num1;
    private int num2;
    private char operation;
    private double result;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setAction(char operation) {
        this.operation = operation;
    }

    public String calculate() {
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = (double) num1 / (double) num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                result = num1;
                for (int i = 1; i < num2; i++) {
                    result *= num1;
                }
                break;
            default:
                System.out.println("Неверный знак");
        }
        return (num1 + " " + operation + " " + num2 + " = " + result);
    }
}