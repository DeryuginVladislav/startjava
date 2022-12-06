import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String answer = "yes";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.next());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.next());
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        do {
            guessNumber.start();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}
