import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer = "yes";
        do {
            Calculator calculator = new Calculator();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            calculator.setNum1(scanner.nextInt());
            System.out.print("\nВведите второе число: ");
            calculator.setNum2(scanner.nextInt());
            System.out.print("\nВведите знак: ");
            calculator.setAction(scanner.next().charAt(0));
            calculator.calculate();
            System.out.println(calculator.getResult());
            do {
                System.out.println("\nХотите продолжить вычисления? [yes/no]:");
                answer = scanner.next();
            } while (!(answer.equals("yes") || answer.equals("no")));
        } while (answer.equals("yes"));
    }
}
