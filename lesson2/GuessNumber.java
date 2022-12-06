import java.util.Scanner;

public class GuessNumber {
    private int computerNum;
    private Player player1;
    private Player player2;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        computerNum = 1 + (int) (Math.random() * 100);
        do {
            System.out.print(player1.getName() + " введите число от 1 до 100: ");
            player1.setNum(scanner.nextInt());

            if (player1.getNum() > computerNum) {
                System.out.println("Число " + player1.getNum() + " больше того, что загадал компьютер");
            } else if (player1.getNum() < computerNum) {
                System.out.println("Число " + player1.getNum() + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Игрок " + player1.getName() + " победил, это число = " + player1.getNum());
            }

            if (player1.getNum() == computerNum) {
                break;
            }

            System.out.print(player2.getName() + " введите число от 1 до 100: ");
            player2.setNum(scanner.nextInt());

            if (player2.getNum() > computerNum) {
                System.out.println("Число " + player2.getNum() + " больше того, что загадал компьютер");
            } else if (player2.getNum() < computerNum) {
                System.out.println("Число " + player2.getNum() + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Игрок " + player2.getName() + " победил, это число = " + player2.getNum());
            }
        } while (computerNum != player1.getNum() && computerNum != player2.getNum());
    }
}