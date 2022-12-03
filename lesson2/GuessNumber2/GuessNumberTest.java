import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String answer = "yes";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.next());

        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.next());

        GuessNumber guessNumberPlayer1 = new GuessNumber();
        GuessNumber guessNumberPlayer2 = new GuessNumber();
        guessNumberPlayer1.setName(player1.getName());
        guessNumberPlayer1.setName(player1.getName());

        do {
            GuessNumber.setComputerNum();
            do {
                guessNumberPlayer1.setNumPlayer(player1.setNum());
                guessNumberPlayer1.compareNums();
                if (guessNumberPlayer1.getNumPlayer() == GuessNumber.getComputerNum()) {
                    break;
                }
                guessNumberPlayer2.setNumPlayer(player2.setNum());
                guessNumberPlayer2.compareNums();
            } while (guessNumberPlayer1.getNumPlayer() != GuessNumber.getComputerNum() ||
                    guessNumberPlayer2.getNumPlayer() != GuessNumber.getComputerNum());
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.next();
            } while (!(answer.equals("yes") || answer.equals("no")));
        } while (answer.equals("yes"));
    }
}
