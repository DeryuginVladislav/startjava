package com.startjava.lesson2_3.calculator;

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

    public double calculate() {
        System.out.print(num1 + " " + operation + " " + num2 + " = ");
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return (double) num1 / (double) num2;
            case '%':
                return num1 % num2;
            case '^':
                result = num1;
                for (int i = 1; i < num2; i++) {
                    result *= num1;
                }
                return result;
            default:
                System.out.println("Неверный знак");
                return 0;
        }
    }
}