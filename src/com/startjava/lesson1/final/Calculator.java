package com.startjava.lesson1.final;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 3;
        char action = '^';
        double result = 0.0;
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
        }
        System.out.println(num1 + " " + action + " " + num2 + " = " + result);
    }
}
