public class Calculator {
    private int num1;
    private int num2;
    private char action;
    private double result=0.0;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setAction(char action) {
        this.action = action;
    }

    public double calculate() {
        switch (action) {
            case ('+'):
                result = num1 + num2;
                break;
            case ('-'):
                result = num1 - num2;
                break;
            case ('*'):
                result = num1 * num2;
                break;
            case ('/'):
                result = (double) num1 / (double) num2;
                break;
            case ('%'):
                result = num1 % num2;
                break;
            case ('^'):
                result = num1;
                for (int i = 1; i < num2; i++) {
                    result *= num1;
                }
                break;
            default:
                System.out.println("Неверный знак");
        }
        return 0;
    }

    public String getResult() {
        return (num1 + " " + action + " " + num2 + " = " + result);
    }
}