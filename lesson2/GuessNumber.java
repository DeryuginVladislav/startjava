import java.util.Scanner;

public class GuessNumber {
    private int computerNum;
    private String namePlayer1;
    private String namePlayer2;
    private int numPlayer1;
    private int numPlayer2;
    private Scanner scanner = new Scanner(System.in);

    public void setNamePlayer1(String namePlayer1) {
        this.namePlayer1 = namePlayer1;
    }

    public void setNamePlayer2(String namePlayer2) {
        this.namePlayer2 = namePlayer2;
    }

    private int enterNumPlayer1() {
        do {
            System.out.print(namePlayer1 + " введите число от 1 до 100: ");
            numPlayer1 = scanner.nextInt();
        } while (numPlayer1 < 1 || numPlayer1 > 100);
        return numPlayer1;
    }

    private int enterNumPlayer2() {
        do {
            System.out.print(namePlayer2 + " введите число от 1 до 100: ");
            numPlayer2 = scanner.nextInt();
        } while (numPlayer2 < 1 || numPlayer2 > 100);
        return numPlayer2;
    }

    private void compareNumsPlayer1() {
        if (numPlayer1 > computerNum) {
            System.out.println("Число " + numPlayer1 + " больше того, что загадал компьютер");
        } else if (numPlayer1 < computerNum) {
            System.out.println("Число " + numPlayer1 + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Игрок " + namePlayer1 + " победил, это число = " + numPlayer1);
        }
    }

    private void compareNumsPlayer2() {
        if (numPlayer2 > computerNum) {
            System.out.println("Число " + numPlayer2 + " больше того, что загадал компьютер");
        } else if (numPlayer2 < computerNum) {
            System.out.println("Число " + numPlayer2 + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Игрок " + namePlayer2 + " победил, это число = " + numPlayer2);
        }
    }

    public void start() {
        computerNum = 1 + (int) (Math.random() * 100);
        do {
            enterNumPlayer1();
            compareNumsPlayer1();
            if (numPlayer1 == computerNum) {
                break;
            }
            enterNumPlayer2();
            compareNumsPlayer2();
        } while (computerNum != numPlayer1 && computerNum != numPlayer2);
    }
}


