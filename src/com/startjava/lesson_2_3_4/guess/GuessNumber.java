package com.startjava.lesson_2_3_4.guess;
import java.util.Scanner;

public class GuessNumber {
    private int secretNum;
    private Player player1;
    private Player player2;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        secretNum = 1 + (int) (Math.random() * 100);
        do {
            System.out.print(player1.getName() + " введите число от 1 до 100: ");
            player1.setNum(scanner.nextInt());

            if (player1.getNum() > secretNum) {
                System.out.println("Число " + player1.getNum() + " больше того, что загадал компьютер");
            } else if (player1.getNum() < secretNum) {
                System.out.println("Число " + player1.getNum() + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Игрок " + player1.getName() + " победил, это число = " + player1.getNum());
                break;
            }

            System.out.print(player2.getName() + " введите число от 1 до 100: ");
            player2.setNum(scanner.nextInt());

            if (player2.getNum() > secretNum) {
                System.out.println("Число " + player2.getNum() + " больше того, что загадал компьютер");
            } else if (player2.getNum() < secretNum) {
                System.out.println("Число " + player2.getNum() + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Игрок " + player2.getName() + " победил, это число = " + player2.getNum());
                break;
            }
        } while (true);
    }
}