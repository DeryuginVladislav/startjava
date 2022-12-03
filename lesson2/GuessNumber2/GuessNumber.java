import java.util.Scanner;

public class GuessNumber {
    private static int computerNum;
    private String name;
    private int numPlayer;
    private Scanner scanner = new Scanner(System.in);

    public void setName(String name) {
        this.name = name;
    }

    public void setNumPlayer(int numPlayer) {
        this.numPlayer = numPlayer;
    }

    public static void setComputerNum() {
        computerNum = 1 + (int) (Math.random() * 100);
    }

    public static int getComputerNum() {
        return computerNum;
    }

    public int getNumPlayer() {
        return numPlayer;
    }

    public void compareNums() {
        if (numPlayer > computerNum) {
            System.out.println("Число " + numPlayer + " больше того, что загадал компьютер");
        } else if (numPlayer < computerNum) {
            System.out.println("Число " + numPlayer + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Игрок " + name + " победил, это число = " + numPlayer);
        }
    }
}


